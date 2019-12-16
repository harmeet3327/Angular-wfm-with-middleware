package com.wfm.test;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.wfm.dao.SkillsDao;
import com.wfm.dbconfig.DBConfig;
import com.wfm.models.Skills;

public class SkillsUTest {
	
	private static SkillsDao skillDao ;
	
	@BeforeClass
	public static void init(){
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
		
		skillDao=context.getBean(SkillsDao.class);
   	 	
	}

	@Test
	public void getAllProjectsTest(){
		List<Skills> sList=skillDao.getAllSkills();
		System.out.println(sList);
		Assert.assertNotEquals("Not Skills Found...", sList.size(),0);
	}
}


