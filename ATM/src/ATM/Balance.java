package ATM;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

public class Balance {
	HashMap<String, String> map = new HashMap<String, String>();
	Login logins = new Login();
	Writefile wri = new Writefile();
	ReadFile reads = new ReadFile();
	
	int saldo = 0;
	
	int getSaldo(){
		return saldo;
	}

	public void setSaldo(int saldo, int pin) throws IOException {
		int saldo1 = 0;
		int saldo2 = 0;
		
		if (pin == 1234) {
			saldo1 = Integer.parseInt(reads.readText().get(1)) + saldo;	
			saldo2 =Integer.parseInt(reads.readText().get(3));
		}
		
		if (pin == 2345) {
			saldo1 = Integer.parseInt(reads.readText().get(1));
			saldo2 =Integer.parseInt(reads.readText().get(3)) + saldo;
				
		}
		
		HashMap<String, String> map   = new HashMap<String, String>();
		
		map.put("1234", String.valueOf(saldo1));
		map.put("2345", String.valueOf(saldo2));
		wri.WritingFile(map);
		
	}
	
	public void setTransfer(int saldo, int pin) throws IOException  {
		int saldo1 = 0;
		int saldo2 = 0;
		
		if (pin == 1234) {
			saldo1 = Integer.parseInt(reads.readText().get(1)) - saldo;	
			saldo2 =Integer.parseInt(reads.readText().get(3)) + saldo;
		}
		
		if (pin == 2345) {
			saldo1 = Integer.parseInt(reads.readText().get(1)) + saldo;
			saldo2 =Integer.parseInt(reads.readText().get(3)) - saldo;
				
		}
		
		HashMap<String, String> map   = new HashMap<String, String>();
		
		map.put("1234", String.valueOf(saldo1));
		map.put("2345", String.valueOf(saldo2));
		wri.WritingFile(map);
	}
	
	
	

}
