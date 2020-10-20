import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from "@angular/common/http";
import { CustDetails } from "./CustDetails";
import { Customer } from './Customer';
@Injectable({
  providedIn: 'root'
})
export class BankService {

  baseUrl:string = "http://localhost:8083/accounts/";
  base2Url:string = "http://localhost:8081/customers/"
  constructor(private http:HttpClient) { }

  getCustDetails(custId:number):Observable<CustDetails>{
    return this.http.get<CustDetails>(this.baseUrl+custId);
  }

  postCust(cust:Customer):Observable<Customer>{
    return this.http.post<Customer>(this.base2Url,cust);

  }

}
