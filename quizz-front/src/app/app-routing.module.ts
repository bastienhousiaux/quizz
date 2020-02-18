import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListDisplayComponent } from './components/list-display/list-display.component';
import { ListEditComponent } from './components/list-edit/list-edit.component';
import { ListPlayComponent } from './components/list-play/list-play.component';


const routes: Routes = [
    {path:"",redirectTo:"lists",pathMatch:"full"},
    {path:"lists",component:ListDisplayComponent},
    {path:"lists/:id/edit",component:ListEditComponent},
    {path:"lists/:id/play",component:ListPlayComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
