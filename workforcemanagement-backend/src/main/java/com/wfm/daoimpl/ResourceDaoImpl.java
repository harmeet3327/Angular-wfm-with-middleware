package com.wfm.daoimpl;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.wfm.dao.ResourceDao;
import com.wfm.models.ResourcesDetail;

@Repository("resDao")

public class ResourceDaoImpl implements ResourceDao {

	@Autowired
	private SessionFactory sessionFactory;
	@Autowired ResourceDao resDao;
	
	public boolean addResourse(ResourcesDetail rdObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.persist(rdObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}
	
	public List<ResourcesDetail> getAllResources() {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.ResourcesDetail");
			return query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		return null;
	}

	public ResourcesDetail validateResource(int rId,String rPassward)
	{
		try {
			System.out.println("in Dao");
			Session session=sessionFactory.getCurrentSession();
			ResourcesDetail rObj=session.get(ResourcesDetail.class, rId);
			
		 
			if(rObj!=null){
				if(rObj.getrPassward().equals(rPassward)){
					return rObj;
				}
			}
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
		
		
		
		
	}


	public ResourcesDetail getResourceById(int rId) {
		try {
			Session session=sessionFactory.getCurrentSession();
			ResourcesDetail rObj=session.get(ResourcesDetail.class,rId);
			return rObj;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}

	public List<ResourcesDetail> getResourceByTypes(int rlId, int exp, String skill) {
		try {
			Session session=sessionFactory.getCurrentSession();
			Query query=session.createQuery("from com.wfm.models.ResourcesDetail where roleId=:x and rExperience=:y and rStatus=:xy and rSkills like :z ");
			query.setParameter("x", rlId);
			query.setParameter("y", exp);
			query.setParameter("xy","BENCH");
			query.setParameter("z", "%"+skill+"%");
			return  query.list();
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return null;
	}

	public boolean updateResource(ResourcesDetail rObj) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.update(rObj);
			return true;
			}
			catch(Exception e){
				e.printStackTrace();
			}
			return false;
	}

	public boolean updateResourceListStatusToBench(int rId) {
        try {
            Session session=sessionFactory.getCurrentSession();
            Query q=session.createQuery("update com.wfm.models.ResourcesDetail set rStatus = 'BENCH'" +" where rId =:rId");
            q.setParameter("rId",rId);
      
            int result =q.executeUpdate();
            System.out.println("result : "+result);
            return true;
            }
            catch(Exception e){
                   System.out.println("Problem in changing Left list to update status BENCH");
                   e.printStackTrace();
            }
            return false;


}

	public List<ResourcesDetail> getResourcesById(List<Integer> suggReslist) {
		ResourcesDetail obj =new ResourcesDetail();
        List<ResourcesDetail> resourceList =new ArrayList();
        ListIterator<Integer> iterator = suggReslist.listIterator(); 
        while (iterator.hasNext()) { 
              obj=resDao.getResourceById(iterator.next());
           
                    resourceList.add(obj);       
        	}
		return resourceList;

}
}
