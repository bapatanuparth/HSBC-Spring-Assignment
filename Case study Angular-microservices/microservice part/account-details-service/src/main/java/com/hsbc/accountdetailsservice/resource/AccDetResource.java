package com.hsbc.accountdetailsservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.accountdetailsservice.dao.AccountDao;
import com.hsbc.accountdetailsservice.model.CustAccount;

@RestController
@RequestMapping("accounts")
public class AccDetResource {
	
	@Autowired
	AccountDao dao;
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping("{custId}")
	public CustAccount getAccount(@PathVariable("custId") int custId) {
		CustAccount c=dao.getCustomer(custId);
		return c;
	}
	
}
