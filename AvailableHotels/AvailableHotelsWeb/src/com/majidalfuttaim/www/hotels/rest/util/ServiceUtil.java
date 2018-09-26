package com.majidalfuttaim.www.hotels.rest.util;

import com.majidalfuttaim.www.hotels.rest.ifc.ConstantsIfc;
import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;

import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Variant;

public class ServiceUtil implements ConstantsIfc {
    public ServiceUtil() {
        super();
    }

    public static List<Variant> getResponseVariants() throws HotelsException {
        List<Variant> responseVariants = null;
        try {
            responseVariants =
                Variant.mediaTypes(MediaType.valueOf(MediaType.APPLICATION_JSON),
                                   MediaType.valueOf(MediaType.APPLICATION_XML + ";charset=UTF-8"),
                                   MediaType.valueOf(MediaType.APPLICATION_XML + ";charset=shift_jis"), MediaType.valueOf(MediaType.APPLICATION_FORM_URLENCODED))
                       .encodings("gzip", "identity", "deflate")
                       .add()
                       .build();
        } catch (Exception ex) {
            // The below is just a sample as it shouldn't be hard coded and should be loaded from either properties/db
            throw new HotelsException("HOTEL_RESPONSE_VARIANT", "Invalid response variant");
        }
        return responseVariants;
    }

    public static int getStatusCode(Variant bestResponseVariant) throws HotelsException {
        int statusCode = OK_STATUS_CODE;

        try {
            if (bestResponseVariant == null) {
                statusCode = NOT_ACCEPTABLE_STATUS_CODE;
            } else {
                MediaType responseMediaType = bestResponseVariant.getMediaType();

                if (responseMediaType.isCompatible(MediaType.APPLICATION_XML_TYPE)) {
                    //entity in XML format
                    statusCode = OK_STATUS_CODE;
                } else if (responseMediaType.isCompatible(MediaType.APPLICATION_JSON_TYPE)) {
                    //entity in JSON format
                    statusCode = OK_STATUS_CODE;
                } else if (responseMediaType.isCompatible(MediaType.APPLICATION_FORM_URLENCODED_TYPE)) {
                    //entity submitted from form
                    statusCode = OK_STATUS_CODE;
                } else {
                    statusCode = NOT_ACCEPTABLE_STATUS_CODE;
                }

            }
        } catch (Exception ex) {
            // The below is just a sample as it shouldn't be hard coded and should be loaded from either properties/db
            throw new HotelsException("HOTEL_RESPONSE_VARIANT", "Invalid response variant");
        }
        return statusCode;
    }

    public static String getMediaType(Variant bestResponseVariant) throws HotelsException {
        String mediaType = MediaType.APPLICATION_JSON;
        try {
            if (bestResponseVariant != null) {

                MediaType responseMediaType = bestResponseVariant.getMediaType();

                if (responseMediaType.isCompatible(MediaType.APPLICATION_XML_TYPE)) {
                    //entity in XML format
                    mediaType = MediaType.APPLICATION_XML;
                }
            }
        } catch (Exception ex) {
            // The below is just a sample as it shouldn't be hard coded and should be loaded from either properties/db
            throw new HotelsException("HOTEL_RESPONSE_VARIANT", "Invalid response variant");
        }
        return mediaType;
    }


    public static Response getWsResponse(int statusCode, String status, String mediaType,
                                         Object response) throws HotelsException {
        return Response.status(statusCode)
                       .type(mediaType)
                       .header(RESPONSE_STATUS_HEADER_NAME, status)
                       .entity(response)
                       .build();
    }


}
