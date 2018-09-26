package com.majidalfuttaim.www.hotels.rest.request.search;

import com.majidalfuttaim.www.hotels.rest.request.common.BaseRequest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */
@SuppressWarnings("serial")
@XmlRootElement
public class SearchHotelRequest extends BaseRequest {
    @SuppressWarnings("compatibility:974238573319392957")
    private static final long serialVersionUID = -8265580362949029381L;

    public SearchHotelRequest(String language, String channel) {
        super(language, channel);
    }

    public SearchHotelRequest() {
        super();
    }

    private String fromDate;
    private String toDate;
    private String city;
    private Integer numberOfAdults;


    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setNumberOfAdults(Integer numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public Integer getNumberOfAdults() {
        return numberOfAdults;
    }
}
