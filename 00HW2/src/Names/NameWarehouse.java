package Names;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class NameWarehouse {
	private NameBag nb;
	
	public NameWarehouse() {
		allNames();
		nb.display();
		
	}

	
	public NameBag getNb() {
		return nb;
	}


	public void setNb(NameBag nb) {
		this.nb = nb;
	}


	public String[] loadBoysFirstName() {
		String[] string = new String [1200];
		try {
			
			File file = new File("boysFirstNames.txt");
			
			Scanner scan = new Scanner(file);
			
				string = scan.nextLine().split("([\\W\\d\\.]+)");
				string = Arrays.copyOfRange(string, 1, string.length);
			
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return string;
	}
	public String[] loadGirlsFirstName() {
		String[] string = new String [1200];
		try {
			
			File file = new File("girlsFirstNames.txt");
			
			Scanner scan = new Scanner(file);
			
				string = scan.nextLine().split("([\\W\\d\\.]+)");
				string = Arrays.copyOfRange(string, 1, string.length);
			
			scan.close();
			
			
		
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return string;
	}
	public String[] loadLastName() {
		String[] last = new String[2000];
		File file = new File("lastNames.txt");
		int x = 0;
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
			last[x] = scan.nextLine();
			x++;
			}
			scan.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return last;
		
		
	}
	
	
	
	public void allNames() {
		
		nb  = new NameBag(5000);
		for(int i = 0; i < 1500/2; i++) {
			nb.insert(new Name(loadBoysFirstName()[(int) (Math.random()*600)], loadLastName()[(int)(Math.random()*loadLastName().length)],'M'));
			nb.insert(new Name(loadGirlsFirstName()[(int) (Math.random()*597)], loadLastName()[(int)(Math.random()*loadLastName().length)],'F'));
		
		}
		
		
	}
	
}
