import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl,FormBuilder, Validators,ReactiveFormsModule } from '@angular/forms';

import { LoginService } from './login.service';
import { Router } from '@angular/router';



@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  redirectUrl:string='admin';



  constructor(private fb:FormBuilder,private loginService:LoginService,private router:Router) { }
  ngOnInit() {
  }
  loginForm=this.fb.group({
    rId:['',[Validators.required]],
    rPassward:['',[Validators.required]]
  });
  get rId(){
    return this.loginForm.get('rId');
    }
  
    get rPassward(){
    return this.loginForm.get('rPassward');
    }
    loginFormSubmit(){
      console.log(this.loginForm.value);
      this.loginService.validate(this.loginForm.value.rId,this.loginForm.value.rPassward).subscribe(
        data=>{
          if(data.role.roleType=='ADMIN')
          {
            
          sessionStorage.setItem('rObj', JSON.stringify(data));
           this.router.navigate([this.redirectUrl]);
          }
          if(data.role.roleType=='MANAGER')
          {
            
          sessionStorage.setItem('rObj', JSON.stringify(data));
           this.router.navigate(['manager']);
          }
          },
      
        error=>{
          alert("bhai id password galat h ");
          this.router.navigate(['./signin']);
        }
      );
      }
    }
    
  


