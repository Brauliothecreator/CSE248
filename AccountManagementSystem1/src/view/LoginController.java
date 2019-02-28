package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import accounts.UserAccountFactory;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class LoginController implements Initializable {
	@FXML
	private TextField username;
	@FXML
	private PasswordField password;
	@FXML
	private Button login;
	@FXML
	private Hyperlink newAccount;
	
 static UserAccountFactory allUsers = new UserAccountFactory();
	@FXML
	public void makeNewAccount(ActionEvent e) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("NewAccount.fxml"));
			Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
			Scene scene = new Scene(root);
			window.setScene(scene);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	@FXML
	public void verifyUser(ActionEvent e) {
		
		if(allUsers.getAccountBag().UsernameExist(username.getText())) {
			if(allUsers.getAccountBag().PasswordExist(password.getText())) {
				System.out.println("Success");
				
			}
			else {
				System.out.println("Password is Incorrect");
			}
		}else {
			System.out.println("Wtong Username");
		}
		
		
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		allUsers.addPreMadeAccounts();
		allUsers.getAccountBag().displayAccounts();
		
	}

}
