package com.designpattern.main;

import org.slf4j.Logger;

import com.design.pattern.dao.Account;
import com.designpattern.log.singleton.Logback;


public class CurrentAccount implements Account {

private static final Logger logger = Logback.getInstance();
	
	public void makeDeposit() {
		logger.info("Made a deposit");
	}

	public void makeWithDrawal() {
		logger.info("Made a withdrawal");
	}
}
