package aman.social.getSocial.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import aman.social.getSocial.dto.registration.UserRegistrationDTO;

public class RegistrationController {
	
	@RequestMapping(value = "/user/registration", method = RequestMethod.GET)
	public String showRegistrationForm(WebRequest request, Model model) {
		UserRegistrationDTO userDto = new UserRegistrationDTO();
	    model.addAttribute("user", userDto);
	    return "registration";
	}
}
