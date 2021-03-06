package view;

import accounts.UserAccountFactory;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainView extends Application {
	static UserAccountFactory allUsers = new UserAccountFactory();
	

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage window) throws Exception {
		allUsers.addPreMadeAccounts();
		Parent parent = FXMLLoader.load(getClass().getResource("Login.fxml"));
		Scene scene = new Scene(parent);
		window.setScene(scene);
		window.show();
		
	}

}
