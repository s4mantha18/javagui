package org.example.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MyAppController {
    @FXML
    private Label firstname;
    @FXML
    private TextField firstnametext;
    @FXML
    private Label lastname;
    @FXML
    private TextField lastnametext;
    @FXML
    private Label email;
    @FXML
    private TextField emailtext;
    @FXML
    private Label course;
    @FXML
    private TextField coursetext;

    @FXML
    protected void ButtonClick() {
        firstname.setText(firstname.getText()+" "+firstnametext.getText());
        lastname.setText(lastname.getText()+" "+lastnametext.getText());
        email.setText(email.getText()+" "+emailtext.getText());
        course.setText(course.getText()+" "+coursetext.getText());

    }
}
