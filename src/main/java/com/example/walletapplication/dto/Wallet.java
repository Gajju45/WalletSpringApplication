package com.example.walletapplication.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Wallet {

	@Id
	private Integer walletId;
	
	//@Column(name = "Holder Name")
	private String walletHolderName;
	
	private Double walletBalance;
	
	private String walletPassword;
	
	public Wallet() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Wallet(Integer walletId, String walletHolderName, Double walletBalance, String walletPassword) {
		super();
		this.walletId = walletId;
		this.walletHolderName = walletHolderName;
		this.walletBalance = walletBalance;
		this.walletPassword = walletPassword;
	}



	public Integer getWalletId() {
		return walletId;
	}



	public void setWalletId(Integer walletId) {
		this.walletId = walletId;
	}



	public String getWalletHolderName() {
		return walletHolderName;
	}



	public void setWalletHolderName(String walletHolderName) {
		this.walletHolderName = walletHolderName;
	}



	public Double getWalletBalance() {
		return walletBalance;
	}



	public void setWalletBalance(Double walletBalance) {
		this.walletBalance = walletBalance;
	}



	public String getWalletPassword() {
		return walletPassword;
	}



	public void setWalletPassword(String walletPassword) {
		this.walletPassword = walletPassword;
	}



	@Override
	public String toString() {
		return "walletDemo [walletId=" + walletId + ", walletHolderName=" + walletHolderName + ", walletBalance="
				+ walletBalance + ", walletPassword=" + walletPassword + "]";
	}

}
