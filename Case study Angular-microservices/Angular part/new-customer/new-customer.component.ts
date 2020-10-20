import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BankService } from '../bank.service';
import { Customer } from "../Customer";
@Component({
  selector: 'app-new-customer',
  templateUrl: './new-customer.component.html',
  styleUrls: ['./new-customer.component.css']
})
export class NewCustomerComponent implements OnInit {

  cust:Customer;
  dummy:Customer;
  constructor(private bank:BankService) { }

  ngOnInit(): void {
  }
  onsubmit(ngform:NgForm){
    this.cust=ngform.value
    console.log(this.cust)
    console.log(typeof(this.cust.custId));
    console.log(this.cust.address);
    this.bank.postCust(this.cust).subscribe(data=>this.cust=data)
    }
}
