import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Role } from '../Models/Role';
import { HttpClient } from '@angular/common/http';
import { Skill } from '../Models/Skill';
import { Resource } from '../Models/Resource';


@Injectable({
  providedIn: 'root'
})
export class AdminService {
  
  
  constructor(private http:HttpClient) { }
reqId:any;
  
  getRole():Observable<Role[]>{
    return this.http.get<Role[]>("http://localhost:8082/workforcemanagement-frontend/getAllRoles");
  }
  private addurl:string="http://localhost:8082/workforcemanagement-frontend/addRes";
  AddResource(rObj):Observable<any>{
    console.log("on service");
    return this.http.post<any>(this.addurl,rObj,{responseType:'text' as 'json'});
  }
  getSkills():Observable<Skill[]>{
    return this.http.get<Skill[]>("http://localhost:8082/workforcemanagement-frontend/getAllSkills");
  }
  getResource() {
    return this.http.get<Resource[]>("http://localhost:8082/workforcemanagement-frontend/getAllRes");
  }
  getEndRequest() {
    return this.http.get<Request[]>("http://localhost:8082/workforcemanagement-frontend/end");
  }
  getStartRequest() {
    return this.http.get<Request[]>("http://localhost:8082/workforcemanagement-frontend/start");
  }
  setReqId(Id){
this.reqId=Id;

  }
  getId(){
    return this.reqId;
  }
  ViewResource(){

    return this.http.get<any>("http://localhost:8082/workforcemanagement-frontend/suggestReqForm/"+this.reqId);

  }
  SuggestResource(rId,reqId)
  {
    return this.http.get<any>("http://localhost:8082/workforcemanagement-frontend/addSuggestion/"+rId+"/"+reqId,{responseType:'text' as 'json'});
  }

}
