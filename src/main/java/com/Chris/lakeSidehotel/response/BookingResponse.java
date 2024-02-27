package com.Chris.lakeSidehotel.response;

import com.Chris.lakeSidehotel.model.Room;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookingResponse {

    private Long bookingId;


    private LocalDate checkInDate;


    private LocalDate checkOutDate;


    private String guestName;


    private String guestEmail;

    private int  numOfAdults;

    private int  numOfChildren;

    private int  totalNumOfGuest;

    private String bookingConfirmationCode;

    private RoomResponse Room;

    public BookingResponse(Long bookingId, LocalDate checkInDate, LocalDate checkOutDate, String bookingConfirmationCode) {
        this.bookingId = bookingId;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.bookingConfirmationCode = bookingConfirmationCode;
    }




}
