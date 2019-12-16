import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule,routingComponents } from './app-routing.module';
import { AppComponent } from './app.component';

//import { HeaderComponent } from './WfmHome/header.component';

//import { BannerComponent } from './WfmHome/banner.component';
import {HttpClientModule} from '@angular/common/http';
import { LoginModule } from './login/login.module';
import { LoginService } from './login/login.service';
import { AdminModule } from './Admin/admin.module';
import { AdminService } from './Admin/admin.service';
import { ManagerModule } from './Manager/manager.module';
import { ManagerService } from './Manager/manager.service';
import { LogOutComponent } from './log-out/log-out.component';



//import { PageNotFoundComponent } from './page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
 
   // HeaderComponent,
    //BannerComponent,
    //PageNotFoundComponent,
    routingComponents,
 
   LogOutComponent,
 

 
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    ReactiveFormsModule,
    LoginModule,
    AdminModule,ManagerModule

  ],
  providers: [LoginService,AdminService,ManagerService],
  bootstrap: [AppComponent]
})
export class AppModule { }
