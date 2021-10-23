package ATM;

public class Login {
	
	  String status = null;
	  String name = null;
	  
	 
	  public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	  
	  void enter_menu(int pass) {
		  
		     
			  
			  if (pass == 1234) {
				  
				  System.out.println("Hello alice");
				  setStatus("masuk");
				  setName("alice");
				  
				  
			  }
			  
			  else if(pass == 2345) {
				  System.out.println("Hello bob");
				  setStatus("masuk");
				  setName("bob");
				  
			  }
			  
			  else {
				  System.out.println("maaf pin anda tidak terdaftar");
			  }
		  
	  }
	  
	  

}
