package com.log4jpratices;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger log=LogManager.getLogger(App.class);
	
	public static void processData() {
		log.trace("fromtracemethod");
		log.debug("from debug");
		log.info("from thr info");
		log.warn("from arn method");
		log.error("this is from error");
		log.fatal("this is from fatal");
	}
	public static void main( String[] args )
	    {
			processData();
	    }
   
}
