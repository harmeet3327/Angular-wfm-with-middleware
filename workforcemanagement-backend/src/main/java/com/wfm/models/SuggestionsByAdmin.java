package com.wfm.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="SUGGESTIONS_BY_ADMIN_TAB")

public class SuggestionsByAdmin {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="SUGGESTION_ID")
	private Integer suggId;
	
    @OneToOne
    @JoinColumn(name="SUGGESTION_RESOURCE_ID",insertable=false,updatable=false)
	private ResourcesDetail resource;
    
    @OneToOne
    @JoinColumn(name="SUGGESTION_REQUEST_ID",insertable=false,updatable=false)
    private ResAssignmentReq request;
	
    @Column(name="SUGGESTION_RESOURCE_ID")
    private int resourceId;
    
    @Column(name="SUGGESTION_REQUEST_ID")
    private int reqId;

	public Integer getSuggId() {
		return suggId;
	}

	public void setSuggId(Integer suggId) {
		this.suggId = suggId;
	}

	public ResourcesDetail getResource() {
		return resource;
	}

	public void setResource(ResourcesDetail resource) {
		this.resource = resource;
	}

	public ResAssignmentReq getRequest() {
		return request;
	}

	public void setRequest(ResAssignmentReq request) {
		this.request = request;
	}

	public int getResourceId() {
		return resourceId;
	}

	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}

	public int getReqId() {
		return reqId;
	}

	public void setReqId(int reqId) {
		this.reqId = reqId;
	}
	
	@Override
	public String toString() {
		return "SuggestionsByAdmin [suggId=" + suggId + ", resource=" + resource + ", request=" + request
				+ ", resourceId=" + resourceId + ", reqId=" + reqId + "]";
	}


}