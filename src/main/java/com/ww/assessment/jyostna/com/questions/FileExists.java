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
import java.util.HashMap;
import java.util.Iterator;
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

		
		HashMap<String, String> map = new HashMap<String, String>();
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		

		  while ((line = reader.readLine()) != null)
		    {
			  
		        String[] parts = line.split("–", 2);
		        if (parts.length >= 2)
		        {
		            String key = parts[0];
		            String value = parts[1];
		            map.put(key, value);
		        } 
		        else 
		        {
		            System.out.println("ignoring line: " + line);
		        }
		    }
		 
		 System.out.println(map);
		 
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

