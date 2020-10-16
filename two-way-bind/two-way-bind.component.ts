import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way-bind',
  templateUrl: './two-way-bind.component.html',
  styleUrls: ['./two-way-bind.component.css']
})
export class TwoWayBindComponent {

  oid:string="";
  cname:string="";
  bdate:Date
  sdate:Date;
  tot:string="";

  clicked:boolean=false;
  constructor() { }

  onClick(){
    this.clicked=true;
  }

}
