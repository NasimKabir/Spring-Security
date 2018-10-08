package com.springweb.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springweb.model.Offer;

@Controller
public class HomeController {
	@RequestMapping(value="/")
	public String showOffer(Model model) {
			model.addAttribute("hello","Wellcome to spring mvc");
		return"home";
	}
}
