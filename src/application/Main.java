package application;
	

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage stage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("Home.fxml"));			
			Scene scene = new Scene(root);
			Image icon = new Image("8ball.jpg");
			stage.getIcons().add(icon);
			stage.setTitle("Magic 8 Ball");			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			stage.setScene(scene);
			stage.show();
			
			
			//Image ball= new Image("magic8ball2.png");
			//ImageView image = new ImageView(ball);
			//BorderPane root = new BorderPane();
			//root.getChildren().add(ask);
			//root.getChildren().add(image);
			
			
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
