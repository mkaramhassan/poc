package com.majidalfuttaim.www.hotels.rest.resources.impl;

import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;
import com.majidalfuttaim.www.hotels.rest.request.search.SearchHotelRequest;
import com.majidalfuttaim.www.hotels.rest.resources.ifc.AvailableHotelsIfc;
import com.majidalfuttaim.www.hotels.rest.response.search.SearchHotelResponse;
import com.majidalfuttaim.www.hotels.rest.service.HotelService;
import com.majidalfuttaim.www.hotels.rest.util.ServiceUtil;

import javax.servlet.http.HttpServletRequest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Variant;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */
@Path("hotels/v1")
@Produces(MediaType.APPLICATION_JSON)
public class AvailableHotelsImpl implements AvailableHotelsIfc {
    public AvailableHotelsImpl() {
        super();
    }
    @Context
    private Request restRequest;
    @Context
    private HttpServletRequest httpRequest;
    private HotelService service = new HotelService();

    int statusCode = RESPONSE_DEFAULT_STATUS_CODE;
    String status = RESPONSE_SUCCESS_STATUS;
    String mediaType = MediaType.APPLICATION_JSON;
    Variant bestResponseVariant = null;

    public void init() throws HotelsException {
        bestResponseVariant = restRequest.selectVariant(ServiceUtil.getResponseVariants());
        mediaType = ServiceUtil.getMediaType(bestResponseVariant);
        statusCode = ServiceUtil.getStatusCode(bestResponseVariant);
    }

    @Override
    @POST
    @Path("/search")
    @Consumes({ MediaType.APPLICATION_JSON })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response searchHotels(SearchHotelRequest request) throws HotelsException {

        // Initialize response variant and status code as per request headers
        init();

        // Call hotel service and get search hotel response
        SearchHotelResponse response = service.searchHotels(request);

        // Get rest service response as per status code , status , mediaType and
        return ServiceUtil.getWsResponse(statusCode, status, mediaType, response);
    }
}
