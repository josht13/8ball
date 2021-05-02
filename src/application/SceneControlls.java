package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;




public class SceneControlls {
	
	private Stage stage;
	private Scene scene;
	private Parent root;
	@FXML
	private TextField myTextField;
	@FXML
	private Button myButton;
	@FXML
	private Label answer;
	
	
	
	
	String question;
	public void go(ActionEvent event) {
		
		try {
			question = myTextField.getText();
			answer.setText(Response.answer(""));
			//System.out.println(Response.answer("anything"));
			
		}
		catch(Exception exception){
			System.out.println(exception);
		}
	}
	
	
	//changing scenes 
	public void switchToHome(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("Home.fxml"));
		stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
}	
