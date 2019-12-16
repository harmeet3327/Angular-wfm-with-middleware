package com.wfm.services;

import java.util.List;

import com.wfm.models.ResAssignmentReq;
import com.wfm.models.ResourcesDetail;

public interface RequestAssignmentDaoService {
	
	
	public boolean raiseRequest(ResAssignmentReq rqObj);
	public List<ResAssignmentReq> getAllRequest();
	public ResAssignmentReq getReqById(int reqId);
	public List<ResAssignmentReq> getRequestByProjectId(int projectId);
	public boolean updateRequest(ResAssignmentReq reqObj);
	public List<ResAssignmentReq> getStartRequest();
	public List<ResAssignmentReq> getStartRequestByProjectId(int projectId);
	public List<ResAssignmentReq> getEndRequest();
	
}
