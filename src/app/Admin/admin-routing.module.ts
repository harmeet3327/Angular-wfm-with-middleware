import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddResourceComponent } from './add-resource/add-resource.component';


import { AllResourceComponent } from './all-resource/all-resource.component';
import { StartRequestComponent } from './start-request/start-request.component';
import { EndRequestComponent } from './end-request/end-request.component';
import { ViewSuggestionsComponent } from './view-suggestions/view-suggestions.component';
import { LogOutComponent } from '../log-out/log-out.component';


const routes: Routes = [ {path:'AddRes',component:AddResourceComponent},
{path:'start',component:StartRequestComponent},
{path:'end',component:EndRequestComponent},
{path:'getAllRes',component:AllResourceComponent},
{path:'viewResource',component:ViewSuggestionsComponent},
{path:'logOut',component:LogOutComponent}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class AdminRoutingModule { }
