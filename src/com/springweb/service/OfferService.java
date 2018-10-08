package com.springweb.service;

import java.util.List;

import com.springweb.model.Offer;

public interface OfferService {

	public List<Offer> getOffers();

	public boolean update(Offer offer);

	public boolean create(Offer offer);

	public boolean delete(int id);

	public Offer getOffer(int id);
}
