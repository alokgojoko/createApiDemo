package com.mcf.pojoclasses;

import java.util.List;

public class SerializeData {

	private User user;
	private Loan loan;
	private String aggregator;
	private String loanProductID;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Loan getLoan() {
		return loan;
	}
	public void setLoan(Loan loan) {
		this.loan = loan;
	}
	public String getAggregator() {
		return aggregator;
	}
	public void setAggregator(String aggregator) {
		this.aggregator = aggregator;
	}
	public String getLoanProductID() {
		return loanProductID;
	}
	public void setLoanProductID(String loanProductID) {
		this.loanProductID = loanProductID;
	}
	
}
