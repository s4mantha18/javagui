package org.example.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Calculator extends Application{

    int num1;
    int num2;
    String operation;

    Button btnp,btnce,btnc,btnb,btnf,btnpow,btnsqrt,btndivision,btnmult,btnsub,
            btnadd,btnneg,btndot,btnequals,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    TextField screen;

    @Override
    public void start(Stage stage) throws Exception {
        screen = new TextField();
        screen.prefWidth(320);
        screen.prefHeight(100);
        screen.setText("HELLO!");

        btnp = new Button("%");
        btnp.setPrefWidth(320);
        btnp.setPrefHeight(100);
        btnp.setOnAction(e -> {
            num1 = Integer.parseInt(screen.getText());
            screen.setText("%");
            operation = screen.getText();
        });



        btnce = new Button("CE");
        btnce.setPrefWidth(320);
        btnce.setPrefHeight(100);
        btnce.setOnAction(e -> {
            screen.setText("");
        });

        btnc = new Button("C");
        btnc.setPrefWidth(320);
        btnc.setPrefHeight(100);
        btnc.setOnAction(e -> {
            screen.setText("");
        });

        btnb = new Button("CLR");
        btnb.setPrefWidth(320);
        btnb.setPrefHeight(100);

        btnf = new Button("1/x");
        btnf.setPrefWidth(320);
        btnf.setPrefHeight(100);

        btnpow = new Button("x2");
        btnpow.setPrefWidth(320);
        btnpow.setPrefHeight(100);

        btnsqrt = new Button("sqrt");
        btnsqrt.setPrefWidth(320);
        btnsqrt.setPrefHeight(100);

        btndivision = new Button("/");
        btndivision.setPrefWidth(320);
        btndivision.setPrefHeight(100);
        btndivision.setOnAction(e ->{
            num1 = Integer.parseInt(screen.getText());
            screen.setText("/");
            operation = screen.getText();
        });


        btnmult = new Button("*");
        btnmult.setPrefWidth(320);
        btnmult.setPrefHeight(100);
        btnmult.setOnAction(e ->{
            num1 = Integer.parseInt(screen.getText());
            screen.setText("*");
            operation = screen.getText();
        });

        btnsub = new Button("-");
        btnsub.setPrefWidth(320);
        btnsub.setPrefHeight(100);
        btnsub.setOnAction(e ->{
            num1 = Integer.parseInt(screen.getText());
            screen.setText("-");
            operation = screen.getText();
        });

        btnadd = new Button("+");
        btnadd.setPrefWidth(320);
        btnadd.setPrefHeight(100);
        btnadd.setOnAction(e ->{
            num1 = Integer.parseInt(screen.getText());
            screen.setText("+");
            operation = screen.getText();
        });

        btnneg = new Button("+/-");
        btnneg.setPrefWidth(320);
        btnneg.setPrefHeight(100);

        btndot = new Button(".");
        btndot.setPrefWidth(320);
        btndot.setPrefHeight(100);
        btndot.setOnAction(e -> {
            if (screen.getText().contains(".")) {
            }
            else {
                screen.setText(screen.getText() + btndot.getText());
            }
        });

        btnequals = new Button("=");
        btnequals.setPrefWidth(320);
        btnequals.setPrefHeight(100);
        btnequals.setOnAction(e ->{
            num2 = Integer.parseInt(screen.getText());
            int Result = 0;
            switch (operation) {
                case "+":
                    Result = num1 + num2;
                    break;
                case "-":
                    Result = num1 - num2;
                    break;
                case "*":
                    Result = num1*num2;
                    break;
                case "/":
                    Result = num1/num2;
                    break;
                case "%":
                    Result = num1%num2;
                    break;
            }
            screen.setText(String.valueOf(Result));
        });

        btn0 = new Button("0");
        btn0.setPrefWidth(320);
        btn0.setPrefHeight(100);
        btn0.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn0.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn0.getText());
            } else{
                screen.setText(screen.getText()+btn0.getText());
            }
        });

        btn1 = new Button("1");
        btn1.setPrefWidth(100);
        btn1.setPrefHeight(100);
        btn1.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn1.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn1.getText());
            } else{
                screen.setText(screen.getText()+btn1.getText());
            }
        });

        btn2 = new Button("2");
        btn2.setPrefWidth(100);
        btn2.setPrefHeight(100);
        btn2.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn2.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn2.getText());
            } else{
                screen.setText(screen.getText()+btn2.getText());
            }
        });

        btn3 = new Button("3");
        btn3.setPrefWidth(100);
        btn3.setPrefHeight(100);
        btn3.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn3.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn3.getText());
            } else{
                screen.setText(screen.getText()+btn3.getText());
            }
        });

        btn4 = new Button("4");
        btn4.setPrefWidth(100);
        btn4.setPrefHeight(100);
        btn4.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn4.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn4.getText());
            } else{
                screen.setText(screen.getText()+btn4.getText());
            }
        });

        btn5 = new Button("5");
        btn5.setPrefWidth(100);
        btn5.setPrefHeight(100);
        btn5.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn5.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn5.getText());
            } else{
                screen.setText(screen.getText()+btn5.getText());
            }
        });

        btn6 = new Button("6");
        btn6.setPrefWidth(100);
        btn6.setPrefHeight(100);
        btn6.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn6.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn6.getText());
            } else{
                screen.setText(screen.getText()+btn6.getText());
            }
        });

        btn7 = new Button("7");
        btn7.setPrefWidth(100);
        btn7.setPrefHeight(100);
        btn7.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn7.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn7.getText());
            } else{
                screen.setText(screen.getText()+btn7.getText());
            }
        });

        btn8 = new Button("8");
        btn8.setPrefWidth(100);
        btn8.setPrefHeight(100);
        btn8.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn8.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn8.getText());
            } else{
                screen.setText(screen.getText()+btn8.getText());
            }
        });

        btn9 = new Button("9");
        btn9.setPrefWidth(100);
        btn9.setPrefHeight(100);
        btn9.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn9.getText());
            } else if(screen.getText().contains(operation)) {
                screen.setText(btn9.getText());
            } else{
                screen.setText(screen.getText()+btn9.getText());
            }


        });



        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(6);
        grid.setVgap(6);
        grid.add(screen, 0, 1, 4, 1);
        grid.addRow(2, btnp, btnce, btnc, btnb);
        grid.addRow(3, btnf, btnpow, btnsqrt, btndivision);
        grid.addRow(4, btn7, btn8, btn9, btnmult);
        grid.addRow(5, btn4, btn5, btn6, btnsub);
        grid.addRow(6, btn1, btn2, btn3, btnadd);
        grid.addRow(7, btnneg, btn0, btndot, btnequals);
        Scene calculatorpage = new Scene(grid, 400, 400);
        stage.setResizable(true);
        stage.setScene(calculatorpage);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}
