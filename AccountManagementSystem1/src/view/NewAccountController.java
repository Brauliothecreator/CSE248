package view;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NewAccountController implements Initializable {
	@FXML
	private TextField fName;
	@FXML
	private TextField lName;
	
	@FXML
	private TextField gender;
	@FXML
	private TextField gpa;
	@FXML
	private TextField username;
	@FXML
	private TextField password;
	@FXML
	private TextField vPassword;
	@FXML
	private TextField response;
	@FXML
	private Button button;
	
	
	
	
	
	
	
	@FXML
	public void addAccount(ActionEvent e) {
		if(!LoginController.allUsers.UsernameExist(username.getText())) {
			if(LoginController.allUsers.checkPassword(password.getText())) {
				LoginController.allUsers.emitUserAccount(username.getText(),password.getText(),gender.getText().charAt(0), username.getText(),password.getText(),Double.parseDouble(gpa.getText()));
				Parent root;
				try {
					root = FXMLLoader.load(getClass().getResource("Login.fxml"));
					Stage window = (Stage)((Node)e.getSource()).getScene().getWindow();
					Scene scene = new Scene(root);
					window.setScene(scene);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}else {
			response.setText("User Name exist!");
					}
		
		
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
