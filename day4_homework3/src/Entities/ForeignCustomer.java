package Entities;

public class ForeignCustomer extends Customer {
private String firstName;
private String lastName;
private String passportNumber;
private int dateOfBirthYear;

public ForeignCustomer() {}
public ForeignCustomer(String firstName, String lastName, String passportNumber, int dateOfBirthYear) {
	super();
	this.firstName = firstName;
	this.lastName = lastName;
	this.passportNumber = passportNumber;
	this.dateOfBirthYear = dateOfBirthYear;
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
public String getPassportNumber() {
	return passportNumber;
}
public void setPassportNumber(String passportNumber) {
	this.passportNumber = passportNumber;
}
public int getDateOfBirthYear() {
	return dateOfBirthYear;
}
public void setDateOfBirthYear(int dateOfBirthYear) {
	this.dateOfBirthYear = dateOfBirthYear;
}
}
