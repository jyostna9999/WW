package com.ww.assessment.jyostna.com.questions;


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
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.base.Splitter;

public class FileExists {

	static File file;

	public static void main(String[] args) throws IOException 
	{
	    String line;
	    
		file = new File("Dictionary.txt");
		String filePath = file.getAbsolutePath();
		doesFileExist(filePath);
		
		LinkedHashMap<String, ArrayList<String>> map = new LinkedHashMap<String, ArrayList<String>>();
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		
		while ((line = reader.readLine()) != null)
			
		    {
		        String[] parts = line.split("–");
		        String[] values = parts[1].split(",");
		        
		        ArrayList<String> tempList = new ArrayList<String>();
		        
		        for(int i = 0; i < values.length; i++)
		        	
		        	tempList.add(values[i]);
		             
		            map.put(parts[0], tempList);
		     
		    }
		 
		 for (Entry<String, ArrayList<String>> mapDisplay : map.entrySet())
		    {
		        System.out.println(mapDisplay.getKey());
		        for(String value: mapDisplay.getValue())
		        System.out.println(value);

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
	        System.out.println("File not found");
	      }
	}
}

