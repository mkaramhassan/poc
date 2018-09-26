package com.majidalfuttaim.www.hotels.rest.response.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */
@SuppressWarnings("serial")
@XmlRootElement
public class BaseResponse implements Serializable {
    @SuppressWarnings("compatibility:4868419594032985761")
    private static final long serialVersionUID = -6154162986828662979L;


    public BaseResponse() {
        super();
    }

    private Boolean success = true;
    private Boolean hasAlert = false;
    private String message = "";
    private String errorCode = "";


    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setHasAlert(Boolean hasAlert) {
        this.hasAlert = hasAlert;
    }

    public Boolean getHasAlert() {
        return hasAlert;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
