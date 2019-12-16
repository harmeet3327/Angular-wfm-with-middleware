import { Component, OnInit } from '@angular/core';
import { Resource } from 'src/app/Models/Resource';
import { ManagerService } from '../manager.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-suggested-resource',
  templateUrl: './suggested-resource.component.html',
  styleUrls: ['./suggested-resource.component.css']
})
export class SuggestedResourceComponent implements OnInit {
reqId:any;
rObj1:any;
projectId:any;
  constructor(private managerService:ManagerService,private router:Router ) { }
  sugglist:any;
  ngOnInit() {

    if(!sessionStorage.rObj)
    {
      this.router.navigate(['/signin']);
    }
    this.reqId=this.managerService.getReqId();
  
    this.managerService.getSuggestionsByReqId(this.reqId).subscribe(data=>this.sugglist=data);
    this.rObj1= JSON.parse(sessionStorage.rObj);
    this.projectId=this.rObj1.projectId;
  }
  LockResource(rId){

    this.managerService.lockResource(this.reqId,rId).subscribe(data=>alert(data));
    this.router.navigate(['manager']);


  }
}
