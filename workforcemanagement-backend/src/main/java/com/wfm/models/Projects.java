package com.wfm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROJECTS")
public class Projects {
	
	@Id
	@Column(name="PROJECT_ID")
	private Integer projectId;
	
	@Column(name="PROJECT_NAME")
	private String projectName;
	
	@Column(name="PROJECT_START_DATE")
	private Date projectStartDate;
	
	@Column(name="PROJECT_END_DATE")
	private  Date projectEndDate;
	
	
	public Integer getProjectId() {
		return projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public Date getProjectStartDate() {
		return projectStartDate;
	}
	public Date getProjectEndDate() {
		return projectEndDate;
	}
	@Override
	public String toString() {
		return "Projects [projectId=" + projectId + ", projectName=" + projectName + ", projectStartDate="
				+ projectStartDate + ", projectEndDate=" + projectEndDate + "]";
	}
	

}
