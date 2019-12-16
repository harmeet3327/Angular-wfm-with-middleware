package com.wfm.dao;

import java.util.List;

import com.wfm.models.ResourcesDetail;

public interface ResourceDao {
	
	public boolean addResourse(ResourcesDetail rdObj);
	public List<ResourcesDetail> getAllResources();
	public ResourcesDetail validateResource(int rId,String rPassward);
	public ResourcesDetail getResourceById(int rId);
	public List<ResourcesDetail> getResourceByTypes(int rlId,int exp,String skill);
	public boolean updateResource(ResourcesDetail rObj);
	public boolean updateResourceListStatusToBench(int rId); 
	public List<ResourcesDetail> getResourcesById(List<Integer> suggReslist);
}
