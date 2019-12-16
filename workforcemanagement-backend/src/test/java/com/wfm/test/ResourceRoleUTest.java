package com.wfm.test;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wfm.dao.ResourceRoleDao;

import com.wfm.dbconfig.DBConfig;
import com.wfm.models.ResourcesRoles;;

public class ResourceRoleUTest {
	
private static ResourceRoleDao roleDao ;

@BeforeClass
public static void init(){
	
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
	
	roleDao=context.getBean(ResourceRoleDao.class);
	 	
}

@Test
public void getAllProjectsTest(){
	List<ResourcesRoles> sList=roleDao.getAllRoles();
	System.out.println(sList);
	Assert.assertNotEquals("Not Roles Found...", sList.size(),0);
}
}

