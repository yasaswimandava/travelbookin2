package com.mindtree.travelbookingapplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.travelbookingapplication.entity.Booking;
import com.mindtree.travelbookingapplication.entity.User;
import com.mindtree.travelbookingapplication.service.BookingService;
import com.mindtree.travelbookingapplication.service.DaysService;
import com.mindtree.travelbookingapplication.service.TrainService;
import com.mindtree.travelbookingapplication.service.UserService;

@Controller
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	TrainService trainService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	DaysService daysService;
	
	
	@RequestMapping("/")
	public String viewHomePage()
	{
		return "index";
	}
	
	
	
//	@RequestMapping("/search")
//	public String search(@ModelAttribute(name="trains") Train train,Model model)
//	{
//		//System.out.println(train.getTrainName());
//		List<Train> trains=trainService.getAllTrains();
//		List<Days> days=daysService.getAllDays();
//		
//		model.addAttribute("trains", trains);
//		model.addAttribute("days", days);
//		return "availability";
//	}
	
//	@RequestMapping("/viewtravelhistory")
//	public String viewHistory(Model model)
//	{
//		List<User> users= userService.getAllUsers();
//		model.addAttribute("users", users);
//		return "view";
//	}
	
	@RequestMapping("/viewtravelhistory")
	public ModelAndView viewHistory()
	{
		ModelAndView mav=new ModelAndView("view");
		List<User> users= userService.getAllUsers();
		User user=new User();
		mav.addObject("users", users);
		mav.addObject("user", user);
		return mav;
	}
	
	@RequestMapping(value="/getdetails",method= {RequestMethod.GET})
	public String details(@ModelAttribute(name="user") User user, Model model)
	{
		List<Booking> bookinglist=new ArrayList<Booking>();
		List<Booking> bookings=bookingService.getAllBookings();
		for (Booking b : bookings) {
			if(b.getUsers().getUserId()==user.getUserId())
			{
				bookinglist.add(b);
			}
		}
		
		model.addAttribute("bookinglist", bookinglist);
		return "view";
	}
//	
//	@RequestMapping("/checktrains")
//	public String checkTrains(Model model)
//	{
//		List<Train> trains=trainService.getAllTrains();
//	
//		model.addAttribute("trains", trains);
//		return "checktrains";
//	}
	
	
	
	
	
	
	
	
	
	
	

}
