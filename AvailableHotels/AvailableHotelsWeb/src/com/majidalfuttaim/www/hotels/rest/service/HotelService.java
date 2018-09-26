package com.majidalfuttaim.www.hotels.rest.service;

import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;
import com.majidalfuttaim.www.hotels.rest.model.facade.HotelFacade;
import com.majidalfuttaim.www.hotels.rest.model.pojo.Hotel;
import com.majidalfuttaim.www.hotels.rest.request.search.SearchHotelRequest;
import com.majidalfuttaim.www.hotels.rest.response.search.SearchHotelResponse;
import com.majidalfuttaim.www.hotels.rest.validdation.ValidationUtil;

import java.util.List;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

public class HotelService {

    public HotelService() {
        super();
    }

    public SearchHotelResponse searchHotels(SearchHotelRequest request) throws HotelsException {
        SearchHotelResponse response = new SearchHotelResponse();
        try {
            //Validate request
            ValidationUtil.validateSearchHotelRequest(request);
            // Get list of hotels
            HotelFacade facade = new HotelFacade();
            List<Hotel> hotelList =
                facade.searchHotels(request.getFromDate(), request.getToDate(), request.getCity(),
                                    request.getNumberOfAdults());
            response.setHotelList(hotelList);
        } catch (HotelsException ex) {
            response.setSuccess(false);
            response.setErrorCode("SEARCH_HOTEL_ERROR_1");
        } catch (Exception ex) {
            response.setSuccess(false);
            response.setErrorCode("SEARCH_HOTEL_ERROR_2");
        }
        return response;
    }


}
