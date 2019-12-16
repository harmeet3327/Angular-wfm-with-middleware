import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Role } from '../Models/Role';
import { HttpClient } from '@angular/common/http';
import { Skill } from '../Models/Skill';
import { Resource } from '../Models/Resource';


@Injectable({
  providedIn: 'root'
})
export class ManagerService {

  constructor(private http:HttpClient) { }

  reslist:Resource[];
  reqId:any;

  RaiseRequest(reqObj:any):Observable<any>{
    console.log("service"+reqObj);
    return this.http.post<any>("http://localhost:8082/workforcemanagement-frontend/managerReqSubmit",reqObj,{responseType:'text' as 'json'});
  }
  getSkills():Observable<Skill[]>{
    return this.http.get<Skill[]>("http://localhost:8082/workforcemanagement-frontend/getAllSkills");
  }
  getRole():Observable<Role[]>{
    return this.http.get<Role[]>("http://localhost:8082/workforcemanagement-frontend/getAllRoles");
  }
  getRequestByProjectId(projectId){

    return this.http.get<Request[]>("http://localhost:8082/workforcemanagement-frontend/adminSugg/"+projectId);

  }
  getSuggestionsByReqId(reqId)
  {
    console.log("service");
    return this.http.get<Resource[]>("http://localhost:8082/workforcemanagement-frontend/suggestionByAdmin/"+reqId);
  }
  setSuggestedResources(sugglist:any)
  {
    console.log("set");
this.reslist=sugglist;
  }
  getSuggestedResources()
  {
    console.log("GET");
    return this.reslist;
  }
  setReqId(Id){
    this.reqId=Id;
    
      }
  getReqId(){
        return this.reqId;
    }
    lockResource(reqId,rId){
      return this.http.get<any>("http://localhost:8082/workforcemanagement-frontend/lockSuggestion/"+reqId+"/"+rId);
      
    }

 
}
