 package com.test5;

import org.apache.logging.log4j.*;

public class Demo5 {

	private static Logger log = LogManager.getLogger(Demo5.class.getName());

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		log.error("2222 Present not presrnt");
		if (2 > 14) {
			log.info("Present");
		} else {
			log.error("----Present not presrnt");
		}
		log.error("1111 Present not presrnt");
	}

}
