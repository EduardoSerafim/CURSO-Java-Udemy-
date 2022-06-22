package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY");
	
	
	
	private String name;
	private String email;
	private Date birhDate;
	
	public Client() {
		
	}
	
	
	public Client(String name, String email, Date birhDate) {
		this.name = name;
		this.email = email;
		this.birhDate = birhDate;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirhDate() {
		return birhDate;
	}

	public void setBirhDate(Date birhDate) {
		this.birhDate = birhDate;
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Client: ");
		sb.append(name + "(" + sdf.format(getBirhDate()) + ") - ") ;
		sb.append(getEmail());
		
		return sb.toString();
	}
	
	
	
}
