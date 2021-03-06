package main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import spielbrett.SpielbrettController;

public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }

    /**
     * Startet das JavaFX Fenster mit den Grundeinstellungen
     * @param primaryStage
     * @throws Exception
     */
    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("view/spielbrett_view.fxml"));
        fxmlLoader.setController(new SpielbrettController());
        Parent root = fxmlLoader.load();

        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TicTacToe - Mario Teklic - Programmfabrik");
        primaryStage.setResizable(false);

        primaryStage.show();

    }
}
