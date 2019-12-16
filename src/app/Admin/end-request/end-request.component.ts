import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-end-request',
  templateUrl: './end-request.component.html',
  styleUrls: ['./end-request.component.css']
})
export class EndRequestComponent implements OnInit {

  constructor(private adminService:AdminService,private router:Router ) { }
  reqList:Request[];
  ngOnInit() {
    if(!sessionStorage.rObj)
    {
      this.router.navigate(['/signin']);
    }
    this.adminService.getEndRequest().subscribe(data=>console.log(this.reqList=data));
  }
  }
  


