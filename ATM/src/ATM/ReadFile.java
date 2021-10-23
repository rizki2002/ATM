package ATM;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ReadFile {
	
	ArrayList<String> readText() throws IOException {
		
		
		FileInputStream fstream = new FileInputStream("balance.txt");
		// or using Scaner
		DataInputStream in = new DataInputStream(fstream);
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String strLine;
		//Read File Line By Line
		 ArrayList<String> collectText = new ArrayList<String>();
		 String [] splitText = null;
		 
		while ((strLine = br.readLine()) != null)   {
		    //System.out.println(strLine);
		     
		    splitText = strLine.split(":");
		    collectText.add(splitText[0]);
		    collectText.add(splitText[1]);
		     //System.out.println(splitText[0]+splitText[1]);
		     
		}
		
		return collectText;
		
		
	  // System.out.println(collectText.get(2));
	}
	

	

}
