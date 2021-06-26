package org.testing.assertions;

public class Assert {
	
	//This is example of soft assert

	public static void Assert1(String actual,String expected) {
		if(actual.equals(expected)) {
			System.out.println("Url passes");
		}
		else {
			System.out.println("Url failed");
		}
	}
	
}
