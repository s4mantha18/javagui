package org.example.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe2 extends Application implements EventHandler {

    Button btn1, btn2, btn3, btn4, btn5,btn6,btn7,btn8,btn9;
    int count;

    @Override
    public void start(Stage stage) throws Exception {
        btn1 = new Button();
        btn1.setPrefHeight(100);
        btn1.setPrefWidth(100);
        btn1.setOnAction(this);

        btn1 = new Button();
        btn1.setPrefHeight(100);
        btn1.setPrefWidth(100);
        btn1.setOnAction(this);

        btn2 = new Button();
        btn2.setPrefHeight(100);
        btn2.setPrefWidth(100);
        btn2.setOnAction(this);

        btn3 = new Button();
        btn3.setPrefHeight(100);
        btn3.setPrefWidth(100);
        btn3.setOnAction(this);

        btn4 = new Button();
        btn4.setPrefHeight(100);
        btn4.setPrefWidth(100);
        btn4.setOnAction(this);

        btn5 = new Button();
        btn5.setPrefHeight(100);
        btn5.setPrefWidth(100);
        btn5.setOnAction(this);

        btn6 = new Button();
        btn6.setPrefHeight(100);
        btn6.setPrefWidth(100);
        btn6.setOnAction(this);

        btn7 = new Button();
        btn7.setPrefHeight(100);
        btn7.setPrefWidth(100);
        btn7.setOnAction(this);

        btn8 = new Button();
        btn8.setPrefHeight(100);
        btn8.setPrefWidth(100);
        btn8.setOnAction(this);

        btn9 = new Button();
        btn9.setPrefHeight(100);
        btn9.setPrefWidth(100);
        btn9.setOnAction(this);



        GridPane grid = new GridPane();
        grid.addRow(1, btn1, btn2, btn3);
        grid.addRow(2, btn4, btn5, btn6);
        grid.addRow(3, btn7, btn8, btn9);
        BorderPane root = new BorderPane();
        root.setCenter(grid);
        Scene scene = new Scene(root, 300, 300);
        stage.setResizable(true);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();
    }


    @Override
    public void handle(Event event) {
        Button clickedbutton = (Button) event.getSource();
        if(isCountEven()){
            clickedbutton.setText("0");
            count++;
        }
        else{
            clickedbutton.setText("X");
            count++;
        }
        System.out.println("Hello");
    }

    private boolean isCountEven() {
        int resultcount = count%2;
        if(count%2==0){
            return true;
        }
        else {
            return false;
        }
    }
}
