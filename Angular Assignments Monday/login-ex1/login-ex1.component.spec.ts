import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginEx1Component } from './login-ex1.component';

describe('LoginEx1Component', () => {
  let component: LoginEx1Component;
  let fixture: ComponentFixture<LoginEx1Component>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LoginEx1Component ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginEx1Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
