package ATM;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.io.*;
import java.util.*;

public class Writefile {

	final static String outputFilePath = "balance.txt";
	
	
	
	   void WritingFile(HashMap<String, String> map) throws FileNotFoundException, UnsupportedEncodingException {  

	        // new file object
	        File file = new File(outputFilePath);
	  
	        BufferedWriter bf = null;
	  
	        try {
	  
	            // create new BufferedWriter for the output file
	            bf = new BufferedWriter(new FileWriter(file));
	  
	            // iterate map entries
	            for (Map.Entry<String, String> entry :
	                 map.entrySet()) {
	  
	                // put key and value separated by a colon
	                bf.write(entry.getKey() + ":"
	                         + entry.getValue());
	  
	                // new line
	                bf.newLine();
	            }
	  
	            bf.flush();
	        }
	        catch (IOException e) {
	            e.printStackTrace();
	        }
	        finally {
	  
	            try {
	  
	                // always close the writer
	                bf.close();
	            }
	            catch (Exception e) {
	            }
	        }
	   }
}
