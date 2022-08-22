package com.example.walletapplication.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.walletapplication.dto.Wallet;

@Repository
public interface WalletRepository  extends JpaRepository<Wallet, Integer>{

}
