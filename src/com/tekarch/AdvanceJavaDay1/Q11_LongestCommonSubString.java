package com.tekarch.AdvanceJavaDay1;

import java.util.ArrayList;

import java.util.List;

public class Q11_LongestCommonSubString {

	public static void main(String[] args) {
		String s1="Java is a programming language abc 1234 defgg abc defgg abc";
		String s2="Java is object oriented programming language def 1234 sds defgg abc";
		
		
		String[] str1=s1.split(" ");
		String[] str2=s2.split(" ");
		List<String> subStringList=new ArrayList<String>();
		int n;
		for (int i = 0; i < str1.length; i++) {
			String subStr="";
			n=i;
			for (int j = 0; j < str2.length; j++) {
				
				if(str1[n].equals(str2[j])) {
					subStr=subStr.concat(str1[n]+" ");
					subStringList.add(subStr);
					if(n<str1.length-1) {
						
						  n++;
						  
						}
						
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
         System.out.println("longest common subString is--->"+longest);
	}
}
