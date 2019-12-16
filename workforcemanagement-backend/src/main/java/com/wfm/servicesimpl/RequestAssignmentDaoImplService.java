package com.wfm.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.ProjectsDao;
import com.wfm.dao.RequestAssignmentDao;
import com.wfm.dao.ResourceRoleDao;
import com.wfm.models.ResAssignmentReq;
import com.wfm.models.ResourcesDetail;
import com.wfm.models.ResourcesRoles;
import com.wfm.services.RequestAssignmentDaoService;

@Service("reqService")
@Transactional
public class RequestAssignmentDaoImplService implements RequestAssignmentDaoService {

	@Autowired RequestAssignmentDao reqDao;
	@Autowired ResourceRoleDao roleDao;	
	@Autowired ProjectsDao projDao;
	
	public boolean raiseRequest(ResAssignmentReq reqObj) {
		
		int r=reqObj.getRarRoleId();
		//reqObj.setRole(roleDao.getRoleById(r));
		int p=reqObj.getProjectId();
		reqObj.setProject(projDao.getProjectById(p));
		reqObj.setReqFlag("START");
		reqDao.raiseRequest(reqObj);
		
		return true;
	}

	public List<ResAssignmentReq> getAllRequest() {
		
		return reqDao.getAllRequest();
	}

	public ResAssignmentReq getReqById(int reqId) {
		
		return  reqDao.getReqById(reqId);
	}

	public List<ResAssignmentReq> getRequestByProjectId(int projectId) {
		
		return reqDao.getRequestByProjectId(projectId);
	}

	public boolean updateRequest(ResAssignmentReq reqObj) {
		
		reqDao.updateRequest(reqObj);
		return true;
	}

	public List<ResAssignmentReq> getStartRequest() {
		
		return reqDao.getStartRequest();
	}

	public List<ResAssignmentReq> getStartRequestByProjectId(int projectId) {
		
		return reqDao.getStartRequestByProjectId(projectId);
	}

	public List<ResAssignmentReq> getEndRequest() {
		
		return reqDao.getEndRequest();
	}

	

}
