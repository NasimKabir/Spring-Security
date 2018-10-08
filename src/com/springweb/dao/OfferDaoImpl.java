package com.springweb.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springweb.model.Offer;

@Repository
public class OfferDaoImpl implements OfferDao{
private DataSource dataSource;
private NamedParameterJdbcTemplate jdbc;

public OfferDaoImpl() {
	System.out.println("Successfully load on offerDao");
}
 @Autowired
public void setDataSource(DataSource dataSource) {
	this.jdbc= new NamedParameterJdbcTemplate(dataSource);
}
@Override
public List<Offer> getOffers() {
String sql="select * from offer";
	return jdbc.query(sql,new Rowmapper());
}
@Override
public boolean update(Offer offer) {
	BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(offer);
	String sql="update offer set name=:name, text=:text, email=:email where id=:id";
	return jdbc.update(sql,params)==1;
}
@Override
public boolean create(Offer offer) {
	BeanPropertySqlParameterSource params=new BeanPropertySqlParameterSource(offer);
	String sql="insert into offer (name, text, email) values (:name, :text, :email)";
	return jdbc.update(sql,params)==1;
}
@Override
public boolean delete(int id) {
MapSqlParameterSource params=new MapSqlParameterSource("id",id);
String sql="delete from offer where id=:id";
return jdbc.update(sql,params)==1;
}
@Override
public Offer getOffer(int id) {
	MapSqlParameterSource params=new MapSqlParameterSource("id",id);
	String sql="select * from offer where id=:id";
	return jdbc.queryForObject(sql, params,new Rowmapper());
}
}
