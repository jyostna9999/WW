package com.ww.assessment.jyostna.com.questions;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import com.google.common.base.Splitter; 



public class FileExists3 {

	static File file;

	public static void main(String[] args) throws IOException 
	{
	    String line;

	    
	    
		file = new File("Dictionary.txt");
		String filePath = file.getAbsolutePath();
		doesFileExist(filePath);
		//HashMap<String, String> map = new HashMap<String, String>();

		
		List<Map<String,List<String>>> list = new ArrayList<Map<String,List<String>>>();//This is the final list you need
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();//This is one instance of the  map you want to store in the above list.
		
		List<String> temp = new ArrayList<String>();
		
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		

		  while ((line = reader.readLine()) != null)
		    {
			  	String[] parts = line.split("–");
		        System.out.println(parts.length);
		        
		        for (int i = 0; i < parts.length; i += 2) 
		        {
		            //map.put(parts[i], parts[i + 1]);

		        }
			 
		    }
		 
		 
		 reader.close(); 
	}
	

	private static void doesFileExist(String path) 
	{
	      try
	      {
	          
	         boolean exists = file.exists();
	          
	         System.out.println("File exists : " + exists);
	      } 
	      
	      catch (Exception e)
	      {
	         e.printStackTrace();
	      }
	}
}

