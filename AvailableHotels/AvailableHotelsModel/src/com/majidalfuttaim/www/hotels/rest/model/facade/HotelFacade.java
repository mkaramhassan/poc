package com.majidalfuttaim.www.hotels.rest.model.facade;

import com.majidalfuttaim.www.hotels.rest.model.clients.besthotel.BestHotel;
import com.majidalfuttaim.www.hotels.rest.model.clients.besthotel.BestHotelClient;
import com.majidalfuttaim.www.hotels.rest.model.clients.crazyhotel.CrazyHotel;
import com.majidalfuttaim.www.hotels.rest.model.clients.crazyhotel.CrazyHotelsClient;
import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;
import com.majidalfuttaim.www.hotels.rest.model.pojo.Hotel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

public class HotelFacade {
    public HotelFacade() {
        super();
    }

    /**
     * Used to search hotels using the below parameters
     * @param fromDate
     * @param toDate
     * @param city
     * @param numberOfAdults
     * @return
     * @throws HotelsException
     */
    public List<Hotel> searchHotels(String fromDate, String toDate, String city,
                                    int numberOfAdults) throws HotelsException {
        List<Hotel> hotelList = null;
        List<BestHotel> bHotelList = null;
        List<CrazyHotel> cHotelList = null;

        try {
            // Get Best hotels list from webservice client
            BestHotelClient bClient = new BestHotelClient();
            bHotelList = bClient.searchHotels(fromDate, toDate, city, numberOfAdults);

            // Get Crazy hotels list from webservice client
            CrazyHotelsClient cClient = new CrazyHotelsClient();
            cHotelList = cClient.searchHotels(fromDate, toDate, city, numberOfAdults);

            //Add more providers here if needed

        } catch (HotelsException ex) {
            throw ex;
        }
        try {
            if (bHotelList != null && cHotelList != null) {
                hotelList = new ArrayList<Hotel>();
                // Mapping for best hotels pojo to rest pojo
                hotelList.addAll(transformBestHotel(bHotelList));
                // Mapping for crazy hotels pojo to rest pojo
                hotelList.addAll(transformCrazyHotel(cHotelList));
            }

        } catch (HotelsException ex) {
            throw ex;
        }

        return hotelList;
    }

    /**
     * Used to convert BestHotel pojo to Hotel
     * @param bHotelList
     * @return
     * @throws HotelsException
     */
    private List<Hotel> transformBestHotel(List<BestHotel> bHotelList) throws HotelsException {
        List<Hotel> hotelList = new ArrayList<Hotel>();
        try {
            for (BestHotel cHotel : bHotelList) {
                Hotel hotel = new Hotel("BestHotels");
                hotel.setName(cHotel.getHotel());
                hotel.setRate(cHotel.getRate());
                hotel.setFare(cHotel.getFare());
                String[] amentitiesArr = null;
                if (cHotel.getRoomAmenities().contains(",")) {
                    amentitiesArr = new String[] { cHotel.getRoomAmenities() };
                } else {
                    amentitiesArr = cHotel.getRoomAmenities().split(",");
                }
                hotel.setAmenities(Arrays.asList(amentitiesArr));

                hotelList.add(hotel);
            }
        } catch (Exception ex) {
            throw new HotelsException(ex.getMessage());
        }
        return hotelList;
    }

    /**
     * Used to convert CrazyHotel pojo to Hotel
     * @param cHotelList
     * @return
     * @throws HotelsException
     */
    private List<Hotel> transformCrazyHotel(List<CrazyHotel> cHotelList) throws HotelsException {
        List<Hotel> hotelList = new ArrayList<Hotel>();
        try {
            for (CrazyHotel cHotel : cHotelList) {
                Hotel hotel = new Hotel("CrazyHotels");
                hotel.setName(cHotel.getHotelName());
                hotel.setRate(getHotelRate(cHotel.getRate()));
                hotel.setFare(cHotel.getPrice());
                hotel.setDiscount(cHotel.getDiscount());
                hotel.setAmenities(Arrays.asList(cHotel.getAmenities()));

                hotelList.add(hotel);
            }
        } catch (Exception ex) {
            throw new HotelsException(ex.getMessage());
        }
        return hotelList;
    }

    /**
     * Used to convert hotel rating stars to number
     * @param rate
     * @return
     */
    private int getHotelRate(String rate) {
        long count = 0;
        count = rate.chars()
                    .filter(ch -> ch == '*')
                    .count();

        return (int) count;
    }

}
