package sample.controller;


import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.MainApp;

import java.io.IOException;

public class StatOfGameController extends MainMenuController{

    @FXML
    private Button toBack;


    @FXML
    public void backToMenu() throws IOException {
        closeStageByButton(MainApp.accessToStatGameStage, toBack);
        accessToMainAppMethods.start(MainApp.accessToMainMenuStage);
    }
}
