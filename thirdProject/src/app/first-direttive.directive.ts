//esegue l'assegnamento una volta rihciamato nel file .html


import { Directive, ElementRef } from '@angular/core';

@Directive({
  selector: '[appFirstDirettive]'
})
export class FirstDirettiveDirective {

  constructor(private el: ElementRef) {
    //el.nativeElement.property
   this.el.nativeElement.backgroundColor='gray';
   }

}
