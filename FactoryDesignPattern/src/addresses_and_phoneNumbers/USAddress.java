package addresses_and_phoneNumbers;

public class USAddress extends Address {
	public static final String COUNTRY = "U.S.A";
	private static final String COMMA = ",";

	@Override
	public String getCountry() {
		return COUNTRY;
	}
	@Override
	public String getFullAddress() {
		return getStreet() + EOL_STRING + getCity() + EOL_STRING;
	}

}
