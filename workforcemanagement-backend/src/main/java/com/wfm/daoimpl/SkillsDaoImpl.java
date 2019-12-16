package com.wfm.daoimpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.SkillsDao;
import com.wfm.models.ResourcesRoles;
import com.wfm.models.Skills;

@Repository("skillDao")

public class SkillsDaoImpl implements SkillsDao {

	@Autowired
	private SessionFactory sessionFactory;
	

	public List<Skills> getAllSkills() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.Skills");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;

}


	public Skills getSkillById(int sId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Skills sObj=session.get(Skills.class,sId);
			return sObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}
}
