package com.designpattern.log.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logback {
	private static Logger logger;
    private Logback() {
    	
    }
    
    public static synchronized Logger getInstance() {
    	
    	if(logger == null) {
    		logger = LoggerFactory.getLogger(Logback.class);
    	}
    	
    	return logger;
    }
}
