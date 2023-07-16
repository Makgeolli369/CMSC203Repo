/* Class: CMSC203 CRN 40539
 Program: Assignment #2
 Instructor: Professor Tanveer
 Summary of Description: Assignment2
 Due Date: 07/17/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
 Student’s Name: Michael Lee
*/

public class Patient {
	// Instance variables
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String contact;

	// Constructor
	public Patient(String name, String address, String city, String state, String zip, String contact) {
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.contact = contact;
	}
	
	// Accessor Methods
	public String getName() {
		return name;
	}
	
	public String getaddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getState() {
		return state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public String getcontact() {
		return contact;
	}
	
	// Mutator Methods
	public void setName(String newName) {
		this.name = newName;
	}
	
	public void setaddress(String newaddress) {
		this.address = newaddress;
	}
	
	public void setCity(String newCity) {
		this.city = newCity;
	}
	
	public void setState(String newState) {
		this.state = newState;
	}
	
	public void setZip(String newZip) {
		this.zip = newZip;
	}
	
	public void setcontact(String newcontact) {
		this.contact = newcontact;
	}
}