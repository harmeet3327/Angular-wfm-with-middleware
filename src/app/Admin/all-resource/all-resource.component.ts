import { Component, OnInit } from '@angular/core';
import { Resource } from 'src/app/Models/Resource';
import { Router } from '@angular/router';
import { AdminService } from '../admin.service';

@Component({
  selector: 'app-all-resource',
  templateUrl: './all-resource.component.html',
  styleUrls: ['./all-resource.component.css']
})
export class AllResourceComponent implements OnInit {

  constructor(private adminService:AdminService,private router:Router ) { }
  rList:Resource[];
  ngOnInit() {

    if(!sessionStorage.rObj)
    {
      this.router.navigate(['/signin']);
    }
    this.adminService.getResource().subscribe(data=>this.rList=data);
  }

}
