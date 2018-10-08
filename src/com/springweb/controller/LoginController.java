package com.springweb.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springweb.model.User;
import com.springweb.service.UserService;

@Controller
public class LoginController {
	private UserService userService;

	@Autowired

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/login")
	public String showOffer() {

		return "Login";
	}

	@RequestMapping(value = "/newaccount")
	public String showAccountfrom(Model model) {
		model.addAttribute("user", new User());
		return "newaccount";
	}

	@RequestMapping(value = "/createaccount", method = RequestMethod.POST)
	public String shownewaccount(@Valid User user, BindingResult result) {
		if (result.hasErrors()) {
			return "newaccount";
		}
		user.setAuthority("user");
		user.setEnabled(true);
		userService.create(user);
		return "accountcreated";
	}
}
