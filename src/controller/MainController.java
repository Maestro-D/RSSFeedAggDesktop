package controller;

import java.io.IOException;

import com.sun.corba.se.impl.orbutil.graph.Node;

import application.Main;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.PasswordField;
import javafx.stage.Stage;

public class MainController {

	// <Home View>
	@FXML
    private TextArea renderArea;

    @FXML
    private Button addRssBtn;

    @FXML
    private TextField addRssArea;

    @FXML
    private ListView<?> ListRssView;
    // </Home View>
    
    // <Login View>
    @FXML
    private Button SignUpBtn;

    @FXML
    private Button loginBtn;

    @FXML
    private TextField loginArea;

    @FXML
    private PasswordField passwordArea;
    // </Login View>
	
	@FXML
	void LogInFire(ActionEvent event) {
		showHomeView();
	}

	public MainController() {
		
	}
	
	public void run(Stage primaryStage) {
		initRootLayout(primaryStage);
	}
	
	private BorderPane rootLayout;
	
	public void initRootLayout(Stage primaryStage) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        showLoginView();
    }

    public void showLoginView() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/Sample.fxml"));
            AnchorPane ConnectView = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(ConnectView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
   public void showHomeView() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/view/homeView.fxml"));
            AnchorPane homeView = (AnchorPane) loader.load();

            // Set person overview into the center of root layout.
            rootLayout.setCenter(homeView);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
