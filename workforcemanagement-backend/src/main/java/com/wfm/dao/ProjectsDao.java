package com.wfm.dao;

import java.util.List;

import com.wfm.models.Projects;
import com.wfm.models.ResourcesDetail;


public interface ProjectsDao {
	
	public List<Projects> getAllProjects();
	public Projects getProjectById(int projectId);

}
