package accounts;

import java.math.BigDecimal;
import java.math.RoundingMode;
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
	private static int idCounter = 10000000;
	
	
	public UserAccountFactory() {
		 names = new NameWarehouse();
		
		it = names.getNb().getNames().iterator();
		
		n = it.next();
		accountBag = new AccountBag();
	}
	
	public void addPreMadeAccounts() {
		for(int i =0; i < 3000; i++) {
			emitUserAccount(emitFirstName(),emitLastName(), emitGender(),emitUserName(),emitUserPassword(), emitGpa());
		}
	}
	public String emitUserName() throws StringIndexOutOfBoundsException {
		String userName = null;
		try {
			userName = n.getLastName().substring(0, 4).toLowerCase() + n.getFirstName().charAt(0) + String.valueOf(idCounter).charAt(String.valueOf(idCounter).length()-1);
			
		}catch(StringIndexOutOfBoundsException bounds){
			userName = n.getLastName().toLowerCase() + n.getFirstName().charAt(0) + String.valueOf(idCounter).charAt(String.valueOf(idCounter).length()-1);

		}
	
			
		
		return userName;
	}
public boolean UsernameExist(String userName) {
		
		Iterator<UserAccount> it = accountBag.getAccounts().iterator();
		
		while(it.hasNext()) {
			if(userName.equals(it.next().getUserName())) {
				return true;
			}
			
		}
		return false;
		
	}
	public boolean PasswordExist(String password) {
		
Iterator<UserAccount> it = accountBag.getAccounts().iterator();
		
		while(it.hasNext()) {
			if(password.equals(it.next().getPassword())) {
				return true;
			}
			
		}
		return false;
		
	}

	
	public String emitUserPassword() {
		String password = "";
		final int PASS_LENGTH = 8;
		boolean meetsRequirements = false;
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz !\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~0123456789";
		do {
			char temp = characters.charAt((int) (Math.random() * characters.length()));
		password += temp;
		if(password.length() >= PASS_LENGTH && checkPassword(password)){
			meetsRequirements = true;
		}
		
		}while(!meetsRequirements);
		return password;
		
	}
	public boolean checkPassword(String password) {
		String capLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		boolean hasNumber = false;
		boolean hasCap = false;
		boolean hasLowCase = false;
		boolean hasSymbols = false;
		
		int i = 0;
		while(i < password.length()) {
			char temp = password.charAt(i);
			if(capLetters.indexOf(temp) != -1) {
				hasCap = true;
			}
			else if(lowLetters.indexOf(temp) != -1) {
				hasLowCase = true;
			}
			else if(numbers.indexOf(temp) != -1) {
				hasNumber = true;
			}
			else {
				hasSymbols = true;
			}
			i++;
		}
		if(password.length() < 8 || !hasSymbols || !hasLowCase || !hasCap || !hasNumber ) {
			return false;
		}
		return true;
		
	}
	public double emitGpa() {
		BigDecimal bd = new BigDecimal(Math.random() * 4);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		
		return bd.doubleValue();
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
	public void emitUserAccount(String first, String last, char gender, String username, String password, double gpa) {
		UserAccount ua = new UserAccount(first,last, emitUserId(), gender,username,password, gpa);
		accountBag.insert(ua);
		n = it.next();
		
		
	}
	public boolean validGpa(double gpa) {
		if(gpa >=  0.0 && gpa <= 4.0) {
			return true;
		}
		
		return false;
	}
	public boolean validGender(char letter) {
		if(letter == 'M' || letter == 'F' || letter == 'm' || letter == 'f') {
			return true;
		}
		return false;
		
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

