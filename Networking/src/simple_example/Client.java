package simple_example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		Socket socket = new Socket("localhost", 9000);
		ObjectOutputStream outputToServer = new ObjectOutputStream(socket.getOutputStream());
		ObjectInputStream inputFromServer = new ObjectInputStream(socket.getInputStream());
		while(true) {
			ChatMessage chatMessage = (ChatMessage)(inputFromServer.readObject());
			if(chatMessage == null) {
				return;
			}
			System.out.println("Reading from the server...");
			String str = chatMessage.getId() + "\t" + chatMessage.getName();
			if(chatMessage.getId() == 0) {
				System.out.println(chatMessage.getName());
			}
			if(chatMessage.getId() == 1) {
			System.out.println("Type 1");	
			}
			}
	}
}