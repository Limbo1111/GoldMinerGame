package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;


public class MainApp extends Application {
    public static Stage accessToMainMenuStage;
    public static Stage accessToNewGameStage;
    public static Stage accessToLoadGameStage;
    public static Stage accessToStatGameStage;


    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            Parent menu = FXMLLoader.load(getClass().getResource("view/MainMenu.fxml"));
            primaryStage.setTitle("Gold Miner");
            Scene scene = new Scene(menu);
            primaryStage.setScene(scene);
            primaryStage.setWidth(400);
            primaryStage.setHeight(500);
            primaryStage.show();
            accessToMainMenuStage = primaryStage;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void initNewGame() throws IOException {
        try {
            Parent loaderNewGame = FXMLLoader.load(getClass().getResource("view/NewGame.fxml"));
            Stage newGameStage = new Stage();
            newGameStage.setTitle("My New Stage Title");
            newGameStage.setScene(new Scene(loaderNewGame, 680, 500));
            newGameStage.show();
            accessToNewGameStage = newGameStage;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void initLoadGame() throws IOException {
        try {
            Parent loaderLoadGame = FXMLLoader.load(getClass().getResource("view/LoadGame.fxml"));
            Stage newLoadGameStage = new Stage();
            newLoadGameStage.setTitle("Load Game");
            newLoadGameStage.setScene(new Scene(loaderLoadGame, 640, 500));
            newLoadGameStage.show();
            accessToLoadGameStage = newLoadGameStage;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void initStat() throws IOException {
        try {
            Parent loaderStatGame = FXMLLoader.load(getClass().getResource("view/StatOfGame.fxml"));
            Stage newStatGameStage = new Stage();
            newStatGameStage.setTitle("Load Game");
            newStatGameStage.setScene(new Scene(loaderStatGame, 640, 500));
            newStatGameStage.show();
            accessToStatGameStage = newStatGameStage;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main (String[]args){
            launch(args);
    }
}
