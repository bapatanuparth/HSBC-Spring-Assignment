import { Component, OnInit } from '@angular/core';
import {Module} from './model1';

@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent {

  people:any[]=[
    {"name":"parth","age":"22","gender":"Male"},
    {"name":"girish","age":"23","gender":"Male"},
    {"name":"rohan","age":"21","gender":"Male"},
    {"name":"geeta","age":"26","gender":"Female"},
  ]

  model=new Module;
  
  constructor() { }

  getAllPeople(){
    return this.model.items;
  }
}
