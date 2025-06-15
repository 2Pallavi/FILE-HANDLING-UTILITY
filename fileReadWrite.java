package com.file.read;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReadData {
 public static void main(String args[]) {
	 try {
		 FileInputStream fileinputstream=new FileInputStream("C://Users//sunil//Desktop//readfile.txt");
	     Scanner scanner=new Scanner(fileinputstream);
	     while(scanner.hasNextLine()) {
	    	 System.out.println(scanner.nextLine());
	    	 fileinputstream.close();
	    	
	     }
	 }catch(IOException e1 ) {
		 System.out.println(e1.getMessage());
	 }
	 try {
		 FileWriter filewriter=new FileWriter("C://Users//sunil//Desktop//readfile.txt");
		 filewriter.write("This file is written");
		 filewriter.close();
	 }catch(Exception e) {
		 System.out.println(e);
	 }
	 System.out.println("File Written Successfully");
     }

 }
