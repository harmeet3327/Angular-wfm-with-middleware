import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { ManagerRoutingModule } from './manager-routing.module';
import { AdminRoutingModule } from '../Admin/admin-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { ReactiveFormsModule, FormsModule } from '@angular/forms';
import { ManagerHomeComponent } from './manager-home/manager-home.component';
import { RaiseRequestComponent } from './raise-request/raise-request.component';
import { SuggestedRequestComponent } from './suggested-request/suggested-request.component';
import { SuggestedResourceComponent } from './suggested-resource/suggested-resource.component';


@NgModule({
  declarations: [RaiseRequestComponent,ManagerHomeComponent, SuggestedRequestComponent, SuggestedResourceComponent],
  imports: [
    CommonModule,
    AdminRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,ManagerRoutingModule
  ],
  exports:[ManagerHomeComponent]
})
export class ManagerModule { }
