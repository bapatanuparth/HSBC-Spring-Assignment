import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginEx1Service {

  constructor() { }
  admin={uname:"aaa",password:"pass"};

  getAdmin(){
    return this.admin
  }
}
