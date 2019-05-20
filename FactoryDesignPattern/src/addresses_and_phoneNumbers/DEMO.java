package addresses_and_phoneNumbers;

public class DEMO {

	public static void main(String[] args) {

		USAddressFactory usAddressFactory = new USAddressFactory();
		Address usAddress = usAddressFactory.createAddress();
		//USAddress usAddress = new USAddress();
		usAddress.setStreet("Main Street");
		usAddress.setCity("Selden");
		usAddress.setRegion("NY");
		usAddress.setPostalCode("11784");
		String address = usAddress.getFullAddress();
		System.out.println(address);
	}

}
