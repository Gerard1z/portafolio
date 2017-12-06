package com.practicalogin.model;

public class loginbean {
     private String email;
     private String password;
     
		public String getNombre() 
		{
	        return email ;
	    }
		public void setEmail(String _email ) 
		{
			email  = _email ;
	    }
		
		public String getPassword () 
		{
	        return   password ;
	    }
		public void setPassword(String _password ) 
		{
			  password  = _password ;
	    }
		
		public boolean validateLogin(String _email, String _password)
		
		{
		    boolean isValid=false;
			if(_email.equals("admin.com") && _password.equals("adimn"))
		{	
			//return true;
			isValid=true;
		}
		else	
		{
			isValid=false;
		     //return false;	
		}
		{
				return false;	
		}
}
}		


