package com.majidalfuttaim.www.hotels.rest.model.exception.client;

import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;

import java.util.List;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */
public class CrazyHotelsException extends HotelsException {
    @SuppressWarnings("compatibility:-4859099896511746692")
    private static final long serialVersionUID = 3348588470994843393L;


    public CrazyHotelsException() {
        super();
    }

    public CrazyHotelsException(String errorCode) {
        super(errorCode);

    }

    public CrazyHotelsException(List<String> errorMsg) {
        super(errorMsg);

    }

    public CrazyHotelsException(String errorCode, List<String> errorMsg) {
        super(errorCode, errorMsg);

    }

    public CrazyHotelsException(String errorCode, String errorMessage) {
        super.setErrorCode(errorCode);
        super.setErrorMessage(errorMessage);

    }

}
