import { Component, OnInit } from '@angular/core';
import { Student } from '../Student';
import { StudentEx2Service } from '../student-ex2.service';


@Component({
  selector: 'app-stud-list-ex2',
  templateUrl: './stud-list-ex2.component.html',
  styleUrls: ['./stud-list-ex2.component.css']
})
export class StudListEx2Component implements OnInit {

  students:Student[];
  constructor(private stud:StudentEx2Service) { }

  ngOnInit(): void {
    this.stud.getStudents().subscribe(data => this.students = data);
  }

}
