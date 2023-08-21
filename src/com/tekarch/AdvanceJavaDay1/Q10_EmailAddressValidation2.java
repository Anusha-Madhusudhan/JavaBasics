package com.tekarch.AdvanceJavaDay1;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/*
 *  local part = username
    @ = @
    domain = domain.com
    
  
}
 * 
 */

public class Q10_EmailAddressValidation2 {
	public static void main(String[] args) {
		// username@domain.com
		// Validating Email contains 
		// username=> any lowercase and uppercase characters , numbers . - _ 
		// @
		// domain=> any lowercase and uppercase characters and dot(.)
		// no consecutive dots(..)
		
		List<String> emailList=new ArrayList<String>();
		
		emailList.add("xyz@domain");
		emailList.add("xyz_23@domain.in");
		emailList.add("xyz@");
		emailList.add("xyz123");
		emailList.add("xyz@123..in");
		emailList.add(".xyz@12.3");
		emailList.add("xyz.34@domain.com");
		emailList.add("@123");
		emailList.add("xyz@123");
		emailList.add("xyz@123.");
		
		for (String email : emailList) {
			validateEmail(email);
		}
	}

	private static void validateEmail(String email) {
//		String regExp="^[a-zA-Z0-9-_]+(?:\\.[a-zA-Z0-9-_]+)*@[a-zA-Z0-9]+(?:\\.[a-zA-Z0-9-]+)*$";
		
		String regExp="^[A-Za-z0-9+_.-]+@(?!\\.)(?!.*\\.\\.)(?!.*\\.$)[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";
		
		// ^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+)\\.[A-Za-z]{2,4}$
		
		// ^[A-Za-z0-9+_.-]+@(.+)$
		
		// "^[A-Za-z0-9+_.-]+@(?!\\.)(?!.*\\.\\.)(?!.*\\.$)[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$";

//		//  ^[a-zA-Z0-9_+&*-]+(?:\\."+
//        "[a-zA-Z0-9_+&*-]+)*@" +
//        "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
//        "A-Z]{2,7}$";
		
		System.out.println(email+"  =======> "+Pattern.matches(regExp, email));
		System.out.println();
		
	//	^[a-zA-Z0-9-_]+(?:\\.[a-zA-Z0-9-_]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$
	}

}















