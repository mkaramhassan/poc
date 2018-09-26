package com.majidalfuttaim.www.hotels.rest.model.clients.crazyhotel;

import com.majidalfuttaim.www.hotels.rest.model.exception.client.CrazyHotelsException;
import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

public class CrazyHotelsClient {
    public CrazyHotelsClient() {
        super();
    }

    public List<CrazyHotel> searchHotels(String fromDate, String toDate, String city,
                                         int numberOfAdults) throws HotelsException {
        List<CrazyHotel> hotelList = null;
        try {
            // Call web service client using search parameters and get List of crazy hotels

            hotelList = new ArrayList<CrazyHotel>();

        } catch (Exception ex) {
            throw new CrazyHotelsException(ex.getMessage());
        }
        return hotelList;
    }
}
