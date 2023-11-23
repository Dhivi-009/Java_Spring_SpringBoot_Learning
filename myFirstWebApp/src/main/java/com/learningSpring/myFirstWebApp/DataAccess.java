package com.learningSpring.myFirstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DataAccess {

	@Autowired
	private JpaRepo jparepo;
	
	
	private Users users;
    
//	public DataAccess(Users users) {
//		super();
//		this.users = users;
//	}

	public String runSignin(Long id,String name, String password, String c_password)
	{
		users=jparepo.findById(id).orElse(null);    
		
		if(users!=null){
			return "Login";
		}
		else
		{
			jparepo.save(new Users(id,name,password,c_password));
			return "Login";
		}
			
	}
	
	public String runLogin(Long idl,String name, String password)
	{ 
		
	    users=jparepo.findById(idl).orElse(null);  
	    
	    if(users == null )
	    {
			return "Signin";
		}
	    else
	    {
	    	if((users.getId().equals(idl))&&(users.getName().equals(name))&&(users.getPassword().equals(password)))
			      
				return "Welcome";
			
	    	else
	    	
	    		return "Login";
	    	
	    }
	}
	}