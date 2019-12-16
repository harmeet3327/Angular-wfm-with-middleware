import { Component, OnInit } from '@angular/core';
import { ManagerService } from '../manager.service';
import { Router } from '@angular/router';
import { Resource } from 'src/app/Models/Resource';

@Component({
  selector: 'app-suggested-request',
  templateUrl: './suggested-request.component.html',
  styleUrls: ['./suggested-request.component.css']
})
export class SuggestedRequestComponent implements OnInit {

  constructor(private managerService:ManagerService,private router:Router ) { }
  reqList:Request[];
  rObj1:any;
  sugglist:any;
  ngOnInit() {
    if(!sessionStorage.rObj)
    {
      this.router.navigate(['/signin']);
    }

    this.rObj1= JSON.parse(sessionStorage.rObj);
    let projectId=this.rObj1.projectId;
    this.managerService.getRequestByProjectId(projectId).subscribe(data=>this.reqList=data);

  }

  ViewResource(reqId)
  {
    console.log("id"+reqId);
 this.managerService.setReqId(reqId);
    //this.managerService.getSuggestionsByReqId(reqId).subscribe(data=>{console.log(data);this.sugglist=data});
    // this.managerService.setSuggestedResources(this.sugglist);
     this.router.navigate(['suggestedResource']);
    

  }
  

}
