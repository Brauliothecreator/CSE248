package Names;

import java.util.HashSet;
import java.util.Iterator;

import accounts.UserAccount;

public class NameBag {
	HashSet<Name> names;
	
	
	public NameBag(int maxSize) {
		names = new HashSet<>(maxSize);	
	}
	
	
	public void insert(Name name) {
		names.add(name);
	}
	
	public boolean searchByGender(char gender) {
		while(names.iterator().hasNext()) {
			if(names.iterator().next().getGender() == gender) {
				return true;
			}
		}
		return false;
		
	}
	/*public void searchByFirstLetter(char letter) {
		int x = 0;
		while( x != maxSize) {
			if(names[x].getFirstName().charAt(0) == letter);
			
		}
		
	}*/
	public void display() {
		Iterator<Name> it = names.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
	}


	public HashSet<Name> getNames() {
		return names;
	}


	public void setNames(HashSet<Name> names) {
		this.names = names;
	}
	public void getSize() {
		System.out.println(names.size());
	}


	

	


	
}
