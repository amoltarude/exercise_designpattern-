package com.designpattern.main;

import com.design.pattern.dao.Account;
import com.design.pattern.dao.FixedAccount;
import com.design.pattern.dao.SavingsAccount;

public class AccountFactory {

	public static Account createAccount(String accountType) {
		
		if(accountType.equals("CURRENT")) {
			return new CurrentAccount();
		}else if(accountType.equals("SAVINGS")) {
			return new SavingsAccount();
		}else if(accountType.equals("FIXED")) {
			return new FixedAccount();
		}
		return null;
		
	}
	
	public static void main(String[] args) {
		
		Account createAccount = createAccount("SAVINGS");
		
		createAccount.makeDeposit();
		
		createAccount.makeWithDrawal();
	}
}
