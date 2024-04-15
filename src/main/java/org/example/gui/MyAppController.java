package org.example.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class MyAppController {
    @FXML
    private Label subbutton;

    @FXML
    protected void ButtonClick() {
        subbutton.setText("INPUT SUCESSFUL!");
    }
}
