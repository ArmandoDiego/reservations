package com.diego.reservations.web.application;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.diego.reservations.busines.domian.RoomReservation;
import com.diego.reservations.busines.service.ReservationService;
import com.diego.reservations.data.repository.RoomRepository;

@Controller
@RequestMapping(value="/reservations")
public class ReservationController {
      @Autowired
      private ReservationService reservationService;
	
	  @Autowired
	  private RoomRepository repository;
    
//    @RequestMapping(value="/rooms", method= RequestMethod.GET)
//    List<Room> findAll(@RequestParam(required=false) String roomNumber){
//       List<Room> rooms = new ArrayList<>();
//        if(null==roomNumber){
//            Iterable<Room> results = this.repository.findAll();
//            results.forEach(room-> {rooms.add(room);});
//        }else{
//            Room room = this.repository.findByNumber(roomNumber);
//            if(null!=room) {
//                rooms.add(room);
//            }
//        }
//        return rooms;
//    }
    

//    @RequestMapping(method= RequestMethod.GET)
//    public String getReservations(@RequestParam(value="date", required=false)String dateString, Model model){
//        Date date = null;
//        if(null!=dateString) {
//            try {
//                date = DATE_FORMAT.parse(dateString);
//            } catch (ParseException pe) {
//                date = new Date();
//            }
//        }else{
//            date = new Date();
//        }
//        List<RoomReservation> roomReservationList = this.reservationService.getRoomReservationsForDate(date);
//        model.addAttribute("roomReservations", roomReservationList);
//        return "reservations";
//    }
	  
	@RequestMapping(method= RequestMethod.GET)
    public String getReservations(@RequestParam(value="date", required=false) String dateString, Model model){
		List<RoomReservation> roomReservationList=this.reservationService.getRoomReservationsForDate(dateString);
		model.addAttribute("roomReservations", roomReservationList);
        return "reservations";
    }
}
