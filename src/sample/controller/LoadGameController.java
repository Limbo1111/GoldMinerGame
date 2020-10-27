package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.MainApp;

import java.io.IOException;

public class LoadGameController extends MainMenuController{

    @FXML
    private Button toBack;
    @FXML
    private Button loadGame;
    @FXML
    private Button deleteGame;

    @FXML
    public void backToMainMenu() throws IOException {
        closeStageByButton(MainApp.accessToLoadGameStage, toBack);
        accessToMainAppMethods.start(MainApp.accessToMainMenuStage);
    }
}
