package com.majidalfuttaim.www.hotels.rest.response.search;

import com.majidalfuttaim.www.hotels.rest.model.pojo.Hotel;
import com.majidalfuttaim.www.hotels.rest.response.common.BaseResponse;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Mohammed KaramAllah
 * @since 19 September 2018
 */
@SuppressWarnings("serial")
@XmlRootElement
public class SearchHotelResponse extends BaseResponse {
    @SuppressWarnings("compatibility:6773712687792252323")
    private static final long serialVersionUID = -3073251768526985769L;

    public SearchHotelResponse() {
        super();
    }
    List<Hotel> hotelList = new ArrayList<Hotel>();


    public void setHotelList(List<Hotel> hotelList) {
        this.hotelList = hotelList;
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

}
