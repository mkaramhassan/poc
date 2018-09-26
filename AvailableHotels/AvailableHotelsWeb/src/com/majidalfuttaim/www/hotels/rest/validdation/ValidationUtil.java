package com.majidalfuttaim.www.hotels.rest.validdation;

import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;
import com.majidalfuttaim.www.hotels.rest.request.search.SearchHotelRequest;


/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

public class ValidationUtil {
    public ValidationUtil() {
        super();
    }

    public static void validateSearchHotelRequest(SearchHotelRequest request) throws HotelsException {
        //Validate mandatory fields
        //Validate date patterns and  start/end date
        //Validate city codes
        //Validate number of adults
    }
}
