package com.tech.bean;

public class ApprovalBean {
	
	private int EnquiryId;
	private String CustomerName;
	private String JobType;
	private int LoanAmount;
	private int InterstRate;
	public int getEnquiryId() {
		return EnquiryId;
	}
	public void setEnquiryId(int enquiryId) {
		EnquiryId = enquiryId;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getJobType() {
		return JobType;
	}
	public void setJobType(String jobType) {
		JobType = jobType;
	}
	public int getLoanAmount() {
		return LoanAmount;
	}
	public void setLoanAmount(int loanAmount) {
		LoanAmount = loanAmount;
	}
	public int getInterstRate() {
		return InterstRate;
	}
	public void setInterstRate(int interstRate) {
		InterstRate = interstRate;
	}
}
