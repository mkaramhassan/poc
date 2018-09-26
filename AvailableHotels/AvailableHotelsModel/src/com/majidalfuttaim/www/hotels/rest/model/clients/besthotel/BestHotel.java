package com.majidalfuttaim.www.hotels.rest.model.clients.besthotel;


/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */

public class BestHotel {
    public BestHotel() {
        super();
    }

    private String hotel;
    private int rate;
    private float fare;
    private String roomAmenities;


    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getHotel() {
        return hotel;
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

    public void setRoomAmenities(String roomAmenities) {
        this.roomAmenities = roomAmenities;
    }

    public String getRoomAmenities() {
        return roomAmenities;
    }
}
