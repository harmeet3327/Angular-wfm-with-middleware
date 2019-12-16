import { Role } from './Role';
import { Projects } from './Projects';

export class Resource {

    public rId: number;
    public rName: string;
    public role:Role;
    public roleId: number;
    public rExperience: number;
    public rPassward:string;
    public rEmail:string;
    public rDOB:Date;
    public rGender:string;
    public rMaritalStatus:string; 
    public rPhoneNumber: number;
    public rSkills:string;
    public rStatus:string;
    public project:Projects;
    public projectId:number;
    public rProStartDate:Date;
    public rProEndDate:Date;
 }