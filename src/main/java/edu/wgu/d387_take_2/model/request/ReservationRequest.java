package edu.wgu.d387_take_2.model.request;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

/**
 * Project: D387_take_2
 * Package: edu.wgu.d387_take_2.model.request
 * <p>
 * User: carolyn.sher
 * Date: 8/4/2022
 * Time: 9:21 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ReservationRequest {

    private Long id;
   // private Long roomId;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkin;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate checkout;

    public ReservationRequest() {
    }

//    public ReservationRequest(Long id, Long roomId, LocalDate checkin, LocalDate checkout) {
//        this.id = id;
//        this.roomId = roomId;
//        this.checkin = checkin;
//        this.checkout = checkout;
//    }
        public ReservationRequest(Long id,LocalDate checkin, LocalDate checkout) {
        this.id = id;
//        this.roomId = roomId;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

//    public Long getRoomId() {
//        return roomId;
//    }
//
//    public void setRoomId(Long roomId) {
//        this.roomId = roomId;
//    }

    public LocalDate getCheckin() {
        return checkin;
    }

    public void setCheckin(LocalDate checkin) {
        this.checkin = checkin;
    }

    public LocalDate getCheckout() {
        return checkout;
    }

    public void setCheckout(LocalDate checkout) {
        this.checkout = checkout;
    }

}
