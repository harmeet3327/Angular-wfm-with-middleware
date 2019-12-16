package com.wfm.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="RESOURCE_ROLE")
public class ResourcesRoles {
	
	@Id
	@Column(name="ROLE_ID")
	private Integer roleId;
	
	@Column(name="ROLE_TYPE")
	private String roleType;
	
	
	
	public Integer getRoleId() {
		return roleId;
	}
	public String getRoleType() {
		return roleType;
	}
	@Override
	public String toString() {
		return "ResourceRole [roleId=" + roleId + ", roleType=" + roleType + "]";
	}
	
	

}
