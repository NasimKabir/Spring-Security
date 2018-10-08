package com.springweb.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springweb.model.Offer;

public class Rowmapper implements RowMapper<Offer>{

	@Override
	public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
	Offer os=new Offer();
	os.setId(rs.getInt("id"));
	os.setName(rs.getString("name"));
	os.setEmail(rs.getString("email"));
	os.setText(rs.getString("text"));
		return os;
	}

}
