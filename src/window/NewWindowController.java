package window;

import javafx.fxml.FXML;

import javafx.scene.control.Button;

import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javafx.scene.control.Label;

public class NewWindowController {
	// UI widgets
	@FXML
	private Label LABEL_SESSION;
	@FXML
	private TextField TEXT_SESSION;
	@FXML
	private Button BTN_CANCEL;
	@FXML
	private Button BTN_OK;
	
	
	// Local data fields
	private String session;

	
	// Event Listeners
	// Event Listener on Button[#BTN_CANCEL].onAction
	@FXML
	public void eventCancel(ActionEvent event) {
		Stage currentWindow = (Stage) BTN_CANCEL.getScene().getWindow();
		currentWindow.close();
	}
	// Event Listener on Button[#BTN_OK].onAction
	@FXML
	public void eventOK(ActionEvent event) {
		Stage currentWindow = (Stage) BTN_OK.getScene().getWindow();
		// TODO
		currentWindow.close();
	}
	
	@FXML
	public void eventInput(ActionEvent event) {
		//TODO
		BTN_OK.setDisable(true);
	}
	
	
	// Public assessors
	public String getSession() {
		return session;
	}
}
