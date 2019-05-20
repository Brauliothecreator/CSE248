package simple_example;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server implements Serializable {
	public static void main(String[] args) throws UnknownHostException, IOException {
		ServerSocket listener = new ServerSocket(9000);
		while(true) {
			System.out.println("Waitung for a client...");
			Socket socket = listener.accept();
			ObjectOutputStream outputToClient = new ObjectOutputStream(socket.getOutputStream());
			ObjectInputStream inputFromClient = new ObjectInputStream(socket.getInputStream());
			ChatMessage chatMessage = new ChatMessage(0, "Adam", "Hello");
			outputToClient.writeObject(chatMessage);
			outputToClient.flush();
			System.out.println("Sending out a chatMessage object ...");
		}
	}

}
