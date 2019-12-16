package com.wfm.dao;

import java.util.List;


import com.wfm.models.Skills;

public interface SkillsDao {
	public List<Skills> getAllSkills();
	public Skills getSkillById(int sId);

}
