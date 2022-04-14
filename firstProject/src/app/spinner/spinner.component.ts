import { ThisReceiver } from '@angular/compiler';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-spinner',
  templateUrl: './spinner.component.html',
  styleUrls: ['./spinner.component.css'],
})

export class SpinnerComponent implements OnInit {

  constructor() { }
  isHide:boolean=true;
  ngOnInit(): void {
    this.isHide;
  }


}
