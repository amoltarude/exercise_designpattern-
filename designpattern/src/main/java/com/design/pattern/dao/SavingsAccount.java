package com.design.pattern.dao;

import org.slf4j.Logger;

import com.designpattern.log.singleton.Logback;


public class SavingsAccount implements Account {

	private static final Logger logger = Logback.getInstance();
	
	public void makeDeposit() {
		logger.info("Made a deposit");
	}

	public void makeWithDrawal() {
		logger.info("Made a withdrawal");
	}

}
