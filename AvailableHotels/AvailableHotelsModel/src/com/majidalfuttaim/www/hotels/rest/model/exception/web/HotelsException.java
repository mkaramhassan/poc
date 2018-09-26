package com.majidalfuttaim.www.hotels.rest.model.exception.web;

import com.majidalfuttaim.www.hotels.rest.model.exception.common.BaseException;

import java.util.List;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 * This is a generic exception which will wrap ( Integration exception database exception ... etc )
 */
public class HotelsException extends BaseException {
    @SuppressWarnings("compatibility:-5210087124101657984")
    private static final long serialVersionUID = -4809886827416640114L;


    private String errorMessage;

    public HotelsException() {

    }

    public HotelsException(String errorCode) {
        super(errorCode);

    }

    public HotelsException(List<String> errorMsg) {
        super(errorMsg);

    }

    public HotelsException(String errorCode, List<String> errorMsg) {
        super(errorCode, errorMsg);

    }

    public HotelsException(String errorCode, String errorMessage) {
        super(errorCode);
        this.errorMessage = errorMessage;

    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
