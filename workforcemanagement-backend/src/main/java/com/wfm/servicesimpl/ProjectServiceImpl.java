package com.wfm.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.ProjectsDao;
import com.wfm.models.Projects;
import com.wfm.services.ProjectService;

@Service("projService")
@Transactional
public class ProjectServiceImpl implements ProjectService {

	@Autowired ProjectsDao projDao; 

	public List<Projects> getAllProjects() {
		
		return projDao.getAllProjects();
	}

	public Projects getProjectById(int projectId) {
	
		return projDao.getProjectById(projectId);
	}
	
	}

