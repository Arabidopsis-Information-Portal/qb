package org.tair.qb;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

@ManagedBean
@ViewScoped


public class user implements Serializable{

	String name ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	String email ;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	String age ;
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
