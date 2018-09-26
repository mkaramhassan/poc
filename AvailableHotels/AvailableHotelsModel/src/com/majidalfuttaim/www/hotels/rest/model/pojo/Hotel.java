package com.majidalfuttaim.www.hotels.rest.model.pojo;

import java.io.Serializable;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

@SuppressWarnings("serial")
@XmlRootElement
public class Hotel implements Serializable {
    public Hotel() {
        super();
    }

    public Hotel(String provider) {
        super();
        this.provider = provider;
    }
    private String provider;
    private String name;
    private int rate;
    private float fare;
    private float discount = 0f;
    private List<String> amenities;


    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getProvider() {
        return provider;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRate() {
        return rate;
    }

    public void setFare(float fare) {
        this.fare = fare;
    }

    public float getFare() {
        return fare;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }

    public List<String> getAmenities() {
        return amenities;
    }
}
