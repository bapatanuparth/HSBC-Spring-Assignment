import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { HttpClient } from "@angular/common/http";
import { Student } from "./Student";

@Injectable({
  providedIn: 'root'
})
export class StudentEx2Service {

  baseUrl:string='/assets/students.json'
  constructor(private http:HttpClient) {
   }

   getStudents():Observable<Student[]>{
     return this.http.get<Student[]>(this.baseUrl)
   }
}
