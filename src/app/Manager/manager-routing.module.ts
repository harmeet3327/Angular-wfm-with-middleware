import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { RaiseRequestComponent } from './raise-request/raise-request.component';
import { ManagerHomeComponent } from './manager-home/manager-home.component';
import { SuggestedRequestComponent } from './suggested-request/suggested-request.component';
import { SuggestedResourceComponent } from './suggested-resource/suggested-resource.component';
import { LogOutComponent } from '../log-out/log-out.component';


const routes: Routes = [ {path:'request',component:RaiseRequestComponent},
{path:'manager',component:ManagerHomeComponent},
{path:'adminSugg',component:SuggestedRequestComponent},
{path:'suggestedResource',component:SuggestedResourceComponent},
{path:'logOut',component:LogOutComponent}];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class ManagerRoutingModule { }
