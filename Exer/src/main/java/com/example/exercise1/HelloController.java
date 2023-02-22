package com.example.exercise1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private int content=0;
    @FXML
    private TextField field;

    @FXML
    void decreaseOnAcction(ActionEvent event) {
        if(field.getText().isBlank()){
            content = content - 1;
            field.setText(String.valueOf(content));
        }
        else {
            content = Integer.parseInt(field.getText());
            content = content - 1;
            field.setText(String.valueOf(content));
        }
    }
    @FXML
    void increaseOnAction(ActionEvent event) {
        if(field.getText().isBlank()){
            content=content+1;
            field.setText(String.valueOf(content));
        }else {
            content = Integer.parseInt(field.getText());
            content = content + 1;
            field.setText(String.valueOf(content));
        }
    }

    @FXML
    void ClearOnAction(ActionEvent event) {
        Alert Tlhokomeliso = new Alert(Alert.AlertType.CONFIRMATION, "Exit", ButtonType.YES,ButtonType.NO);
        Tlhokomeliso.setContentText("Are you sure you want to clear?");
        Tlhokomeliso.showAndWait();
        if(Tlhokomeliso.getResult() == ButtonType.YES){
            field.clear();
        }
    }
    @FXML
    void ExitOnAction(ActionEvent event) {
        Alert Tlhokomeliso = new Alert(Alert.AlertType.CONFIRMATION, "Exit", ButtonType.YES,ButtonType.NO);
        Tlhokomeliso.setContentText("Are you sure you want Exit?");
        Tlhokomeliso.showAndWait();
        if(Tlhokomeliso.getResult() == ButtonType.YES){
            Platform.exit();
        }
    }

}
