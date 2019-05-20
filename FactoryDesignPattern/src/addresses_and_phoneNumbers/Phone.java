package addresses_and_phoneNumbers;

public abstract class Phone {

	private String phoneNumber;
	
	public abstract String getCountryCode();
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		
		try {
			Long.parseLong(phoneNumber);
			this.phoneNumber = phoneNumber;	
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public String getFullPhoneNumber() {
		return getCountryCode() + getPhoneNumber();
	}
}
