package com.sowmya.web3.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table
@Entity
@Component
public class Job 
{
	@Id
private String jobId;	
private String companyName;
private String designation;
private String eligibility;
private String salary;
private String interviewProcess;
private String jobLocation;
private String announcedDate;
private String lastDateForApply;
private String interviewDate;
private String experience;
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getEligibility() {
	return eligibility;
}
public void setEligibility(String eligibility) {
	this.eligibility = eligibility;
}
public String getSalary() {
	return salary;
}
public void setSalary(String salary) {
	this.salary = salary;
}
public String getInterviewProcess() {
	return interviewProcess;
}
public void setInterviewProcess(String interviewProcess) {
	this.interviewProcess = interviewProcess;
}
public String getJobLocation() {
	return jobLocation;
}
public void setJobLocation(String jobLocation) {
	this.jobLocation = jobLocation;
}
public String getJobId() {
	return jobId;
}
public void setJobId(String jobId) {
	this.jobId = jobId;
}
public String getAnnouncedDate() {
	return announcedDate;
}
public void setAnnouncedDate(String announcedDate) {
	this.announcedDate = announcedDate;
}
public String getLastDateForApply() {
	return lastDateForApply;
}
public void setLastDateForApply(String lastDateForApply) {
	this.lastDateForApply = lastDateForApply;
}
public String getInterviewDate() {
	return interviewDate;
}
public void setInterviewDate(String interviewDate) {
	this.interviewDate = interviewDate;
}
public String getExperience() {
	return experience;
}
public void setExperience(String experience) {
	this.experience = experience;
}

}

