package com.ww.assessment.jyostna.com.questions;

import java.awt.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.google.common.base.Splitter;

public class FileExists2 {

	static File file;

	public static void main(String[] args) throws IOException 
	{
	    String line;
	    
		file = new File("Dictionary.txt");
		String filePath = file.getAbsolutePath();
		doesFileExist(filePath);

		
		HashMap<String, String> map = new HashMap<String, String>();
		

		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		

		  while ((line = reader.readLine()) != null)
		    {
			  
		        String[] parts = line.split("–");
		        System.out.println(parts.length);
		        
		        for (int i = 0; i < parts.length; i += 2) 
		        {
		            map.put(parts[i], parts[i + 1]);
		            
		        }
		        System.out.println(map);
		     
		    }
		 
		 System.out.println(map);
		 
		 /*for (String s : map.keySet())
		    {
			 
			 System.out.println(s + " " + map.get(s));
		    }*/
		 
		 for (Entry<String, String> mapDisplay : map.entrySet())
		    {
		        System.out.println(mapDisplay.getKey());
		        System.out.println(mapDisplay.getValue());

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

