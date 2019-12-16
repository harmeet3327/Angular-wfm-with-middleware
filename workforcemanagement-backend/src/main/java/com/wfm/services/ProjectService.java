package com.wfm.services;

import java.util.List;

import com.wfm.models.Projects;

public interface ProjectService {
	
	public List<Projects> getAllProjects();
	public Projects getProjectById(int projectId);

}
