//directive di tipo strutturale: gli passiamo dati in input e poi fa qualcosa
//templateRef--> riferimento al ref
//viewcontaneirRef--> riferiemnto al contaneir

import { Directive, Input, TemplateRef, ViewContainerRef } from '@angular/core';

@Directive({
  selector: '[unless]'
})
export class UnlessDirective {
  private hasView=false;

  constructor(private templateRef: TemplateRef<any>,
    private viewContainer: ViewContainerRef) { 

    }


    @Input() set unless(condition:boolean){
      //crea una vista dell'host element
      if(!condition && !this.hasView){
        this.viewContainer.createEmbeddedView(this.templateRef);
        this.hasView = true;
      } 
      //altrimenti viene pulita la vista già esistente
      else if (condition && this.hasView) {
        this.viewContainer.clear();
        this.hasView = false;
      }
    }

    }

