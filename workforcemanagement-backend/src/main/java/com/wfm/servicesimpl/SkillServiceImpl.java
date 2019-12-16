package com.wfm.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.SkillsDao;
import com.wfm.models.Skills;
import com.wfm.services.SkillService;


@Service("skillService")
@Transactional
public class SkillServiceImpl implements SkillService
{
	
	@Autowired SkillsDao skillDao;


	public List<Skills> getAllSkills() {
		
		return skillDao.getAllSkills();
	}


	public Skills getSkillById(int sId) {
		
		return skillDao.getSkillById(sId);
	}

}
