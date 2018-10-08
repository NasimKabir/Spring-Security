package com.springweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.dao.OfferDaoImpl;
import com.springweb.model.Offer;

@Service
public class OfferServiceImpl implements OfferService {
	private OfferDaoImpl offerdaoimpl;

	@Autowired
	public void setOfferdaoimpl(OfferDaoImpl offerdaoimpl) {
		this.offerdaoimpl = offerdaoimpl;
	}

	@Override
	public List<Offer> getOffers() {
		return offerdaoimpl.getOffers();
	}

	@Override
	public boolean update(Offer offer) {
		return offerdaoimpl.update(offer);
	}

	@Override
	public boolean create(Offer offer) {
		return offerdaoimpl.create(offer);
	}

	@Override
	public boolean delete(int id) {
		return offerdaoimpl.delete(id);
	}

	@Override
	public Offer getOffer(int id) {
		return offerdaoimpl.getOffer(id);
	}
}
