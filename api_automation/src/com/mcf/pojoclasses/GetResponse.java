package com.mcf.pojoclasses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class GetResponse {
	
	private long loanId;
	private String status;
	private float amount;
	private String currency;
	private int termInMonths;
	private String startedDate;
	private String expiryDate;
	private String monthlyRepayment;
	private float arrangementFee;
	private Float Rate;
	private String loanProductID;
	private float totalCost;
	private float annualPercentageRate;
	private String loginUrl;
	private String autoApproved;
	private String preApproved;
	private String KeyWorker;
	private String ProductType;
	private String URL;
	private List<String> rejectionReasons;
	 
	public long getLoanId() {
		return loanId;
	}
	public void setLoanId(long loanId) {
		this.loanId = loanId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getTermInMonths() {
		return termInMonths;
	}
	public void setTermInMonths(int termInMonths) {
		this.termInMonths = termInMonths;
	}
	public String getStartedDate() {
		return startedDate;
	}
	public void setStartedDate(String startedDate) {
		this.startedDate = startedDate;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getMonthlyRepayment() {
		return monthlyRepayment;
	}
	public void setMonthlyRepayment(String monthlyRepayment) {
		this.monthlyRepayment = monthlyRepayment;
	}
	public float getArrangementFee() {
		return arrangementFee;
	}
	public void setArrangementFee(float arrangementFee) {
		this.arrangementFee = arrangementFee;
	}
	public Float getRate() {
		return Rate;
	}
	public void setRate(Float rate) {
		Rate = rate;
	}
	public String getLoanProductID() {
		return loanProductID;
	}
	public void setLoanProductID(String loanProductID) {
		this.loanProductID = loanProductID;
	}
	public float getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
	public float getAnnualPercentageRate() {
		return annualPercentageRate;
	}
	public void setAnnualPercentageRate(float annualPercentageRate) {
		this.annualPercentageRate = annualPercentageRate;
	}
	public String getLoginUrl() {
		return loginUrl;
	}
	public void setLoginUrl(String loginUrl) {
		this.loginUrl = loginUrl;
	}
	public String getAutoApproved() {
		return autoApproved;
	}
	public void setAutoApproved(String autoApproved) {
		this.autoApproved = autoApproved;
	}
	public String getPreApproved() {
		return preApproved;
	}
	public void setPreApproved(String preApproved) {
		this.preApproved = preApproved;
	}
	public String getKeyWorker() {
		return KeyWorker;
	}
	public void setKeyWorker(String keyWorker) {
		KeyWorker = keyWorker;
	}
	public String getProductType() {
		return ProductType;
	}
	public void setProductType(String productType) {
		ProductType = productType;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public List<String> getRejectionReasons() {
		return rejectionReasons;
	}
	public void setRejectionReasons(List<String> rejectionReasons) {
		this.rejectionReasons = rejectionReasons;
	}
	
	
}
