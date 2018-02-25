package application;

import java.io.IOException;
import controller.MainController;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

public class Main extends Application {
	
	private Stage primaryStage;
	//private BorderPane rootLayout;
	
	@Override
	public void start(Stage primaryStage) {
		
		this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Rss Feed Aggregator Client v1.1");
        
        MainController toto = new MainController();
        
        toto.run(primaryStage);
        
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
