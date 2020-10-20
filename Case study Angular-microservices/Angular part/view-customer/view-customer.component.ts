import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BankService } from '../bank.service';
import { CustDetails } from '../CustDetails';
import { Customer } from "../Customer";
@Component({
  selector: 'app-view-customer',
  templateUrl: './view-customer.component.html',
  styleUrls: ['./view-customer.component.css']
})
export class ViewCustomerComponent implements OnInit {

  cust:number;
  custobj:CustDetails;
  valid:boolean=false;
  constructor(private bankserv:BankService) { }

  ngOnInit(): void {
  
  }
  onsubmit(ngform:NgForm){
  //  this.cust=ngform.value
    console.log(this.cust)
    this.bankserv.getCustDetails(this.cust).subscribe(data => this.custobj = data);
    this.valid=true;
  }
}
