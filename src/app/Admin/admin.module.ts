import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { AdminRoutingModule } from './admin-routing.module';
import { AdminHomeComponent } from './admin-home.component';
import { FormsModule, ReactiveFormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { AddResourceComponent } from './add-resource/add-resource.component';

import { AllResourceComponent } from './all-resource/all-resource.component';
import { StartRequestComponent } from './start-request/start-request.component';
import { EndRequestComponent } from './end-request/end-request.component';
import { AdminHeaderComponent } from './admin-header/admin-header.component';
import { ViewSuggestionsComponent } from './view-suggestions/view-suggestions.component';


@NgModule({
  declarations: [AdminHomeComponent, AddResourceComponent,  AllResourceComponent, StartRequestComponent, EndRequestComponent, AdminHeaderComponent, ViewSuggestionsComponent],
  imports: [
    CommonModule,
    AdminRoutingModule,
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule

  ],
  exports:[AdminHomeComponent]
})
export class AdminModule { }
