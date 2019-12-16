package com.wfm.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.RequestAssignmentDao;
import com.wfm.dao.ResourceDao;
import com.wfm.dao.SuggestionByAdminDao;
import com.wfm.models.ResAssignmentReq;
import com.wfm.models.ResourcesDetail;
import com.wfm.models.SuggestionsByAdmin;
import com.wfm.services.SuggestionsByAdminDaoService;

@Service("suggService")
@Transactional
public class SuggestionsByAdminDaoServiceImpl implements SuggestionsByAdminDaoService {

	@Autowired SuggestionByAdminDao suggDao;
	@Autowired RequestAssignmentDao reqDao;
	@Autowired ResourceDao resDao;
	

	public boolean addSuggestions(SuggestionsByAdmin sObj,int reqId,int rId,ResourcesDetail rObj,ResAssignmentReq reqObj) {
		
		//update resource table statys suggested
		//rObj.setrId(rId);		
		rObj.setrStatus("SUGGESTED");
		
		resDao.updateResource(rObj);
		
		
		reqObj.setReqFlag("MIDDLE");
		reqDao.updateRequest(reqObj);
		//update req table flag middle
		
		sObj.setReqId(reqId);
		sObj.setResourceId(rId);
		
		suggDao.addSuggestions(sObj);
		
		return false;
	}


	public List<SuggestionsByAdmin> getAllSuggestion() {
		
		return suggDao.getAllSuggestion();
	}


	public List<Integer> getSuggestinsByRequestId(int reqId) {
		
		List <Integer> suggList=suggDao.getSuggestinsByRequestId(reqId);
		return suggList;
	}


	public boolean deleteSuggestion(SuggestionsByAdmin suggObj) {
		
		suggDao.deleteSuggestion(suggObj);
		
		return false;
	}


	public SuggestionsByAdmin getSuggestionsById(int suggId) {
		
		return suggDao.getSuggestionsById(suggId);
	}


	public List<SuggestionsByAdmin> getSuggestionsByRequestId(int reqId) {
		
		List <SuggestionsByAdmin> suggList=suggDao.getSuggestionsByRequestId(reqId);
		
		return suggList;
	}

}
