package com.wfm.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wfm.dao.RequestAssignmentDao;
import com.wfm.models.ResAssignmentReq;
import com.wfm.models.ResourcesRoles;

@Repository("reqDao")
public class RequestAssignmentDaoImpl implements RequestAssignmentDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean raiseRequest(ResAssignmentReq rqObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.persist(rqObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}


	public List<ResAssignmentReq> getAllRequest() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.ResAssignmentReq");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
	}


	public ResAssignmentReq getReqById(int reqId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			ResAssignmentReq reqObj=session.get(ResAssignmentReq.class,reqId);
			return reqObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}


	public boolean updateRequest(ResAssignmentReq reqObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.update(reqObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}


	public List<ResAssignmentReq> getRequestByProjectId(int projectId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.ResAssignmentReq where projectId=:x and reqFlag=:y");
			query.setParameter("x", projectId);
			query.setParameter("y", "MIDDLE");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}


	public List<ResAssignmentReq> getStartRequestByProjectId(int projectId) {
		try {
			System.out.println(projectId);
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.ResAssignmentReq where projectId=:x ");
			query.setParameter("x", projectId);
			//query.setParameter("y", "START");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
	}



	public List<ResAssignmentReq> getStartRequest() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.ResAssignmentReq where reqFlag='START'");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
	}


	public List<ResAssignmentReq> getEndRequest() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.ResAssignmentReq where reqFlag='END'");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
	}
}
