package com.wfm.dao;

import java.util.List;

import com.wfm.models.ResAssignmentReq;
import com.wfm.models.ResourcesDetail;
import com.wfm.models.ResourcesRoles;


public interface RequestAssignmentDao {
	
	public boolean raiseRequest(ResAssignmentReq rqObj);
	public List<ResAssignmentReq> getAllRequest();
	public ResAssignmentReq getReqById(int reqId);
	public boolean updateRequest(ResAssignmentReq reqObj);
	public List<ResAssignmentReq> getRequestByProjectId(int projectId);
	public List<ResAssignmentReq> getStartRequestByProjectId(int projectId);
	public List<ResAssignmentReq> getStartRequest();
	public List<ResAssignmentReq> getEndRequest();
}
