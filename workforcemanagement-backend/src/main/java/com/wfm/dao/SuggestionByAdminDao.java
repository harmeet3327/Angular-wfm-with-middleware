package com.wfm.dao;

import java.util.List;

import com.wfm.models.ResourcesRoles;
import com.wfm.models.Skills;
import com.wfm.models.SuggestionsByAdmin;

public interface SuggestionByAdminDao {

	public boolean addSuggestions(SuggestionsByAdmin sObj);
	public List<SuggestionsByAdmin> getAllSuggestion();
	public List<Integer> getSuggestinsByRequestId(int reqId);
	public boolean deleteSuggestion(SuggestionsByAdmin suggObj);
	public SuggestionsByAdmin getSuggestionsById(int suggId);
	public List<SuggestionsByAdmin> getSuggestionsByRequestId(int reqId);
}
