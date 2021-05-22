package Entities;

public class LocalCustomer extends Customer{
	private String firstName;
	private String lastName;
	private int dateOfBirthYear;
private String nationalIdentity;

public LocalCustomer() {}
public LocalCustomer(String firstName, String lastName, int dateOfBirthYear, String nationalIdentity) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.dateOfBirthYear = dateOfBirthYear;
	this.nationalIdentity = nationalIdentity;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getDateOfBirthYear() {
	return dateOfBirthYear;
}
public void setDateOfBirthYear(int dateOfBirthYear) {
	this.dateOfBirthYear = dateOfBirthYear;
}
public String getNationalIdentity() {
	return nationalIdentity;
}
public void setNationalIdentity(String nationalIdentity) {
	this.nationalIdentity = nationalIdentity;
}
}
