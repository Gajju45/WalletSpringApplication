package com.example.walletapplication.services;

import java.util.List;

import com.example.walletapplication.dto.Wallet;

import ch.qos.logback.core.Context;

public interface WalletService {

	Boolean createWallet(Wallet  wallet);

	Boolean fundTransfer(Integer fromWalletId, Integer walletId, Double walletBalance);
	
	Boolean updatePassword(Integer walletId, String newPassword);
	
	Boolean addFund(Integer walletId, Double walletBalance);
	
	Boolean withdrawFund(Integer walletId, Double balanceWithdraw);
	

	Boolean deleteWallet(Integer walletId);
	
	
}
