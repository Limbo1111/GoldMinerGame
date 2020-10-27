package sample.controller;


import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;
import sample.MainApp;
import sample.model.object.map.interfaces.CreateMap;
import sample.model.object.map.implementation.FSGameMap;

import java.io.IOException;

public class MainMenuController {


    MainApp accessToMainAppMethods = new MainApp();

    @FXML
    private Button newGameButton;
    @FXML
    private Button loadGameButton;
    @FXML
    private Button statButton;
    @FXML
    private Button exitButton;


    @FXML
    public void closeStageByButton(Stage stage, Button button) {
        EventHandler<MouseEvent> exitFromStage = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                stage.close();
            }
        };
        button.addEventHandler(MouseEvent.MOUSE_CLICKED, exitFromStage);
    }
    @FXML
    public void closeStageByCross(Stage stage) {
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent windowEvent) {
                stage.close();
                try {
                    accessToMainAppMethods.start(MainApp.accessToMainMenuStage);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }


    CreateMap gameMap = new FSGameMap();

    @FXML
    public void openNewGame() throws IOException {
        closeStageByButton(MainApp.accessToMainMenuStage, newGameButton);
        accessToMainAppMethods.initNewGame();
        closeStageByCross(MainApp.accessToNewGameStage);
        gameMap.loadMap("C:/Users/yacko/Desktop/fsmap.txt");
    }
    @FXML
    public void openLoadGame() throws IOException {
        closeStageByButton(MainApp.accessToMainMenuStage, loadGameButton);
        accessToMainAppMethods.initLoadGame();
        closeStageByCross(MainApp.accessToLoadGameStage);
    }
    @FXML
    public void openStatGame() throws IOException {
        closeStageByButton(MainApp.accessToMainMenuStage, statButton);
        accessToMainAppMethods.initStat();
        closeStageByCross(MainApp.accessToStatGameStage);
    }

    @FXML
    public void setExitButton() {
        closeStageByButton(MainApp.accessToMainMenuStage, exitButton);
    }
}
