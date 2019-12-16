import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor(private http:HttpClient) { }

  validate(rId,rPassward):Observable<any>{
    return this.http.post<any>("http://localhost:8082/workforcemanagement-frontend/login?rId="+rId+"&&rPassward="+rPassward,
    null);
  }

}
