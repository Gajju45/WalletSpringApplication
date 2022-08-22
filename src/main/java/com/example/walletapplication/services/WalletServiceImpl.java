package com.example.walletapplication.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.walletapplication.dao.WalletRepository;
import com.example.walletapplication.dto.Wallet;



@Service
public class WalletServiceImpl implements WalletService {

	@Autowired
	private WalletRepository walletRepository;

	@Override
	public Boolean createWallet(Wallet wallet) {
		this.walletRepository.save(wallet);
		return true;
	}

	@Override
	public Boolean fundTransfer(Integer fromWalletId, Integer walletId, Double walletBalance) {
		// TODO Auto-generated method stub
		
		Optional<Wallet> fromWalletDemo = this.walletRepository.findById(fromWalletId);
		Optional<Wallet> toWalletDemo = this.walletRepository.findById(walletId);
		
		
		Wallet getWallet = fromWalletDemo.get();
		Wallet toWalletDemo1=toWalletDemo.get();

		
		Double oldBalance=getWallet.getWalletBalance();
		Double newFromBalance=oldBalance-walletBalance;
		
		Double balanceTransfer=toWalletDemo1.getWalletBalance()+walletBalance;
		
		
		
		getWallet.setWalletBalance(newFromBalance);
		toWalletDemo1.setWalletBalance(balanceTransfer);
		
		this.walletRepository.save(getWallet);
		this.walletRepository.save(toWalletDemo1);
		
		
		
		return true;
	}

	@Override
	public Boolean updatePassword(Integer walletId, String newPassword) {
		// TODO Auto-generated method stub
		
		Optional<Wallet> foundWallet = this.walletRepository.findById(walletId);
		
		Wallet getWallet=foundWallet.get();
		getWallet.setWalletPassword(newPassword);
		
		this.walletRepository.save(getWallet);
		
		
		return true;
	}

	@Override
	public Boolean addFund(Integer walletId, Double walletBalance) {
		Optional<Wallet> foundWallet = this.walletRepository.findById(walletId);
		if (foundWallet.isPresent()) {
			Wallet getWallet = foundWallet.get();
			Double oldBalance = getWallet.getWalletBalance();
			Double newBalanceDouble = oldBalance + walletBalance;
			getWallet.setWalletBalance(newBalanceDouble);
			this.walletRepository.save(getWallet);
		}

		return true;
	}

	@Override
	public Boolean withdrawFund(Integer walletId, Double balanceWithdraw) {
		
		Optional<Wallet> widthrwawFund = this.walletRepository.findById(walletId);
		
		if(widthrwawFund.isPresent())
		{
			Wallet getWallet = widthrwawFund.get();
			Double oldBalance = getWallet.getWalletBalance();
			Double newBalanceDouble = oldBalance - balanceWithdraw;
			getWallet.setWalletBalance(newBalanceDouble);
			this.walletRepository.save(getWallet);
		}

		return true;
	}

	@Override
	public Boolean deleteWallet(Integer walletId) {
		Optional<Wallet> foundWallet = this.walletRepository.findById(walletId);
		if (foundWallet.isPresent()) {
			this.walletRepository.deleteById(walletId);
		}
		return true;
	}

}
