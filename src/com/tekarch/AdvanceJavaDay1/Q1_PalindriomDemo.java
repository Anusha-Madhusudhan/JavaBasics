package com.tekarch.AdvanceJavaDay1;

public class Q1_PalindriomDemo {

	public static void main(String[] args) {
		String str = "RACECAR";

		String revStr;

		char[] c = new char[str.length()];
		int j = 0;
		for (int i = str.length() - 1; i >= 0; i--) {

			c[j++] = str.charAt(i);

		}
		revStr = String.valueOf(c); // converting char array to String

		if (revStr.equals(str)) {
			System.out.println(" the given string " + str + " is palindrom");
		} else {
			System.out.println(" the given string " + str + " is not palindrom");
		}

	}

}
