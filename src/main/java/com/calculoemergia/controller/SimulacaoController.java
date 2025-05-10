package com.calculoemergia.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SimulacaoController {

    public TextField energiaField;
    public TextField transformidadeField;
    public Label resultadoLabel;

    public void calcularEmergia(ActionEvent event) {
        try {
            double energia = Double.parseDouble(energiaField.getText());
            double transformidade = Double.parseDouble(transformidadeField.getText());
            double emergia = energia * transformidade;
            resultadoLabel.setText(String.format("%.2e sej", emergia));
        } catch (NumberFormatException e) {
            resultadoLabel.setText("Valores inválidos.");
        }
    }

    public void voltarTelaPrincipal(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/view/MainView.fxml"));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setTitle("Cálculo de Emergia");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




