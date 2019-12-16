package com.wfm.services;

import java.util.List;

import com.wfm.models.ResAssignmentReq;
import com.wfm.models.ResourcesDetail;
import com.wfm.models.SuggestionsByAdmin;

public interface SuggestionsByAdminDaoService {
	
	public boolean addSuggestions(SuggestionsByAdmin sObj,int reqId,int rId,ResourcesDetail rObj,ResAssignmentReq reqObj);
	public List<SuggestionsByAdmin> getAllSuggestion();
	public List<Integer> getSuggestinsByRequestId(int reqId) ;
	public boolean deleteSuggestion(SuggestionsByAdmin suggObj);
	public SuggestionsByAdmin getSuggestionsById(int suggId);
	public List<SuggestionsByAdmin> getSuggestionsByRequestId(int reqId) ;
}
