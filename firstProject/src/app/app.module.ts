import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { MaterialModule } from './material.module';
import { MaterialToolbarComponent } from './material-toolbar/material-toolbar.component';
import { SpinnerComponent } from './spinner/spinner.component';
import {MatButtonModule} from '@angular/material/button';
import { TableDataComponent } from './table-data/table-data.component';

@NgModule({
  declarations: [
    AppComponent,
    SpinnerComponent,
    MaterialToolbarComponent,
    TableDataComponent
  ],
  imports: [ BrowserModule, MaterialModule, MatButtonModule],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
