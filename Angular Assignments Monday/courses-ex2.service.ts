import { Injectable } from '@angular/core';
import { Course } from "./Course";
import { Observable } from 'rxjs';
import { HttpClient } from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class CoursesEx2Service {

  baseUrl:string = "http://localhost:8080/MyApp/courses";
  constructor(private http:HttpClient) { }

  getCourses():Observable<Course[]>{
    return this.http.get<Course[]>(this.baseUrl);
  }
}
