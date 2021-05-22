package Entities;

public class Customer {
private int id;
private int customerNumber;
private String email;

public Customer() {}
public Customer(int id, int customerNumber, String email) {
	super();
	this.id = id;
	this.customerNumber = customerNumber;
	this.email = email;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getCustomerNumber() {
	return customerNumber;
}
public void setCustomerNumber(int customerNumber) {
	this.customerNumber = customerNumber;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
 }
}