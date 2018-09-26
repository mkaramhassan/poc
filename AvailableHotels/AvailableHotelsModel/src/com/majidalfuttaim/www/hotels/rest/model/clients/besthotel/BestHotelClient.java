package com.majidalfuttaim.www.hotels.rest.model.clients.besthotel;

import com.majidalfuttaim.www.hotels.rest.model.exception.client.BestHotelsException;
import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

public class BestHotelClient {
    public BestHotelClient() {
        super();
    }

    public List<BestHotel> searchHotels(String fromDate, String toDate, String city,
                                        int numberOfAdults) throws HotelsException {
        List<BestHotel> hotelList = null;
        try {
            // Call web service client using search parameters and get List of bestHotels

            hotelList = new ArrayList<BestHotel>();

        } catch (Exception ex) {
            throw new BestHotelsException(ex.getMessage());
        }
        return hotelList;
    }
}
