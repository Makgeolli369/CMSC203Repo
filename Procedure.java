/* Class: CMSC203 CRN 40539
 Program: Assignment #2
 Instructor: Professor Tanveer
 Summary of Description: Assignment2
 Due Date: 07/17/2023 
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
Student’s Name: Michael Lee
*/
public class Procedure {
	
	// Variables
	private String procedureName;
	private String procedureDate;
	private String doctorName;
	private double cost;

	// Constructor method
	public Procedure(String procedureName, String procedureDate, String doctorName, double cost)
	{
	this.procedureName = procedureName;
	this.procedureDate = procedureDate;
	this.doctorName = doctorName;
	this.cost = cost;
	}

	//  Accessor method
	public String getProcedureName()
	{
	return procedureName;
	}
	public String getProcedureDate()
	{
	return procedureDate;
	}
	public String getDoctorName()
	{
	return doctorName;
	}
	public double getCost()
	{
	return cost;
	}

	//  Mutator methods 
	public void setProcedureName(String procedureName)
	{
	this.procedureName = procedureName;
	}
	public void setProcedureDate(String procedureDate)
	{
	this.procedureDate = procedureDate;
	}
	public void setDoctorName(String doctorName)
	{
	this.doctorName = doctorName;
	}
	public void setCost(double cost)
	{
	this.cost = cost;
	}
}