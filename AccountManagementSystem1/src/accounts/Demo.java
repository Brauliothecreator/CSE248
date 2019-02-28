package accounts;

import Names.NameWarehouse;

public class Demo {

	public static void main(String[] args) {
		
		UserAccountFactory f = new UserAccountFactory();
		
		f.addPreMadeAccounts();
		
	//	f.addPreMadeAccounts();
		
		f.getAccountBag().displayAccounts();
	}

}
