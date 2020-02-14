import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NbThemeModule, NbLayoutModule, NbInputModule, NbButtonModule, NbCardModule, NbIconModule, NbSelectModule } from '@nebular/theme';
import { NbEvaIconsModule } from '@nebular/eva-icons';
import { ListDisplayComponent } from './components/list-display/list-display.component';
import { ListPlayComponent } from './components/list-play/list-play.component';
import { MemoryCardDisplayComponent } from './components/memory-card-display/memory-card-display.component';
import {HttpClientModule} from "@angular/common/http";
import { ReactiveFormsModule } from '@angular/forms';
import { ListEditComponent } from './components/list-edit/list-edit.component';
import { MemoryCardEditComponent } from './components/list-edit/memory-card-edit/memory-card-edit.component';
import { DataChunkEditComponent } from './components/list-edit/memory-card-edit/data-chunk-edit/data-chunk-edit.component';

@NgModule({
  declarations: [
    AppComponent,
    ListDisplayComponent,
    ListPlayComponent,
    MemoryCardDisplayComponent,
    ListEditComponent,
    MemoryCardEditComponent,
    DataChunkEditComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    NbThemeModule.forRoot({ name: 'dark' }),
    NbLayoutModule,
    NbEvaIconsModule,
    HttpClientModule,
    ReactiveFormsModule,
    NbInputModule,
    NbButtonModule,
    NbCardModule,
    NbIconModule,
    NbSelectModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
