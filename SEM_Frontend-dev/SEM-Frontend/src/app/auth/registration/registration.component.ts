import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Employee } from 'src/app/Model/employee.model';
import { RegistrationService } from 'src/app/Service/registration.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  isLoading = false;
  constructor(private empService: RegistrationService) { 
    
  }

  ngOnInit(): void {
  }
  onSignUp(form: NgForm) {
    
    
    
  }
}
