package com.springframework.myfirst;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.springframework.myfirst.domain.User;
import com.springframework.myfirst.service.LoginService;



/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/user")
public class LoginController {

@Autowired
LoginService login;



private static final Logger logger = LoggerFactory.getLogger(LoginController.class);
	
@RequestMapping( value ="login", method = RequestMethod.GET)
public String login(Locale locale, Model model) {
		model.addAttribute("user", new User());
	
		
		return "user/login";
	}

	
@RequestMapping(value = "login", method = RequestMethod.POST)
public String loginPost (@ModelAttribute("user") User user, Locale locale, Model model) { 
	

User userfromDB = login.validateUsernameandPassword(user);

	if(userfromDB != null ){
		model.addAttribute("user", userfromDB);
		//views/app/home --> check to see if i can mapp to different folder
		return "/app/home";
	}
	else{
		model.addAttribute("result","Invalid username!" );
		return "user/login";	
	}
}
	
	@RequestMapping(value = "registration", method = RequestMethod.GET)
	public String Registration(Locale locale, Model model) {
		model.addAttribute("user", new User());
		populateModel(model);
		
		return "user/registration";
	}

	
	@RequestMapping(value = "registration", method = RequestMethod.POST)
	public String RegistrationPost (@ModelAttribute("user") User user, Locale locale, Model model) { 
		model.addAttribute("user", user);
		
		populateModel(model);
		return "user/registration";				
	}

	private void populateModel(Model model) {
		
		List<String> accountTypes = new ArrayList<String>();
		
		accountTypes.add("Basic");
		accountTypes.add("Standard");
		accountTypes.add("Full");
		accountTypes.add("Premium");
		
		model.addAttribute("MySpecialAccountTypes", accountTypes);
		
		List<String> visitedCountry = new ArrayList<String>();
		
		visitedCountry.add("United States");
		visitedCountry.add("Canada");
		visitedCountry.add("Germany");
		visitedCountry.add("Mexico");
		
		
		model.addAttribute("visitCountry", visitedCountry);
	} 
}
