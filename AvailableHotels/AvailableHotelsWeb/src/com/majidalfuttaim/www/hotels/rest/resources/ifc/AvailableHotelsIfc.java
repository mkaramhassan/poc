package com.majidalfuttaim.www.hotels.rest.resources.ifc;

import com.majidalfuttaim.www.hotels.rest.ifc.ConstantsIfc;
import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;
import com.majidalfuttaim.www.hotels.rest.request.search.SearchHotelRequest;

import javax.ws.rs.core.Response;


/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

public interface AvailableHotelsIfc extends ConstantsIfc {

    Response searchHotels(SearchHotelRequest request) throws HotelsException;
}
