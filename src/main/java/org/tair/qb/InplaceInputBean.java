package org.tair.qb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class InplaceInputBean {

	private String name;
	private String email;
	private String namem;

	public void setName(String name) {
		/*
		StringBuilder str = new StringBuilder(" From ");
		str.append(name);
		String str2 = str.toString();	
		this.name = str2;
		*/
		this.name = name;
	}

	

	public String getName() {
		//StringBuffer str = new StringBuffer("Select ");
		//str.append(this.name);
		//String str2 = str.toString();	
		//this.name = str2;
		//return name;
		//return str2;
		
		//StringBuilder strbuilder = new StringBuilder("Where ");
		//strbuilder.append(name);
		//String str3 = strbuilder.toString();
		//name = str3;
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	
	public void setNamem(String name) {
		
		this.namem = name;
	}

	public String getNamem() {
		return namem;
	}

	
	
	}


