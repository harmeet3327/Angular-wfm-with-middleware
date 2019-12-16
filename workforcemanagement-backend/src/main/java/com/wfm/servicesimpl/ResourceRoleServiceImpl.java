package com.wfm.servicesimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wfm.dao.ResourceDao;
import com.wfm.dao.ResourceRoleDao;
import com.wfm.models.ResourcesRoles;
import com.wfm.services.ResourcesRoleService;
@Service("roleService")
@Transactional
public class ResourceRoleServiceImpl implements ResourcesRoleService {

	@Autowired ResourceRoleDao roleDao;
	public List<ResourcesRoles> getAllRoles() {
		
		return roleDao.getAllRoles();
	}

	public ResourcesRoles getRoleById(int roleId) {
		
		return roleDao.getRoleById(roleId);
	}

}
