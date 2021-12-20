import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Employee } from "../Model/employee.model";

@Injectable({ providedIn: 'root' })
export class RegistrationService {
    constructor(private http: HttpClient) { }

    userRegistration(employee:Employee) {
      this.http.post('http://localhost:8080/api/employees/add', employee).subscribe(() => {
            console.log("Employee Saved")
        });
    }
}