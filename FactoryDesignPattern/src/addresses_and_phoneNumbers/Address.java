package addresses_and_phoneNumbers;

public abstract class Address {
	private String street;
	private String city; 
	private String region;
	private String postalCode;
	
	public static final String EOL_STRING =
			System.getProperty("\n");
	public static final String SPACE = " ";

	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	public abstract String getCountry();
	
	public String getFullAddress() {
		return EOL_STRING;
	}
}
