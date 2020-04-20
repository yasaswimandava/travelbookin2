package com.mindtree.travelbookingapplication.controller;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.mindtree.travelbookingapplication.dto.SearchTrainDTO;
import com.mindtree.travelbookingapplication.entity.Train;
import com.mindtree.travelbookingapplication.entity.User;
import com.mindtree.travelbookingapplication.service.BookingService;
import com.mindtree.travelbookingapplication.service.TrainService;
import com.mindtree.travelbookingapplication.service.UserService;

@Controller
public class TrainController {
	
	@Autowired
	private TrainService trainService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private BookingService bookingService;
	
	private Train train;
	@RequestMapping("/booktickets")
	public ModelAndView book()
	{
		ModelAndView mav=new ModelAndView("booking");
		List<Train> trains=trainService.getAllTrains();
		mav.addObject("trains", trains);
		mav.addObject("searchDTO", new SearchTrainDTO());
		return mav;
	}
	
	
	
	@RequestMapping("/search")
	public ModelAndView availability(@ModelAttribute SearchTrainDTO searchTrainDTO)
	{
		ModelAndView mav=new ModelAndView("availability");
		Map<String,List<Train>> trainlist=trainService.getTrains(searchTrainDTO);
		mav.addObject("trainlist", trainlist);
		return mav;
	}
	
	@RequestMapping("/checktrains")
	public ModelAndView checkTrain(@ModelAttribute("searchDTO") SearchTrainDTO searchTrainDTO)
	{
		ModelAndView mav=new ModelAndView("checktrains");
		Map<String,List<Train>> trainlist=trainService.getTrains();
		mav.addObject("trainlist", trainlist);
		return mav;
	}
	
	@RequestMapping("/booktrain/{trainId}")
	public ModelAndView bookingTrain(@PathVariable long trainId) {
		ModelAndView mav=new ModelAndView("booktrain");
		train=trainService.getTrains(trainId);
		List<User> userList=userService.getAllUsers();
		User user=new User();
		mav.addObject("userList", userList);
		mav.addObject("user", user);
		return mav;
	}
	@RequestMapping(value="/save",method= {RequestMethod.POST})
	public String saveBooking(@RequestParam(name="userId")User user, Model model) {
		
		bookingService.saveBooking(user,train);
		return "/index";
		
	}

}
