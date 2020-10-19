import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StudListEx2Component } from './stud-list-ex2.component';

describe('StudListEx2Component', () => {
  let component: StudListEx2Component;
  let fixture: ComponentFixture<StudListEx2Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StudListEx2Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StudListEx2Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
