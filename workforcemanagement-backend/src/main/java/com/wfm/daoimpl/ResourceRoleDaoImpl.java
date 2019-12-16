package com.wfm.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.ResourceRoleDao;
import com.wfm.models.Projects;
import com.wfm.models.ResourcesRoles;


@Repository("roleDao")

public class ResourceRoleDaoImpl implements ResourceRoleDao {
	
	@Autowired
	private SessionFactory sessionFactory;


	public List<ResourcesRoles> getAllRoles() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.ResourcesRoles");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
	}


	public ResourcesRoles getRoleById(int roleId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			ResourcesRoles rlObj=session.get(ResourcesRoles.class,roleId);
			return rlObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}

}
