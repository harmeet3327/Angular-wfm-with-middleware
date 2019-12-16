import { Projects } from './Projects';
import { Role } from './Role';

export class Request {
    public reqId: number;
    public project:Projects;
    public projectId: number;
    public role:Role;
    public rarRoleId: number;
    public reqRequiredExp: number; 
    public reqSkills: string;  
    public reqProjStartDate: Date; 
    public reqProjEndDate: Date; 
    public reqRemarks: string; 
    public reqFlag: string;   

}
