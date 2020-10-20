package com.hsbc.bankmanagerservice.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.hsbc.bankmanagerservice.model.CustAccount;
import com.hsbc.bankmanagerservice.model.CustDetails;
import com.hsbc.bankmanagerservice.model.Customer;




@RestController
@RequestMapping("/accounts")
public class BankManResource {
	@Autowired
	RestTemplate rt;
	
	//@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping("/{custId}")
	public CustDetails getDetails(@PathVariable("custId") int custId){
		System.out.println("In bank manager");
		Customer c=rt.getForObject("http://customer-details-service/customers/"+custId, Customer.class);
		
		CustAccount ca=rt.getForObject("http://account-details-service/accounts/"+custId, CustAccount.class);
	
		CustDetails cd=new CustDetails();
		cd.setCname(c.getCname());
		cd.setCustId(c.getCustId());
		cd.setAccId(ca.getAccId());
		cd.setBal(ca.getBal());
		cd.setAddress(c.getAddress());
		
		System.out.println("Bank Manager called");
		return cd;
	
	}

}
