package com.majidalfuttaim.www.hotels.rest.request.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */
@SuppressWarnings("serial")
@XmlRootElement
public class BaseRequest implements Serializable {
    @SuppressWarnings("compatibility:-5813123066370394313")
    private static final long serialVersionUID = -3170324586383298367L;


    public BaseRequest() {
        super();
    }

    public BaseRequest(String language, String channel) {
        super();
        this.language = language;
        this.channel = channel;
    }

    private String language;
    private String channel;


    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLanguage() {
        return language;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getChannel() {
        return channel;
    }
}
