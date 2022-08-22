package com.example.walletapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.walletapplication.dto.Wallet;
import com.example.walletapplication.services.WalletService;

@SpringBootApplication
public class WalletSpringApplication implements CommandLineRunner {

	@Autowired
	private WalletService walletService;

	public static void main(String[] args) {
		SpringApplication.run(WalletSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// walletService.createWallet(new Wallet(2,"Gajju",25000.00,"Gajju@45"));

		// walletService.withdrawFund(2, 300.00);

		// walletService.addFund(2, 300.00);

		walletService.fundTransfer(1, 2, 100.00);
		//walletService.updatePassword(1, "asdfghjkl");

	}

}
