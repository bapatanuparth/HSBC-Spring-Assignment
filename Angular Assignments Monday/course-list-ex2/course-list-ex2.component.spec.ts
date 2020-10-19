import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CourseListEx2Component } from './course-list-ex2.component';

describe('CourseListEx2Component', () => {
  let component: CourseListEx2Component;
  let fixture: ComponentFixture<CourseListEx2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CourseListEx2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CourseListEx2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
