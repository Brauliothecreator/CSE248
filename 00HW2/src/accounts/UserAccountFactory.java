package accounts;

import java.text.StringCharacterIterator;
import java.util.Iterator;
import java.util.function.BooleanSupplier;

import Names.Name;
import Names.NameBag;
import Names.NameWarehouse;

public class UserAccountFactory {
	private NameWarehouse names;
	private AccountBag accountBag;
	private Iterator<Name> it;
	private Name n;
	private static int idCounter = 0;
	
	public UserAccountFactory() {
		
	}
	
	public UserAccountFactory(NameWarehouse names) {
		it = names.getNb().getNames().iterator();
		this.names = names;
		n = it.next();
		accountBag = new AccountBag();
	}
	public String emitUserName() {
		return n.getLastName().substring(0, 2).toLowerCase() + n.getFirstName().charAt(0) + String.valueOf(idCounter).charAt(String.valueOf(idCounter).length()-1);
		
	}
	public String emitUserPassword() {
		String password = "";
		boolean meetsRequirements = false;
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz !\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~";
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowLetters = "abcdefghijklmnopqrstuvwxyz";
		boolean hasCap = false;
		boolean hasLowCase = false;
		boolean hasSymbols = false;
		do {
			char temp = characters.charAt((int) (Math.random() * characters.length()));
			if(capLetters.indexOf(temp) != -1) {
				hasCap = true;
			}
			else if(lowLetters.indexOf(temp) != -1) {
				hasLowCase = true;
			}
			else {
				hasSymbols = true;
			}
			password += temp;
			if(password.length() >= 8 && hasSymbols && hasLowCase && hasCap ) {
				meetsRequirements = true;
			}
			
		}while( !meetsRequirements);
		return password;
		
	}
	public boolean checkPassword(String password) {
		boolean meetsRequirements = false;
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz !\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~";
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowLetters = "abcdefghijklmnopqrstuvwxyz";
		boolean hasCap = false;
		boolean hasLowCase = false;
		boolean hasSymbols = false;
		for(int i = 0; i < password.length(); i++) {
			
		}
		do {
			char temp = characters.charAt((int) (Math.random() * characters.length()));
			if(capLetters.indexOf(temp) != -1) {
				hasCap = true;
			}
			else if(lowLetters.indexOf(temp) != -1) {
				hasLowCase = true;
			}
			else {
				hasSymbols = true;
			}
			password += temp;
			
			if(password.length() >= 8 && hasSymbols && hasLowCase && hasCap ) {
				meetsRequirements = true;
			}
			
		}while( !meetsRequirements);
		return false;
		
	}
	public String emitUserId() {
		
		return String.valueOf(++idCounter);
	}
	public String emitFirstName() {
		
		return n.getFirstName();
	}
	public String emitLastName() {
		return n.getLastName();
	}
	public char emitGender() {
		return n.getGender();
	}
	public void emitUserAccount() {
		UserAccount ua = new UserAccount(emitFirstName(),emitLastName(),emitUserId(), emitGender(),emitUserName(),emitUserPassword());
		accountBag.insert(ua);
		n = it.next();
		System.out.print("");
		
	}
	public AccountBag getAccountBag() {
		return accountBag;
	}
	public void setAccountBag(AccountBag accountBag) {
		this.accountBag = accountBag;
	}
	
	//Did not need to use this;
	//public Boolean hasLowerCase(String password) {
	//for(int i = 0; i < password.length(); i++) {
		
//	}
	//}
	
	
	
}

