package day4_log4j2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4Jtestcase {
	//pom.xml from https://howtodoinjava.com/log4j2/log4j-2-xml-configuration-example/
	//by default the class name is considered in the below ()
	private static Logger logger = LogManager.getLogger();
			
	public static void main(String[] args) {
	    //After each action we can enter these. And if log is on we can debug. Its better to keep it off
		logger.error("This is error message");
		logger.fatal("This is fatal message");
		logger.warn("This is warning message");
		logger.debug("This is debug message");
		logger.trace("This is trace message");
	}

}
