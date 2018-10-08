package com.springweb.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springweb.model.Offer;
import com.springweb.service.OfferServiceImpl;

@Controller
public class OffersController {
	private OfferServiceImpl offerservice;

	@Autowired
	public void setOfferservice(OfferServiceImpl offerservice) {
		this.offerservice = offerservice;
	}

	@RequestMapping(value = "/offer")
	public String showOffer(Model model) {
		List<Offer> getdata = offerservice.getOffers();
		model.addAttribute("hello", getdata);
		return "offer";
	}

	@RequestMapping(value = "/create", method = RequestMethod.GET)
	public String OfferCreate() {
		
		return "createOffer";
	}

	@RequestMapping(value = "/created", method = RequestMethod.POST)
	public String OfferCreateted( @Valid @ModelAttribute("offer") Offer offer, BindingResult result) {
		if (result.hasErrors()) {
			return "createOffer";
		}
		offerservice.create(offer);
		return "createdOffer";
	}
}
