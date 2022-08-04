package edu.wgu.d387_take_2.rest;

import edu.wgu.d387_take_2.model.request.ReservationRequest;
import edu.wgu.d387_take_2.model.response.ReservationResponse;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Optional;

/**
 * Project: D387_take_2
 * Package: edu.wgu.d387_take_2.rest
 * <p>
 * User: carolyn.sher
 * Date: 7/30/2022
 * Time: 3:52 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping(ResourceConstants.ROOM_RESERVATION_V1)
public class ReservationResource {
    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponse>getAvailableRooms(
            @RequestParam (value="checkin")
            @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
            LocalDate checkin,
            @RequestParam(value="checkout")
            @DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
            LocalDate checkout){
        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponse> createReservation(
            @RequestBody
            ReservationRequest reservationRequest) {

//        ReservationEntity reservationEntity = conversionService.convert(reservationRequest, ReservationEntity.class);
//        reservationRepository.save(reservationEntity);
//
//        Optional<RoomEntity> result  = roomRepository.findById(reservationRequest.getRoomId());
//        RoomEntity roomEntity= null;
//
//        if (result.isPresent()) {
//            roomEntity= result.get();
//        }
//        else {
//            // we didn't find the employee
//            //throw new RuntimeException("Did not find part id - " + theId);
//            return null;
//        }
//
//        roomEntity.addReservationEntity(reservationEntity);
//        roomRepository.save(roomEntity);
//        reservationEntity.setRoomEntity(roomEntity);
//
//        ReservationResponse reservationResponse =
//                conversionService.convert(reservationEntity, ReservationResponse.class);
//

 //       return new ResponseEntity<>(reservationResponse, HttpStatus.CREATED);
        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.CREATED);
    }
    @RequestMapping(path = "", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ReservationResponse> updateReservation(
            @RequestBody
            ReservationRequest reservationRequest) {

        return new ResponseEntity<>(new ReservationResponse(), HttpStatus.OK);
    }
    @RequestMapping(path = "/{reservationId}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteReservation(
            @PathVariable
            long reservationId) {

        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
