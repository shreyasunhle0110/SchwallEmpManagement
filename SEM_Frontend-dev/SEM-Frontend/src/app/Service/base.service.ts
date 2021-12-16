import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";

@Injectable({ providedIn : 'root'})
export class BaseService {
    constructor( private http: HttpClient)  {}

    getLoginInfo()
    {
        this.http.get('http://localhost:8080/api/employees/demo').subscribe(()=> {
            console.log("Response is true")
        });
    }
}