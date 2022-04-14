import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-material-toolbar',
  templateUrl: './material-toolbar.component.html',
  styleUrls: ['./material-toolbar.component.css']
})
export class MaterialToolbarComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  setClasses(){
    const obj= {
      backgroundColor: 'red',
      color: 'red'
    };
    return obj;
  }

  getInlineStyles(){
    let styles= {
      color: 'red'
    };
    return styles;
  }
  //oppure style.display(vedere reg)



}