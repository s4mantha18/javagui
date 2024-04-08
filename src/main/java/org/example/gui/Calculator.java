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

    double num1;
    double num2;
    String operation;
    String screenResult;

    Button btnp,btnce,btnc,btnb,btnf,btnpow,btnsqrt,btndivision,btnmult,btnsub,
            btnadd,btnneg,btndot,btnequals,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
    TextField screen;

    @Override
    public void start(Stage stage) throws Exception {
        screen = new TextField();
        screen.setId("calculator-screen");
        screen.prefWidth(100);
        screen.prefHeight(400);
        screen.setText("");

        btnp = new Button("%");
        btnp.setPrefWidth(100);
        btnp.setPrefHeight(100);
        btnp.setOnAction(e -> {
            num1 = Integer.parseInt(screen.getText());
            operation = "%";
            screen.setText("");
        });



        btnce = new Button("CE");
        btnce.setPrefWidth(100);
        btnce.setPrefHeight(100);
        btnce.setOnAction(e -> {
            screen.setText("");
        });

        btnc = new Button("C");
        btnc.setPrefWidth(100);
        btnc.setPrefHeight(100);
        btnc.setOnAction(e -> {
            screen.setText("");
        });

        btnb = new Button("CLR");
        btnb.setPrefWidth(100);
        btnb.setPrefHeight(100);
        btnb.setOnAction(e ->{
            String currenttext = screen.getText();
            screen.setText(currenttext.substring(0,currenttext.length()-1));
        });

        btnf = new Button("1/x");
        btnf.setPrefWidth(100);
        btnf.setPrefHeight(100);

        btnpow = new Button("pow");
        btnpow.setPrefWidth(100);
        btnpow.setPrefHeight(100);
        btnpow.setOnAction(e ->{
            num1 = Double.parseDouble(screen.getText());
            operation = "pow";
            screen.setText("");
        });

        btnsqrt = new Button("sqrt");
        btnsqrt.setPrefWidth(100);
        btnsqrt.setPrefHeight(100);
        btnsqrt.setOnAction(e ->{
            num1 = Double.parseDouble(screen.getText());
            screen.setText(String.valueOf(Math.sqrt(num1)));
        });

        btndivision = new Button("/");
        btndivision.setPrefWidth(100);
        btndivision.setPrefHeight(100);
        btndivision.setOnAction(e ->{
            num1 = Double.parseDouble(screen.getText());
            operation = "/";
            screen.setText("");
        });


        btnmult = new Button("*");
        btnmult.setPrefWidth(100);
        btnmult.setPrefHeight(100);
        btnmult.setOnAction(e ->{
            num1 = Double.parseDouble(screen.getText());
            operation = "*";
            screen.setText("");
        });

        btnsub = new Button("-");
        btnsub.setPrefWidth(100);
        btnsub.setPrefHeight(100);
        btnsub.setOnAction(e ->{
            num1 = Double.parseDouble(screen.getText());
            operation = "-";
            screen.setText("");
            screen.setText("");
        });

        btnadd = new Button("+");
        btnadd.setPrefWidth(100);
        btnadd.setPrefHeight(100);
        btnadd.setOnAction(e ->{
            num1 = Double.parseDouble(screen.getText());
            operation = "+";
            screen.setText("");
        });

        btnneg = new Button("+/-");
        btnneg.setPrefWidth(100);
        btnneg.setPrefHeight(100);

        btndot = new Button(".");
        btndot.setPrefWidth(100);
        btndot.setPrefHeight(100);
        btndot.setOnAction(e -> {
            if (!screen.getText().contains(".")) {
                screen.setText(screen.getText() + btndot.getText());
            }

        });

        btnequals = new Button("=");
        btnequals.setPrefWidth(100);
        btnequals.setPrefHeight(100);
        btnequals.setOnAction(e ->{
            num2 = Double.parseDouble(screen.getText());
            double Result = 0;
            switch (operation) {
                case "+":
                    Result = (num1 + num2);
                    screenResult = String.valueOf(Result);
                    if (screenResult.endsWith(".0")){
                        int intResult = (int) Result;
                        screen.setText(String.valueOf(intResult));
                    }
                    else {
                        screen.setText(screenResult);
                    }
                    break;
                case "-":
                    Result = (num1 - num2);
                    screenResult = String.valueOf(Result);
                    if (screenResult.endsWith(".0")){
                        int intResult = (int) Result;
                        screen.setText(String.valueOf(intResult));
                    }
                    else {
                        screen.setText(screenResult);
                    }
                    break;
                case "*":
                    Result = (num1*num2);
                    screenResult = String.valueOf(Result);
                    if (screenResult.endsWith(".0")){
                        int intResult = (int) Result;
                        screen.setText(String.valueOf(intResult));
                    }
                    else {
                        screen.setText(screenResult);
                    }
                    break;
                case "/":
                    Result = (num1/num2);
                    screenResult = String.valueOf(Result);
                    if (screenResult.endsWith(".0")){
                        int intResult = (int) Result;
                        screen.setText(String.valueOf(intResult));
                    }
                    else {
                        screen.setText(screenResult);
                    }
                    break;
                case "%":
                    Result = (num1%num2);
                    screenResult = String.valueOf(Result);
                    if (screenResult.endsWith(".0")){
                        int intResult = (int) Result;
                        screen.setText(String.valueOf(intResult));
                    }
                    else {
                        screen.setText(screenResult);
                    }
                    break;
                case "pow":
                    Result = Math.pow(num1, num2);
            }
            screen.setText(String.valueOf(Result));
        });

        btn0 = new Button("0");
        btn0.setPrefWidth(100);
        btn0.setPrefHeight(100);
        btn0.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn0.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("0");
            } else {
                screen.setText(screen.getText().concat("0"));
            }
        });

        btn1 = new Button("1");
        btn1.setPrefWidth(100);
        btn1.setPrefHeight(100);
        btn1.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn1.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("1");
            } else {
                screen.setText(screen.getText().concat("1"));
            }
        });

        btn2 = new Button("2");
        btn2.setPrefWidth(100);
        btn2.setPrefHeight(100);
        btn2.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn2.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("2");
            } else {
                screen.setText(screen.getText().concat("2"));
            }
        });

        btn3 = new Button("3");
        btn3.setPrefWidth(100);
        btn3.setPrefHeight(100);
        btn3.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn3.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("3");
            } else {
                screen.setText(screen.getText().concat("3"));
            }
        });

        btn4 = new Button("4");
        btn4.setPrefWidth(100);
        btn4.setPrefHeight(100);
        btn4.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn4.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("4");
            } else {
                screen.setText(screen.getText().concat("4"));
            }
        });

        btn5 = new Button("5");
        btn5.setPrefWidth(100);
        btn5.setPrefHeight(100);
        btn5.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn5.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("5");
            } else {
                screen.setText(screen.getText().concat("5"));
            }
        });

        btn6 = new Button("6");
        btn6.setPrefWidth(100);
        btn6.setPrefHeight(100);
        btn6.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn6.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("6");
            } else {
                screen.setText(screen.getText().concat("6"));
            }
        });

        btn7 = new Button("7");
        btn7.setPrefWidth(100);
        btn7.setPrefHeight(100);
        btn7.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn7.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("7");
            } else {
                screen.setText(screen.getText().concat("7"));
            }
        });

        btn8 = new Button("8");
        btn8.setPrefWidth(100);
        btn8.setPrefHeight(100);
        btn8.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn8.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("8");
            } else {
                screen.setText(screen.getText().concat("8"));
            }
        });

        btn9 = new Button("9");
        btn9.setPrefWidth(100);
        btn9.setPrefHeight(100);
        btn9.setOnAction(e -> {
            if (screen.getText().isEmpty()){
                screen.setText(btn9.getText());
            }else if (screen.getText().contains(" ")){
                screen.setText("9");
            } else {
                screen.setText(screen.getText().concat("9"));
            }

        });

        Button btnclosewindow = new Button("X");
        btnclosewindow.setId("close-window-button");
        btn6.setPrefWidth(100);
        btn6.setPrefHeight(100);
        btnclosewindow.setAlignment(Pos.TOP_RIGHT);
        btnclosewindow.setOnAction(e->{

        });


        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(6);
        grid.setVgap(6);
        grid.add(btnclosewindow,0,1,5,1);
        grid.add(screen, 0, 2, 4, 1);
        grid.addRow(3, btnp, btnce, btnc, btnb);
        grid.addRow(4, btnf, btnpow, btnsqrt, btndivision);
        grid.addRow(5, btn7, btn8, btn9, btnmult);
        grid.addRow(6, btn4, btn5, btn6, btnsub);
        grid.addRow(7, btn1, btn2, btn3, btnadd);
        grid.addRow(8, btnneg, btn0, btndot, btnequals);
        Scene calculatorpage = new Scene(grid, 400, 600);
        calculatorpage.getStylesheets().add(getClass().getResource("calculatorstyle.css").toExternalForm());

        stage.setResizable(true);
        stage.setScene(calculatorpage);
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}
