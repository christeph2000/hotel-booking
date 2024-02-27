package com.Chris.lakeSidehotel.repository;

import com.Chris.lakeSidehotel.model.BookedRoom;
import com.Chris.lakeSidehotel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<BookedRoom, Long> {
BookedRoom findByBookingConfirmationCode(String confirmationCode);
List<BookedRoom> findByRoomId(Long roomId);
}
