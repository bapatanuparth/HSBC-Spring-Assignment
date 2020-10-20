package com.hsbc.accountdetailsservice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hsbc.accountdetailsservice.model.CustAccount;


@Repository
public class AccountDao {
	@Autowired
	JdbcTemplate jt;
	
	public CustAccount getCustomer(int custId) {
		CustAccount b=(CustAccount) jt.queryForObject("select * from custAccount where custId=?",new Object[] {custId}, new BeanPropertyRowMapper(CustAccount.class));
		System.out.println(b.getAccId());
		return b;
	}

}
