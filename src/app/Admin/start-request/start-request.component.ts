import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-start-request',
  templateUrl: './start-request.component.html',
  styleUrls: ['./start-request.component.css']
})
export class StartRequestComponent implements OnInit {

  

  constructor(private adminService:AdminService,private router:Router ) { }
  reqList:Request[];
  ngOnInit() {
    if(!sessionStorage.rObj)
    {
      this.router.navigate(['/signin']);
    }
 
    this.adminService.getStartRequest().subscribe(data=>this.reqList=data);
    
    
}
ViewResource(reqId)
{
  this.adminService.setReqId(reqId);
  this.router.navigate(['viewResource']);
}

  
}
