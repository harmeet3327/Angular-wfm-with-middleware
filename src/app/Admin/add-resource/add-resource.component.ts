import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Role } from 'src/app/Models/Role';
import { Router } from '@angular/router';
import { FormBuilder, Validators } from '@angular/forms';
import { Skill } from 'src/app/Models/Skill';

@Component({
  selector: 'app-add-resource',
  templateUrl: './add-resource.component.html',
  styleUrls: ['./add-resource.component.css']
})
export class AddResourceComponent implements OnInit {

  constructor(private adminService:AdminService,private router:Router ,private fb:FormBuilder) { }

  roleList:Role[];
  skillList:Skill[];
  rObj1:any;

  ngOnInit() {
    
    if(!sessionStorage.rObj)
    {
      this.router.navigate(['/signin']);
    }
    this.adminService.getRole().subscribe(data=>this.roleList=data);
    this.adminService.getSkills().subscribe(data=>console.log(this.skillList=data));
  
    
  }
  AddForm=this.fb.group({
   rName:['',[Validators.required]],
    rPassward:['T123'],
    rExperience:['',[Validators.required,Validators.min(0),Validators.max(99)]],
    roleId:['',[Validators.required]],
    rMaritalStatus:['',[Validators.required]],
    rEmail:['',[Validators.required,Validators.email]],
    rSkills :['JAVA,ANGULAR,HTML,HIBERNATE,SQL,JAVASCRIPT',[Validators.required]],   
    rDOB:['',[Validators.required]],
    rGender:['',[Validators.required]],
    rPhoneNumber:['',[Validators.required,Validators.max(9999999999),Validators.min(7000000000)]]

  });
  get rId(){
    return this.AddForm.get('rId');
    }
  get rPassward(){
  return this.AddForm.get('rPassward');
      }
  get rExperience(){
  return this.AddForm.get('rExperience');
      }
    get roleId(){
        return this.AddForm.get('roleId');
       }
  get rMaritalStatus(){
      return this.AddForm.get('rMaritalStatus');
         }
   get rEmail(){
      return this.AddForm.get('rEmail');
       }
   get rDOB(){
     return this.AddForm.get('rDOB');
        }
   get rGender(){
     return this.AddForm.get('rGender');
            }
   get rPhoneNumber(){
     return this.AddForm.get('rPhoneNumber');
               }


               AddFormSubmit ()
               {
                console.log(this.AddForm.value);
                this.adminService.AddResource(this.AddForm.value).subscribe(data=>{console.log(data);},
                
                  error=>{
                    console.log("dikkt component pe ");
                    
                  }
                );
                this.router.navigate(['admin']);
                }


}
