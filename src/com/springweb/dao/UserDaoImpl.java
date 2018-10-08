package com.springweb.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.springweb.model.User;

@Repository
public class UserDaoImpl implements UserDao {
	private DataSource dataSource;
	private NamedParameterJdbcTemplate jdbc;

	public UserDaoImpl() {
		System.out.println("user dao successfully load");
	}

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbc = new NamedParameterJdbcTemplate(dataSource);
	}

	@Transactional
	@Override
	public boolean create(User user) {
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(user);
		String users = "insert into Users(username,password,email,enabled)values(:username,:password,:email,:enabled)";
		String authorities = "insert into authorities(username,authority) values(:username,:authority)";
		jdbc.update(users, params);
		return jdbc.update(authorities, params) == 1;
	}

}
