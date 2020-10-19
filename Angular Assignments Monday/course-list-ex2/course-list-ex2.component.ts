import { Component, OnInit } from '@angular/core';
import { Course } from "../Course";
import { CoursesEx2Service } from '../courses-ex2.service';

@Component({
  selector: 'app-course-list-ex2',
  templateUrl: './course-list-ex2.component.html',
  styleUrls: ['./course-list-ex2.component.css']
})
export class CourseListEx2Component implements OnInit {

  courses:Course[]

  constructor(private serv:CoursesEx2Service) { }

  ngOnInit(): void {
    this.serv.getCourses().subscribe(data => this.courses = data);
  }

}
