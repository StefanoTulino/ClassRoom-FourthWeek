import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'thirdProject';
  hide:boolean=true;
  condition=false;

  nomePipe: string= 'ciao';

  books: string[]= ["aaa","bbb","ccc","ddd"];


  getClass() :string {
    return 'first';
  }

  showOrHide(): boolean {
    return this.hide ? true : false;
  }


}
