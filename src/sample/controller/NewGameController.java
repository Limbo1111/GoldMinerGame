package sample.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import sample.MainApp;

import java.io.IOException;


public class NewGameController extends MainMenuController{

    @FXML
    private Button left;
    @FXML
    private Button right;
    @FXML
    private Button up;
    @FXML
    private Button down;
    @FXML
    private Button saveGameButton;
    @FXML
    private Button exitGameButton;


    @FXML
    public void closeNewGame() throws IOException {
        closeStageByButton(MainApp.accessToNewGameStage, exitGameButton);
        accessToMainAppMethods.start(MainApp.accessToMainMenuStage);
    }

}
