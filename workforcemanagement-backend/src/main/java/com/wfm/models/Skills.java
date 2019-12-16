package com.wfm.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SKILLS")
public class Skills {
	
	@Id
	@Column(name="SKILL_ID")
	private Integer skillId;
	
	@Column(name="SKILL_NAME")
	private String skillName;
	
	
	
	public Integer getSkillId() {
		return skillId;
	}
	public String getSkillName() {
		return skillName;
	}
	@Override
	public String toString() {
		return "Skills [skillId=" + skillId + ", skillName=" + skillName + "]";
	}
	
	

}
