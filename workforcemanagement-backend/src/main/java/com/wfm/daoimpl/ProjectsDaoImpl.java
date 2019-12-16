package com.wfm.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.ProjectsDao;
import com.wfm.models.Projects;
import com.wfm.models.ResourcesDetail;



@Repository("projDao")
@Transactional
public class ProjectsDaoImpl implements ProjectsDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public List<Projects> getAllProjects() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.Projects");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
	}


	public Projects getProjectById(int projectId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Projects pObj=session.get(Projects.class,projectId);
			return pObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}

}
