package com.majidalfuttaim.www.hotels.rest.ifc;

import javax.ws.rs.core.Response;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */
public interface ConstantsIfc {

    public static final String ENGLISH_LANGUAGE_TEXT = "en";
    public static final String ARABIC_LANGUAGE_TEXT = "ar";

    public static final String RESPONSE_SUCCESS_STATUS = "SUCCESS";
    public static final String RESPONSE_FAILURE_STATUS = "FAILURE";
    public static final int RESPONSE_DEFAULT_STATUS_CODE = -1;

    public static final String RESPONSE_STATUS_HEADER_NAME = "STATUS";
    public static final String RESPONSE_ACCESS_CONTROL_HEADER_NAME = "Access-Control-Allow-Headers";
    public static final String RESPONSE_ACCESS_CONTROL_VALUE = "*";

    public static final int OK_STATUS_CODE = Response.Status
                                                     .OK
                                                     .getStatusCode();

    public static final int NOT_ACCEPTABLE_STATUS_CODE = Response.Status
                                                                 .NOT_ACCEPTABLE
                                                                 .getStatusCode();
}
