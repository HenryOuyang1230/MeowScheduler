package window;

import javafx.event.ActionEvent;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.Label;
import javafx.stage.Stage;

public class AlertWindowController {
	
	// UI Widgets
	@FXML
	private Label LABEL_MESSAGE;
	@FXML
	private Label LABEL_DETAILS;
	@FXML
	private Button BTN_CANCEL;
	@FXML
	private Button BTN_OK;
	
	
	// Event Listeners
	// Event Listener on Button[#BTN_OK].onAction
	@FXML
	public void eventOK(ActionEvent event) {
		//TODO
	}
	
	// Event Listener on Button[#BTN_CANCEL].onAction
	@FXML
	public void eventCancel(ActionEvent event) {
		//TODO
	}
}
