package com.wfm.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wfm.dao.ResourceDao;
import com.wfm.dbconfig.DBConfig;
import com.wfm.models.ResourcesDetail;

import javafx.beans.binding.SetBinding;

import org.junit.Assert;

public class ResourceUTest {
	
	private static ResourceDao resDao ;
	
	@BeforeClass
	public static void init(){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
		resDao=context.getBean(ResourceDao.class);
   	 	
	}

	@Test
	@Ignore
	public void getAllResourcesTest(){
		List<ResourcesDetail> rList=resDao.getAllResources();
		System.out.println(rList);
		Assert.assertNotEquals("Not Resources Found...", rList.size(),0);
	}
	@Test
	public void validateUserUTest() 
	{
		ResourcesDetail rObj=resDao.getResourceById(412);
		System.out.println(rObj);
		assertNotNull("Product with given id doesnt exist", rObj);
		
//		int rId=pObj.getrId();
//		String rPassward=pObj.getrPassward();
//		resDao.validateResource(rId,rPassward);
//		
	}

}
