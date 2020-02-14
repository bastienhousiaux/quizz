import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListDisplayComponent } from './components/list-display/list-display.component';
import { ListEditComponent } from './components/list-edit/list-edit.component';


const routes: Routes = [
    {path:"",redirectTo:"lists",pathMatch:"full"},
    {path:"lists",component:ListDisplayComponent},
    {path:"lists/:id/edit",component:ListEditComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
