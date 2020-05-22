package window;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainUI extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			VBox root = FXMLLoader.load(getClass().getResource("MainWindow.fxml"));
			
			//Setting size of main window
			Scene scene = new Scene(root, 1000, 600);
			
			//Setting CSS
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.centerOnScreen();
			primaryStage.setScene(scene); 
			primaryStage.setResizable(false);
			primaryStage.setTitle("MeowScheduler");
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}