package com.wfm.services;

import java.util.List;

import com.wfm.models.ResourcesDetail;

public interface ResourceService {
	
	public boolean addResourse(ResourcesDetail rdObj);
	public List<ResourcesDetail> getAllResources();
	public ResourcesDetail validateResource(int rId,String rPassward);
	public ResourcesDetail getResourceById(int rId);
	public List<ResourcesDetail> getResourceByTypes(int rlId,int  exp,String skill);
	public boolean updateResource(ResourcesDetail rObj);
	public boolean updateResourceListStatusToBench(List<Integer> rlist); 
	public List<ResourcesDetail> getResourcesById(List<Integer> suggReslist);
}
