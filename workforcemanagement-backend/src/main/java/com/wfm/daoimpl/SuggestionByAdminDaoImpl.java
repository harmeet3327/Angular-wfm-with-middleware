package com.wfm.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wfm.dao.SuggestionByAdminDao;
import com.wfm.models.Skills;
import com.wfm.models.SuggestionsByAdmin;

@Repository("suggDao")
public class SuggestionByAdminDaoImpl implements SuggestionByAdminDao {

	@Autowired
	private SessionFactory sessionFactory;
	public boolean addSuggestions(SuggestionsByAdmin sObj) {
		
		try {
			Session session=sessionFactory.getCurrentSession();
			session.persist(sObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}
	public List<SuggestionsByAdmin> getAllSuggestion() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.SuggestionsByAdmin");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
}
	public List<Integer> getSuggestinsByRequestId(int reqId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("select resourceId from com.wfm.models.SuggestionsByAdmin where reqId=:x ");
			 query.setParameter("x", reqId);
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
}
	public boolean deleteSuggestion(SuggestionsByAdmin suggObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.delete(suggObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}
	public SuggestionsByAdmin getSuggestionsById(int suggId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			SuggestionsByAdmin suggObj=session.get(SuggestionsByAdmin.class,suggId);
			return suggObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}
	public List<SuggestionsByAdmin> getSuggestionsByRequestId(int reqId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.SuggestionsByAdmin where reqId=:x ");
			 query.setParameter("x", reqId);
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
		return null;
}
}