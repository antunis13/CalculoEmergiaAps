package com.calculoemergia.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainController {

    public void abrirSimulacao(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/SimulacaoView.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Simulação de Cálculo de Emergia");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace(); // mostra erro real
        }
    }
}




