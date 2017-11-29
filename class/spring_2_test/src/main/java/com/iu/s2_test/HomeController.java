package com.iu.s2_test;

import java.text.DateFormat;

import java.util.Date;
import java.util.Locale;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/*@Inject
	private Engine engine;*/
	
	@Inject
	private Car car;
	@Inject
	private SmartPhone smartPhone;
	@Inject
	private Movie movie;
	@Inject
	private Idol idol;
	
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		idol = new Idol();
		System.out.println("team: " + idol.getTeam());
		System.out.println("members: "+idol.getMembers());
		
		System.out.println("tite: " + movie.getTitle());
		System.out.println("price: " +movie.getPrice());
		System.out.println("point: " + movie.getPoint());
		
		System.out.println("Brand  : " + smartPhone.getBrand());
		System.out.println("Color  : " + smartPhone.getColor());
		System.out.println("Price  : " + smartPhone.getPrice());
		
		logger.info("Welcome home! The client locale is {}.", locale);
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		model.addAttribute("car",car);
		
		return "home";
	}
	
}
