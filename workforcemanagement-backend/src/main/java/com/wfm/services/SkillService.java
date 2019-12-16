package com.wfm.services;

import java.util.List;

import com.wfm.models.Skills;

public interface SkillService {
	public List<Skills> getAllSkills();
	public Skills getSkillById(int sId);

}
