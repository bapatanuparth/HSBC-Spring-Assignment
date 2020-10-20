package com.hsbc.customerdetailsservice.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hsbc.customerdetailsservice.dao.CustomerDao;
import com.hsbc.customerdetailsservice.model.Customer;



@RestController
@RequestMapping("customers")
public class CustDetResource {
	@Autowired
	CustomerDao dao;
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping("/{custId}")
	public Customer getCustomer(@PathVariable("custId") int custId){
		
		Customer c=dao.getCustomer(custId);
		//Customer c1=new Customer(2, "cc", "vvv");
		return c;
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping(path="/")
	public Customer postCustomer(@RequestBody Customer c) {

		int val=dao.postCustomer(c);
		
		return c;
	}
	
}
