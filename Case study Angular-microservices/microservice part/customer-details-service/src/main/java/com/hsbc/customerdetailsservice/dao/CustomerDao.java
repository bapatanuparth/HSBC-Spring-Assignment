package com.hsbc.customerdetailsservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.customerdetailsservice.model.Customer;


@Repository
public class CustomerDao {
	@Autowired
	JdbcTemplate jt;
	
	public Customer getCustomer(int custId) {
		Customer b=(Customer) jt.queryForObject("select * from customers where custId=?"
				,new Object[] {custId}, new BeanPropertyRowMapper(Customer.class));
		return b;
	}
	
	public int postCustomer(Customer c) {
		int val=jt.update("insert into customers values(?,?,?)",new Object[] {c.getCustId(),c.getCname(),c.getAddress()});
		return val;
	}
	
}
