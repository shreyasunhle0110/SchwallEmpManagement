import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  isLoading = false;

  constructor() { }

  ngOnInit(): void {
  }
  onSignUp(form: NgForm) {
    console.log(form.value);
  }
}
