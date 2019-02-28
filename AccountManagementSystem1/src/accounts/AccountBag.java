package accounts;

import java.util.HashSet;
import java.util.Iterator;

import Names.Name;

public class AccountBag implements Comparable{
	private HashSet<UserAccount> accounts = new HashSet(5000);
	
	public void displayAccounts() {
		Iterator<UserAccount> iterator = accounts.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next().toString());
		}
		
	}
	public void insert(UserAccount account) {
		accounts.add(account);
	}
	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
