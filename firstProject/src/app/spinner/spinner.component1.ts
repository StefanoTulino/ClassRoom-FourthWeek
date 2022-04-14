import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-spinner1',
  template: `<div class="loader">Loading...</div>`,
 // templateUrl: "",
  styleUrls: ['./spinner.component.css']
})
export class SpinnerComponent implements OnInit {
  isHide: boolean= false;

  constructor() { }

  ngOnInit(): void {
    setTimeout( ()=> {
      this.isHide= true;
    },5000);
  }


}
