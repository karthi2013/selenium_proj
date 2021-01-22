package com.utility;

import common.Logger;

public class Log {
	
	//Initialize Log4j logs
	private static Logger log = Logger.getLogger(Log.class);
	
	public static void info(String msg) {
		log.info(msg);
	}

}
