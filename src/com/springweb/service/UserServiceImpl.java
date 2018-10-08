package com.springweb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springweb.dao.UserDaoImpl;
import com.springweb.model.User;

@Service
public class UserServiceImpl implements UserService {
	private UserDaoImpl daoservice;

	@Autowired
	public void setDaoservice(UserDaoImpl daoservice) {
		this.daoservice = daoservice;
	}

	@Override
	public void create(User user) {
		daoservice.create(user);
	}

}
