import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin-home',
  templateUrl: './admin-home.component.html',
  styleUrls: ['./admin-home.component.css']
})
export class AdminHomeComponent implements OnInit {

  constructor(private router:Router) { }
  rObj1:any;
  ngOnInit() {
    if(!sessionStorage.rObj)
    {
      this.router.navigate(['/signin']);
    }
    
    this.rObj1= JSON.parse(sessionStorage.rObj);

  }

  }
