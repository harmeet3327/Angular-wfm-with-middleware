package com.wfm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="RESOURCE_DETAILS")
public class ResourcesDetail {

	@Id
	@SequenceGenerator(initialValue=420, allocationSize=1, name = "rId_seq",sequenceName="rId_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="rId_seq")
	@Column(name="RESOURCE_ID")
	private Integer rId;
	
	@Column(name="RESOURCE_NAME")
    @NotEmpty(message = "Name should not be empty")
	private String rName;
	
	@OneToOne
	@JoinColumn(name="RESOURCE_ROLE_ID",insertable=false,updatable=false)
	private ResourcesRoles role;
	
	@Column(name="RESOURCE_ROLE_ID")
    @Min(value = 200, message = "Select Role")
	private int roleId;
	
	@Column(name="RESOURCE_EXPERIENCE")
	 @Min(value = 0, message = " Enter Valid Experience")
	@NotNull(message = "Experience should not be empty")
	
	private Integer rExperience;
	
	@Column(name="RESOURCE_PASSWORD")
	private	String rPassward;
	
	@Column(name="RESOURCE_EMAIL")
    @NotEmpty(message = "Please enter your Email")
	private String rEmail;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="RESOURCE_DOB")
	@NotNull(message = "Select DOB date")
    //@Past(message = " DOB can't be future or current date.")
	private Date rDOB;
	
	@Column(name="RESOURCE_GENDER")
	@NotEmpty(message = "Gender should not be empty")
	private String rGender;
	
	@Column(name="RESOURCE_MARITAL_STATUS")
    @NotEmpty(message = "Marital status should not be empty")
	private String rMaritalStatus;
	
	@Column(name="RESOURCE_PHONE_NUMBER")
	//@Size(min = 10, max = 10,message="no should be of 10 digits")
	private Long rPhoneNumber;
	
	@Column(name="RESOURCE_SKILLS")
    @NotEmpty(message = "Skills should not be empty")
	private String rSkills;
	
	@Column(name="RESOURCE_STATUS")
	private String rStatus;
	
	@OneToOne
	@JoinColumn(name="RESOURCE_PROJECT_ID",insertable=false,updatable=false)
	private Projects project;
	
	@Column(name="RESOURCE_PROJECT_ID")
	private int projectId;

	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="RESOURCE_START_DATE")
	private Date rProStartDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="RESOURCE_END_DATE")
	private Date rProEndDate;

	public Integer getrId() {
		return rId;
	}

	public void setrId(Integer rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public ResourcesRoles getRole() {
		return role;
	}

	public void setRole(ResourcesRoles role) {
		this.role = role;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public Integer getrExperience() {
		return rExperience;
	}

	public void setrExperience(Integer rExperience) {
		this.rExperience = rExperience;
	}

	public String getrPassward() {
		return rPassward;
	}

	public void setrPassward(String rPassward) {
		this.rPassward = rPassward;
	}

	public String getrEmail() {
		return rEmail;
	}

	public void setrEmail(String rEmail) {
		this.rEmail = rEmail;
	}

	public Date getrDOB() {
		return rDOB;
	}

	public void setrDOB(Date rDOB) {
		this.rDOB = rDOB;
	}

	public String getrGender() {
		return rGender;
	}

	public void setrGender(String rGender) {
		this.rGender = rGender;
	}

	public String getrMaritalStatus() {
		return rMaritalStatus;
	}

	public void setrMaritalStatus(String rMaritalStatus) {
		this.rMaritalStatus = rMaritalStatus;
	}

	public Long getrPhoneNumber() {
		return rPhoneNumber;
	}

	public void setrPhoneNumber(Long rPhoneNumber) {
		this.rPhoneNumber = rPhoneNumber;
	}

	public String getrSkills() {
		return rSkills;
	}

	public void setrSkills(String rSkills) {
		this.rSkills = rSkills;
	}

	public String getrStatus() {
		return rStatus;
	}

	public void setrStatus(String rStatus) {
		this.rStatus = rStatus;
	}

	public Projects getProject() {
		return project;
	}

	public void setProject(Projects project) {
		this.project = project;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public Date getrProStartDate() {
		return rProStartDate;
	}

	public void setrProStartDate(Date rProStartDate) {
		this.rProStartDate = rProStartDate;
	}

	public Date getrProEndDate() {
		return rProEndDate;
	}

	public void setrProEndDate(Date rProEndDate) {
		this.rProEndDate = rProEndDate;
	}

	@Override
	public String toString() {
		return "ResourcesDetail [rId=" + rId + ", rName=" + rName + ", role=" + role + ", roleId=" + roleId
				+ ", rExperience=" + rExperience + ", rPassward=" + rPassward + ", rEmail=" + rEmail + ", rDOB=" + rDOB
				+ ", rGender=" + rGender + ", rMaritalStatus=" + rMaritalStatus + ", rPhoneNumber=" + rPhoneNumber
				+ ", rSkills=" + rSkills + ", rStatus=" + rStatus + ", project=" + project + ", projectId=" + projectId
				+ ", rProStartDate=" + rProStartDate + ", rProEndDate=" + rProEndDate + "]";
	}

	}