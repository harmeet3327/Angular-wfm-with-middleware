import { Component, OnInit } from '@angular/core';
import { ManagerService } from '../manager.service';
import { Router } from '@angular/router';
import { FormBuilder, Validators } from '@angular/forms';
import { Role } from 'src/app/Models/Role';
import { Skill } from 'src/app/Models/Skill';

@Component({
  selector: 'app-raise-request',
  templateUrl: './raise-request.component.html',
  styleUrls: ['./raise-request.component.css']
})
export class RaiseRequestComponent implements OnInit {

  constructor(private managerService:ManagerService,private router:Router ,private fb:FormBuilder) { }

  roleList:Role[];
  skillList:Skill[];
  rObj1:any;
  project:any;
  ngOnInit() {
    if(!sessionStorage.rObj)
    {
      this.router.navigate(['/signin']);
    }
    this.managerService.getRole().subscribe(data=>this.roleList=data);
    this.managerService.getSkills().subscribe(data=>console.log(this.skillList=data));
    this.rObj1= JSON.parse(sessionStorage.rObj);
    this.project=this.rObj1.projectId;
   
  }
  ReqForm=this.fb.group({
    projectId:['',[Validators.required]],
    rarRoleId:['',[Validators.required]],
    reqRequiredExp:['',[Validators.required,Validators.min(0),Validators.max(99)]],
    reqSkills:['',[Validators.required]],
    reqProjStartDate:['',[Validators.required]],
    reqProjEndDate:['',[Validators.required]],
    reqRemarks :['']
    
 
   });
   RequestSubmit()
   {
    
    this.ReqForm.value.projectId=this.project;
    console.log(this.ReqForm.value);
    this.managerService.RaiseRequest(this.ReqForm.value).subscribe(data=>{console.log(data);},
    
      error=>{
        console.log("dikkt component pe ");
       
      }
      
    );
    this.router.navigate(['manager']);
    }
  }
