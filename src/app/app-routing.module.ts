import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { BannerComponent } from './WfmHome/banner.component';

import { HeaderComponent } from './WfmHome/header.component';
import { AppComponent } from './app.component';
import { PageNotFoundComponent } from './page-not-found.component';
import { LoginComponent } from './login/login.component';



const routes: Routes = [
// {path:'',redirectTo:'/h',pathMatch:'full'},
 //{path:'h',component:AppComponent}, 
 {path:'signin',component:LoginComponent},
  //{path:'**',component:PageNotFoundComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[
  BannerComponent,
  HeaderComponent,
  PageNotFoundComponent,
 
]