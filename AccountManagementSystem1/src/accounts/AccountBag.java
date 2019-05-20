package accounts;

import java.util.HashSet;
import java.util.Iterator;

import Names.Name;

public class AccountBag {
	private HashSet<UserAccount> accounts = new HashSet<UserAccount>(5000);
	
	public void displayAccounts() {
		Iterator<UserAccount> iterator = accounts.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next().toString());
		}
		
	}
	public HashSet<UserAccount> getAccounts() {
		return accounts;
	}
	public void setAccounts(HashSet<UserAccount> accounts) {
		this.accounts = accounts;
	}
	public void insert(UserAccount account) {
		accounts.add(account);
	}
	public boolean UsernameExist(String userName) {
		
		Iterator<UserAccount> it = accounts.iterator();
		
		while(it.hasNext()) {
			if(userName.equals(it.next().getUserName())) {
				return true;
			}
			
		}
		return false;
		
	}
	public boolean PasswordExist(String password) {
		
Iterator<UserAccount> it = accounts.iterator();
		
		while(it.hasNext()) {
			if(password.equals(it.next().getPassword())) {
				return true;
			}
			
		}
		return false;
		
	}

	
	
	

}
