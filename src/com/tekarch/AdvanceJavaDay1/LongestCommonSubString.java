package com.tekarch.AdvanceJavaDay1;

//Java implementation of
//finding length of longest
//Common substring using
//Dynamic Programming
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LongestCommonSubString {
	public static void main(String[] args) {
		String s1="ABCDXYZ";
		String s2="XYZABCD";
		String str1=s1.replaceAll(" ", "");
		String str2=s2.replaceAll(" ", "");
		char[] c1=str1.toCharArray();
		char[] c2=str2.toCharArray();
		
		List<String> subStringList=new ArrayList<String>();
		
		int n;
		for (int i = 0; i < c1.length; i++) {
			String subStr="";
			n=i;
			for (int j = 0; j < c2.length; j++) {
				if(c1[n]==(c2[j])) {
					subStr=subStr.concat(String.valueOf(c1[n]));
					subStringList.add(subStr);
					if(n<c1.length-1) {   // when index of first string comes to an end break the loop.
						
						  n++;
						  
						}
//						else {
//							continue; // continue if 1st sting length comes to end. 
//						}
					}
				else if (subStr.equals("")) { 
					continue;
				}else {
					break;}
				}
		}
		System.out.println(" ------- All the common substrings ----");
		for (String s : subStringList) {
			
			System.out.println(s);
			}
		String longest=subStringList.get(0);
         for (int x=1;x<subStringList.size();x++) {
			
			if(longest.length()<subStringList.get(x).length()) {
				longest=subStringList.get(x);
			}
			}
         System.out.println("longest common subString is--->"+longest +"   Length is:"+longest.length());
	}
}




