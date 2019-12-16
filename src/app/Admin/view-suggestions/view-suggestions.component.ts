import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Router } from '@angular/router';
import { Resource } from 'src/app/Models/Resource';

@Component({
  selector: 'app-view-suggestions',
  templateUrl: './view-suggestions.component.html',
  styleUrls: ['./view-suggestions.component.css']
})
export class ViewSuggestionsComponent implements OnInit {

  constructor(private adminService:AdminService,private router:Router ) { }

  rList:Resource[];
  reqId:any;
  ngOnInit() {

    if(!sessionStorage.rObj)
    {
      this.router.navigate(['/signin']);
    }
    this.adminService.ViewResource().subscribe(data=>this.rList=data);
    this.reqId=this.adminService.getId();
  }
  suggestResource(rId){

  this.adminService.SuggestResource(rId,this.reqId).subscribe(data=>{this.rList=this.rList.filter(u => u.rId !== rId);});
  }

}
