package com.majidalfuttaim.www.hotels.rest.model.clients.crazyhotel;


/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

public class CrazyHotel {
    public CrazyHotel() {
        super();
    }
    private String hotelName;
    private String rate;
    private float price;
    private float discount;
    private String[] amenities;


    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getRate() {
        return rate;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setAmenities(String[] amenities) {
        this.amenities = amenities;
    }

    public String[] getAmenities() {
        return amenities;
    }
}
