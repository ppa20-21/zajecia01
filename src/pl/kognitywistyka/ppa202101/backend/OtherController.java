package pl.kognitywistyka.ppa202101.backend;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class OtherController {
	
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

	@FXML public void podmianka(ActionEvent event) {
		mainStage.setScene(otherScene);
	}
	
}
