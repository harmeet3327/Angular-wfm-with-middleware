package com.wfm.services;

import java.util.List;

import com.wfm.models.ResourcesRoles;

public interface ResourcesRoleService {
	public List<ResourcesRoles> getAllRoles();
	public ResourcesRoles getRoleById(int roleId);

}
