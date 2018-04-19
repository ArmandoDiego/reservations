package com.diego.reservations;
//
//import java.text.DateFormat;
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//import com.diego.reservations.busines.domian.RoomReservation;
//import com.diego.reservations.busines.service.ReservationService;
//import com.diego.reservations.web.application.ReservationController;
//
//import jdk.nashorn.internal.ir.annotations.Ignore;
//
//import static org.mockito.BDDMockito.given;
//import static org.hamcrest.CoreMatchers.containsString;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;;
//
////
////@RunWith(SpringJUnit4ClassRunner.class)
////@WebMvcTest(ReservationController.class)
//public class ReservationControllerTest {
//
////	@MockBean
////	private ReservationService reservationService;
////	@Autowired
////	private MockMvc mockMv;
////	
////	
////	private static final DateFormat DATE_FORMAT =new SimpleDateFormat("yyyy-MM-dd");
//	
//	
////	@Test
////	public void getReservations() throws Exception {
////		Date date= DATE_FORMAT.parse("2017-01-01");
////		List<RoomReservation> mockReservationList = new ArrayList<>();
////		RoomReservation roomReservation=new RoomReservation();
////		roomReservation.setFirstName("Test");
////		roomReservation.setFirstName("JUnit");
////		roomReservation.setDate(date);
////		roomReservation.setGuestId(1);
////		roomReservation.setRoomNumber("J1");
////		roomReservation.setRoomId(100);
////		roomReservation.setRoomName("JUnit Room");
////		mockReservationList.add(roomReservation);
////		
////		given(reservationService.getRoomReservationsForDate("2017-01-01")).willReturn(mockReservationList);
////		this.mockMv.perform(get("/reservatios?date=2017-01-01")).andExpect(status().isOk()).andExpect(content().string(containsString("Test, JUnit")));
////	}
//	
//	
//	
//	
//	
//}
