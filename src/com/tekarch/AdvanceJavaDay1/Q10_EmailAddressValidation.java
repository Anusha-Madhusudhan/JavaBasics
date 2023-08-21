package com.tekarch.AdvanceJavaDay1;

import java.util.regex.Pattern;

/*
 *  local part = username
    @ = @
    domain = domain.com
    
    
    
    
    public static boolean patternMatches(String emailAddress, String regexPattern) {
    return Pattern.compile(regexPattern)
      .matcher(emailAddress)
      .matches();
}
 * 
 */

public class Q10_EmailAddressValidation {

	public static void main(String[] args) {
		
		// username@domain.com
		// Validating Email contains 
		// username=> any lowercase and uppercase characters , numbers . - _ 
		// @
		// domain=> any lowercase and uppercase characters and dot(.)
		
		String email1=".anu.sha_b28@yahoo.com.";
		
		System.out.println(email1+"  "+Pattern.matches("^[a-zA-Z0-9.-_]+@[a-zA-Z.]+$", email1)); //true
		
		// Validating email should not contain . in the begining and end of the emailId 
		
		String email2=".anu.sha_b28@yahoo.com.";
		System.out.println(email2+"  "+Pattern.matches("^[^.][a-zA-Z0-9.-_]+@[a-zA-Z.]+[^.]$", email2)); //false
		
		 String email3=  "anu.shab28@yahoo.com";                          
		// Restrict E-mail from Trailing, Consecutive, and Leading
		
		System.out.println(email3+"  "+Pattern.matches("^[a-zA-Z0-9-_]+(?:\\.[a-zA-Z0-9-_]+)*@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$",email3 )); //true

	}

}















