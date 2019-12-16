package com.wfm.servicesimpl;

import java.util.Date;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.ProjectsDao;
import com.wfm.dao.ResourceDao;
import com.wfm.dao.ResourceRoleDao;
import com.wfm.models.Projects;
import com.wfm.models.ResourcesDetail;
import com.wfm.services.ResourceService;

@Service("resService")
@Transactional
public class ResourceServiceImpl implements ResourceService {

	@Autowired ResourceDao resDao;
	@Autowired ProjectsDao projDao;
	@Autowired ResourceRoleDao roleDao;
	
	public boolean addResourse(ResourcesDetail rdObj) {
		
		
		Projects pr=new Projects();
		pr=projDao.getProjectById(300);
		
		Date d1=pr.getProjectStartDate();
		Date d2=pr.getProjectEndDate();

		
	
		System.out.println(pr);
		rdObj.setProject(pr);
		rdObj.setProjectId(300);
		rdObj.setrProStartDate(d1);
		rdObj.setrProEndDate(d2);
		rdObj.setRole(roleDao.getRoleById(rdObj.getRoleId()));
		rdObj.setrStatus("BENCH");
		
		resDao.addResourse(rdObj);
		return true;
	}

	public List<ResourcesDetail> getAllResources() {
		
		
		return resDao.getAllResources();
	}


	public ResourcesDetail validateResource(int rId, String rPassward) {
	
		System.out.println("in service");
		ResourcesDetail rObj=resDao.validateResource(rId, rPassward);
		
		return rObj;
	}


	public ResourcesDetail getResourceById(int rId) {
		
		return resDao.getResourceById(rId);
	}

	public List<ResourcesDetail> getResourceByTypes(int rlId, int exp, String skill) {

		
		return resDao.getResourceByTypes(rlId,exp,skill);
	}

	public boolean updateResource(ResourcesDetail rObj) {
		resDao.updateResource(rObj);		
		return true	;

}

	public boolean updateResourceListStatusToBench(List<Integer> rlist) {
        
		ListIterator<Integer> iterator = rlist.listIterator(); 
        while (iterator.hasNext()) { 
              resDao.updateResourceListStatusToBench(iterator.next());
           
                     
   } 
      return true;
     
     }

	public List<ResourcesDetail> getResourcesById(List<Integer> suggReslist) {
		
		return resDao.getResourcesById(suggReslist);
	}
  

}
