package com.majidalfuttaim.www.hotels.rest.model.exception.common;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

public class BaseException extends Throwable {
    @SuppressWarnings("compatibility:-3791515903728829747")
    private static final long serialVersionUID = 1647409806234734533L;

    String errorCode;
    List<String> errorMsg = new ArrayList<String>();

    public BaseException() {
        super();
    }

    public BaseException(String errorCode) {
        super();
        this.errorCode = errorCode;
    }

    public BaseException(List<String> errorMsg) {
        super();
        this.errorMsg = errorMsg;
    }

    public BaseException(String errorCode, List<String> errorMsg) {
        super();
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }


    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorMsg(List<String> errorMsg) {
        this.errorMsg = errorMsg;
    }

    public List<String> getErrorMsg() {
        return errorMsg;
    }


}
