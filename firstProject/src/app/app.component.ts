import { Component } from '@angular/core';

@Component({
  selector: 'app-academy',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  isHide:boolean=false;
  title = 'first Angular Project';

  ngOnInit(): void {
    setTimeout(() => {
      this.isHide = true;
    }, 5000);
  }
}
