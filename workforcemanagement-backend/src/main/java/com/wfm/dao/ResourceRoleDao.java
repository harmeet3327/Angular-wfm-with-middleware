package com.wfm.dao;

import java.util.List;

import com.wfm.models.ResourcesDetail;
import com.wfm.models.ResourcesRoles;

public interface ResourceRoleDao {

	public List<ResourcesRoles> getAllRoles();
	public ResourcesRoles getRoleById(int roleId);
}
