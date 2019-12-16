package com.wfm.models;

import java.util.Date;

public class ReqTracking {
	
	private Integer reqTId;
	private Integer reqId;
	private Date reqModifiedDate;
	private Date reqModifiedByResId;
	public Integer getReqTId() {
		return reqTId;
	}
	public void setReqTId(Integer reqTId) {
		this.reqTId = reqTId;
	}
	public Integer getReqId() {
		return reqId;
	}
	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}
	public Date getReqModifiedDate() {
		return reqModifiedDate;
	}
	public void setReqModifiedDate(Date reqModifiedDate) {
		this.reqModifiedDate = reqModifiedDate;
	}
	public Date getReqModifiedByResId() {
		return reqModifiedByResId;
	}
	public void setReqModifiedByResId(Date reqModifiedByResId) {
		this.reqModifiedByResId = reqModifiedByResId;
	}
	@Override
	public String toString() {
		return "ReqTracking [reqTId=" + reqTId + ", reqId=" + reqId + ", reqModifiedDate=" + reqModifiedDate
				+ ", reqModifiedByResId=" + reqModifiedByResId + "]";
	}
	
	

}
