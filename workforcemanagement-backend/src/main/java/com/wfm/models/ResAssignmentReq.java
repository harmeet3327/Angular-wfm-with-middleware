package com.wfm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="RESOURCE_ASSIGNMENT_REQUEST")
public class ResAssignmentReq {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RAR_ID")
	private Integer reqId;
	
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="RAR_PROJECT_ID",insertable=false,updatable=false)
	private Projects project;
	
	@Column(name="RAR_PROJECT_ID")
	private int projectId;
	 
	@OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="RAR_ROLE_ID",insertable=false,updatable=false)
	private ResourcesRoles role;
	
	@Column(name="RAR_ROLE_ID")
	@Min(value = 200, message = "It is mandatory to specify role")
    private int rarRoleId;
	
	@Column(name="RAR_REQUIRED_EXPERIENCE")
	 @NotNull(message = "Experience should not be empty")
	private Integer reqRequiredExp;
	
	@Column(name="RAR_SKILL")
    @NotEmpty(message = "Skills should not be empty")
	private String reqSkills;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	//@Future(message="Date should be future date")
	@NotNull(message = "Select date")
	@Column(name="RAR_START_DATE")
	private Date reqProjStartDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	//@Future(message="Date should be future date")
	@NotNull(message = "Select date")
	@Column(name="RAR_END_DATE")
	private Date reqProjEndDate;
	
	@Column(name="RAR_REMARKS")
	private String reqRemarks;
	
	@Column(name="RAR_FLAG")
	private String reqFlag;

	public Integer getReqId() {
		return reqId;
	}

	public void setReqId(Integer reqId) {
		this.reqId = reqId;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}

	public ResourcesRoles getRole() {
		return role;
	}

	public void setRole(ResourcesRoles role) {
		this.role = role;
	}

	public Integer getReqRequiredExp() {
		return reqRequiredExp;
	}

	public void setReqRequiredExp(Integer reqRequiredExp) {
		this.reqRequiredExp = reqRequiredExp;
	}

	public String getReqSkills() {
		return reqSkills;
	}

	public void setReqSkills(String reqSkills) {
		this.reqSkills = reqSkills;
	}

	public Date getReqProjStartDate() {
		return reqProjStartDate;
	}

	public void setReqProjStartDate(Date reqProjStartDate) {
		this.reqProjStartDate = reqProjStartDate;
	}

	public Date getReqProjEndDate() {
		return reqProjEndDate;
	}

	public void setReqProjEndDate(Date reqProjEndDate) {
		this.reqProjEndDate = reqProjEndDate;
	}

	public String getReqRemarks() {
		return reqRemarks;
	}

	public void setReqRemarks(String reqRemarks) {
		this.reqRemarks = reqRemarks;
	}

	public String getReqFlag() {
		return reqFlag;
	}

	public void setReqFlag(String reqFlag) {
		this.reqFlag = reqFlag;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public int getRarRoleId() {
		return rarRoleId;
	}

	public void setRarRoleId(int rarRoleId) {
		this.rarRoleId = rarRoleId;
	}

	@Override
	public String toString() {
		return "ResAssignmentReq [reqId=" + reqId + ", project=" + project + ", projectId=" + projectId + ", role="
				+ role + ", rarRoleId=" + rarRoleId + ", reqRequiredExp=" + reqRequiredExp + ", reqSkills=" + reqSkills
				+ ", reqProjStartDate=" + reqProjStartDate + ", reqProjEndDate=" + reqProjEndDate + ", reqRemarks="
				+ reqRemarks + ", reqFlag=" + reqFlag + "]";
	}

}