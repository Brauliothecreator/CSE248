package accounts;

public class UserAccount implements Comparable<UserAccount> {
	private String firstName;
	private String last;
	private String id;
	private double Gpa;
	private char gender;
	private String userName;
	private String password;
	
	public UserAccount(String firstName, String last, String id, char gender, String userName, String password, double gpa) {
		super();
		this.firstName = firstName;
		this.last = last;
		this.id = id;
		this.gender = gender;
		this.userName = userName;
		this.password = password;
		this.Gpa = gpa;
	}

	

	public double getGpa() {
		return Gpa;
	}



	public void setGpa(double gpa) {
		Gpa = gpa;
	}



	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
	@Override
	public String toString() {
		return "UserAccount [firstName=" + firstName + ", last=" + last + ", id=" + id + ", Gpa=" + Gpa + ", gender="
				+ gender + ", userName=" + userName + ", password=" + password + "]";
	}



	@Override
	public int compareTo(UserAccount user) {
		return this.getUserName().compareTo(user.getUserName());
	}



	
	 
	
}
