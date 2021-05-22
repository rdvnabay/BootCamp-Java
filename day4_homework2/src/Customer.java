public class Customer implements Entity {
	private int id;
	private String firstName;
	private String lastName;
	private int dateOfYear;
	private String nationalIdentity;

	public Customer() {}
	public Customer(int id, String firstName, String lastName, int dateOfYear, String nationalIdentity) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfYear = dateOfYear;
		this.nationalIdentity = nationalIdentity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getDateOfYear() {
		return dateOfYear;
	}

	public void setDateOfYear(int dateOfYear) {
		this.dateOfYear = dateOfYear;
	}

	public String getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
}
