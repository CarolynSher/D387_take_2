package edu.wgu.d387_take_2.model.response;

import edu.wgu.d387_take_2.model.Links;

/**
 * Project: D387_take_2
 * Package: edu.wgu.d387_take_2.model.response
 * <p>
 * User: carolyn.sher
 * Date: 7/30/2022
 * Time: 4:05 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ReservationResponse {
    private Long id;
    private Integer roomNumber;
    private Integer price;
    private Links links;

    public ReservationResponse(Integer roomNumber, Integer price) {
        this.roomNumber = roomNumber;
        this.price = price;
    }

    public ReservationResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }
}
