import { Component } from '@angular/core';
import {HttpClient} from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'vehicle-fourth-week';

  vehicles: any[]= [];

  constructor(private httpClient: HttpClient){
    this.httpClient
    .get<any>('http://localhost:8080/api/veicolo/getAll')
    .subscribe( (e)=> {
      console.log(e)
      this.vehicles=e;
    });
  }
}
