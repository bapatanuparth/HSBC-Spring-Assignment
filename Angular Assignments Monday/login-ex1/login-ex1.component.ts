import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../iuser';
import { LoginEx1Service } from "../login-ex1.service";

@Component({
  selector: 'app-login-ex1',
  templateUrl: './login-ex1.component.html',
  styleUrls: ['./login-ex1.component.css']
})
export class LoginEx1Component implements OnInit {

  user:User;
  admin:User;

  valid:boolean=false;
  constructor(log:LoginEx1Service) {
    this.admin=log.getAdmin();
   }
  
  ngOnInit(): void {
  }

  onsubmit(ngform:NgForm){
    this.user=ngform.value
    if(this.admin.uname==this.user.uname && this.admin.password==this.user.password){
      console.log("Matched")
      this.valid=true;
    }
    else{
      console.log("not matched")
      this.valid=false;
    }
  }


}
