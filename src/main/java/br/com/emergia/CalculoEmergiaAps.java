package br.com.emergia;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculoEmergiaAps extends Application {

    @Override
    public void start(Stage primaryStage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/SimulacaoView.fxml"
            ));
            Scene scene = new Scene(loader.load());
            scene.getStylesheets().add(getClass().getResource("/style/style.css").toExternalForm());

            primaryStage.setTitle("Cálculo de Emergia - APS");
            primaryStage.setScene(scene);
            primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("/icon/icon.png"))); // opcional
            primaryStage.show();
        } catch (IOException e) {
            System.err.println("Erro ao carregar a interface: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}

