import { Component, OnInit } from '@angular/core';
import {Module} from './model2'

@Component({
  selector: 'app-emp-data',
  templateUrl: './emp-data.component.html',
  styleUrls: ['./emp-data.component.css']
})
export class EmpDataComponent {

  listcheck:boolean=false;
  tablecheck:boolean=false;
  model=new Module;
  constructor() { }

  getTable(){
    this.tablecheck=true;
    this.listcheck=false;
    return this.model.items;
  }

  getList(){
    this.listcheck=true;
    this.tablecheck=false;
    return this.model.items;
  }
  
  clearData(){
    this.listcheck=false;
    this.tablecheck=false;
  }

}
