 package com.test4.logging;

import org.apache.logging.log4j.*;

public class Demo1 {

	private static Logger log = LogManager.getLogger(Demo1.class.getName());

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		log.debug("I am debugging");

		if (5 > 4) {
			log.info("Present");
		} else {
			log.error("Present not presrnt");
		}
		log.error("Present not presrnt");
		log.fatal("this is fatal");
	}

}
