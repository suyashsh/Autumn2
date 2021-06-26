package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class LogsCapture {
	
	public static void takeLog(String message, String className) {
	//	DOMConfigurator dm=new DOMConfigurator();
		
		
		DOMConfigurator.configure("../YTFramework/layout.xml");
		Logger log=Logger.getLogger(className);
		log.info(message);
		
		
	
	}

}


