package pl.kognitywistyka.ppa202101.backend;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class SampleController {
	
	protected Scene otherScene;
	protected Stage mainStage;

	public Stage getMainStage() {
		return mainStage;
	}

	public void setMainStage(Stage mainStage) {
		this.mainStage = mainStage;
	}

	public Scene getOtherScene() {
		return otherScene;
	}

	public void setOtherScene(Scene otherScene) {
		this.otherScene = otherScene;
	}

	@FXML TextArea textArea;

	@FXML public void about(ActionEvent event) {
		textArea.textProperty().set("You clicked on 'About'");
	}

	@FXML public void podmianka(ActionEvent event) {
		mainStage.setScene(otherScene);
	}
	
}
