package com.tekarch.AdvanceJavaDay5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

public class FileHandlingDemo {
	
	static void readingFromPropertiesFile(String path) {
		
		File f=new File(path);
		Properties pro;
		try {
			FileInputStream fi=new FileInputStream(f);
			pro=new Properties();
			pro.load(fi);
			
			//System.out.println(pro.getProperty("name"));
			
		
			
			Set entrySet=pro.entrySet();
			
			Iterator itr=entrySet.iterator();
			
			while (itr.hasNext()) {
				
				Map.Entry e=(Entry) itr.next();
				
				System.out.println(e.getKey()+"   "+e.getValue());
			}
			
			fi.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
     static void writingToPropertiesFile(String path) {
    	 
    	 File f=new File(path);
    	 Properties pro;
    	 try {
			FileOutputStream fo=new FileOutputStream(f);
			pro=new Properties();
			
			pro.setProperty("name", "Krishna");
			pro.setProperty("ID", "100");
			pro.setProperty("Language", "English");
			pro.store(fo, "Information about Student");
			
			fo.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
     
     private static void readingFromTextFile(String filePath3) {
    	 
    	 File f=new File(filePath3);
    	 
    	 // Approach 1 Using BufferReader
    	 
    	 
    	 
//    	 try {
//    		 
//    		FileReader reader=new FileReader(f);
//			BufferedReader br=new BufferedReader(reader);
//			
//			String str="";
//			
//			while((str=br.readLine())!=null) {
//				System.out.println(str);
//			}
//			br.close();
//			reader.close();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
    	 
    	 // *********************************************************//
    	 // Using FileReader class
    	 
//    	 try {
//			FileReader reader=new FileReader(f);
//			
//			int n;
//			
//			while((n=reader.read())!=-1){
//				 System.out.print((char)n);
//			}
//			
//			reader.close();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
    	
    	 
    	 // ********************************************************
    	 // Using FileInputStream reader
    	 
    	 
    	 try {
 			FileInputStream reader=new FileInputStream(f);
 			
 			int n;
 			
 			while((n=reader.read())!=-1){
 				 System.out.print((char)n);
 			}
 			
 			reader.close();
 			
 		} catch (FileNotFoundException e) {
 			e.printStackTrace();
 		} catch (IOException e) {
 			e.printStackTrace();
 		}
    	 
    	 
    	 // Using Scanner class **************************
    	 
//    	 try {
//			Scanner reader=new Scanner(f);
//			while (reader.hasNextLine()) {
//				System.out.println(reader.nextLine());
//				
//			}
//			
//			reader.close();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
    	 
    	 
    	 // ********************************************
    	 
 		
 	}
     
     
     
     

 	private static void writingDataToTextFile(String filePath4) {
 		
 		File f=new File(filePath4);
// 		try {
//			FileWriter writer=new FileWriter(f);
//			
//			writer.write("Java is a programming language \n");
//			
//			writer.write("Learning Java is fun\n");
//			writer.write("Happy Learning\n");
//			
//			writer.close();
//			
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
 		
// 		try {
// 			FileWriter writer=new FileWriter(f);
//			
//			BufferedWriter bw=new BufferedWriter(writer);
//			
//			bw.write("Java is a programming language \n");
//			
//			
//			
//			bw.close();
//			writer.close();
//			
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
 		
 		
 		try {
			FileOutputStream fo=new FileOutputStream(f);
			
			String str="Java is a programming language \nLearning Java is fun\nHappy Learning\n";
			byte[] b=str.getBytes();
			
			fo.write(b);
			
			fo.close();
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
 		
 		
 		
 		
 	}

	public static void main(String[] args) {

		String filePath=System.getProperty("user.dir")+"/Files/file1.properties";
		
		String filePath2=System.getProperty("user.dir")+"/Files/file2.properties";
		
		String filePath3=System.getProperty("user.dir")+"/Files/filetext1.txt";
		
		String filePath4=System.getProperty("user.dir")+"/Files/filetext2.txt";
		
//		readingFromPropertiesFile(filePath);

//		writingToPropertiesFile(filePath2);
		
//		readingFromTextFile(filePath3);
		
		writingDataToTextFile(filePath4);

	}


	

}
