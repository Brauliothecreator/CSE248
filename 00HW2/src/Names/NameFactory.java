package Names;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class NameFactory {
	NameWarehouse nw = new NameWarehouse();

	public NameFactory() {
		nw.allNames();
	}
	public void search(char letter, char gender) {
		
	}
	
	public void inputData(NameWarehouse nw) {
		try {
			FileOutputStream fos = new FileOutputStream("");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(nw);
			oos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}






}

