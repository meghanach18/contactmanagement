package com.example.user.readFile;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadFileIntoList {

	 private static boolean Contact;

	public static String readFileAsString(String fileName)throws Exception
	  {
	    try
	    {
	    	FileReader r=new FileReader("\"C:\\Users\\CSAIMEGH\\Desktop\\document.txt\"");
	    	try {
	    		
	    		 while(Contact=r.read()!=-1)
	    		 {
	    			 System.out.println(Contact);
	    		 }
	    	}
	    	finally
	    	{
	    		r.close();
	    	}
	    }
	    catch(IOException e) {
	    	System.out.println("exception Handled--!");
	    }
		return fileName;
	  }
}
