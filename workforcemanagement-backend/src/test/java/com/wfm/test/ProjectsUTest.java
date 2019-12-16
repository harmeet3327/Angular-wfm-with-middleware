package com.wfm.test;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wfm.dao.ProjectsDao;
import com.wfm.dbconfig.DBConfig;
import com.wfm.models.Projects;

public class ProjectsUTest {
	
private static ProjectsDao projDao ;
	
	@BeforeClass
	public static void init(){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
		projDao=context.getBean(ProjectsDao.class);
   	 	
	}

	@Test
	public void getAllProjectsTest(){
		List<Projects> rList=projDao.getAllProjects();
		System.out.println(rList);
		Assert.assertNotEquals("Not Resources Found...", rList.size(),0);
	}
}
