package com.majidalfuttaim.www.hotels.rest.model.exception.client;

import com.majidalfuttaim.www.hotels.rest.model.exception.web.HotelsException;

import java.util.List;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */
public class BestHotelsException extends HotelsException {
    @SuppressWarnings("compatibility:2528122314284288800")
    private static final long serialVersionUID = 2270077874092106025L;


    public BestHotelsException() {
        super();
    }

    public BestHotelsException(String errorCode) {
        super(errorCode);

    }

    public BestHotelsException(List<String> errorMsg) {
        super(errorMsg);

    }

    public BestHotelsException(String errorCode, List<String> errorMsg) {
        super(errorCode, errorMsg);

    }

    public BestHotelsException(String errorCode, String errorMessage) {
        super.setErrorCode(errorCode);
        super.setErrorMessage(errorMessage);

    }

}
