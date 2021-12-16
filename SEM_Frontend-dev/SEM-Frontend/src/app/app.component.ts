import { Component } from '@angular/core';
import { BaseService } from './Service/base.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor( private baseService: BaseService){}
  title = 'SEM-Frontend';
  onButtonClick()
  {
    this.baseService.getLoginInfo();
  }
}
