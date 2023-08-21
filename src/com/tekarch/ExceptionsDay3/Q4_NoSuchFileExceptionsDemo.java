package com.tekarch.ExceptionsDay3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q4_NoSuchFileExceptionsDemo {

	public static void main(String[] args) {

		File f=new File(System.getProperty("user.dir")+"/file.txt");
		
		try {
			FileInputStream fi=new FileInputStream(f);
			
			fi.close();
		} catch (FileNotFoundException e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.getClass());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}

}
