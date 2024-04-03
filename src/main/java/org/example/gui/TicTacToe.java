//package org.example.gui;
//
//import javafx.application.Application;
//import javafx.geometry.Pos;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.control.TextField;
//import javafx.scene.layout.GridPane;
//import javafx.stage.Screen;
//import javafx.stage.Stage;
//
//public class TicTacToe extends Application {
//    Button btn1, btn2, btn3, btn4,btn5, btn6, btn7, btn8, btn9;
//    TextField screen;
//
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        screen = new TextField();
//        screen.prefWidth(320);
//        screen.prefHeight(100);
//        screen.setText("HELLO!");
//
//        btn1 = new Button("");
//        btn1.setPrefWidth(320);
//        btn1.setPrefHeight(100);
//        btn1.setOnAction( e -> {
//            if (btn1.getText().isEmpty() && screen.getText().isEmpty()){
//                btn1.setText("X");
//            } else if (btn1.getText().isEmpty() && screen.getText().contains("X")){
//                btn1.setText("O");
//            }
//
//        });
//
//        btn2 = new Button("");
//        btn2.setPrefWidth(320);
//        btn2.setPrefHeight(100);
//
//        btn3 = new Button("");
//        btn3.setPrefWidth(320);
//        btn3.setPrefHeight(100);
//
//        btn4 = new Button("");
//        btn4.setPrefWidth(320);
//        btn4.setPrefHeight(100);
//
//        btn5 = new Button("");
//        btn5.setPrefWidth(320);
//        btn5.setPrefHeight(100);
//
//        btn6 = new Button("");
//        btn6.setPrefWidth(320);
//        btn6.setPrefHeight(100);
//
//        btn7 = new Button("");
//        btn7.setPrefWidth(320);
//        btn7.setPrefHeight(100);
//
//        btn8 = new Button("");
//        btn8.setPrefWidth(320);
//        btn8.setPrefHeight(100);
//
//        btn9 = new Button("");
//        btn9.setPrefWidth(320);
//        btn9.setPrefHeight(100);
//        GridPane grid = new GridPane();
//        grid.setAlignment(Pos.CENTER);
//        grid.setHgap(6);
//        grid.setVgap(6);
//        grid.add(screen, 0, 1, 4, 1);
//        grid.addRow(2, btn1, btn2, btn3);
//        grid.addRow(3, btn4, btn5, btn6);
//        grid.addRow(4, btn7, btn8, btn9);
//        Scene game = new Scene(grid, 400, 400);
//        stage.setResizable(true);
//        stage.setTitle("TicIacToe game");
//        stage.setScene(game);
//        stage.show();
//    }
//
//
//    public static void main(String[] args) {
//        launch();
//    }
//}

package org.example.gui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class TicTacToe extends Application {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
    TextField screen;
    boolean playerX = true;

    @Override
    public void start(Stage stage) throws Exception {
        screen = new TextField();
        screen.prefWidth(320);
        screen.prefHeight(100);
        screen.setText("Player X's turn");

        btn1 = createButton();
        btn2 = createButton();
        btn3 = createButton();
        btn4 = createButton();
        btn5 = createButton();
        btn6 = createButton();
        btn7 = createButton();
        btn8 = createButton();
        btn9 = createButton();

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(6);
        grid.setVgap(6);
        grid.add(screen, 0, 0, 3, 1);
        grid.addRow(1, btn1, btn2, btn3);
        grid.addRow(2, btn4, btn5, btn6);
        grid.addRow(3, btn7, btn8, btn9);

        Scene game = new Scene(grid, 400, 400);
        stage.setResizable(true);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(game);
        stage.show();
    }

    private Button createButton() {
        Button button = new Button();
        button.setPrefWidth(100);
        button.setPrefHeight(100);
        button.setOnAction(e -> {
            if (button.getText().isEmpty()) {
                button.setText(playerX ? "X" : "O");
                playerX = !playerX; // Switch players
                screen.setText(playerX ? "Player X's turn" : "Player O's turn");
                checkWinner();
            }
        });
        return button;
    }

    private void checkWinner() {
        // Check rows
        if (checkRow(btn1, btn2, btn3) || checkRow(btn4, btn5, btn6) || checkRow(btn7, btn8, btn9)) {
            return;
        }
        // Check columns
        if (checkRow(btn1, btn4, btn7) || checkRow(btn2, btn5, btn8) || checkRow(btn3, btn6, btn9)) {
            return;
        }
        // Check diagonals
        if (checkRow(btn1, btn5, btn9) || checkRow(btn3, btn5, btn7)) {
            return;
        }
        // Check for draw
        if (!btn1.getText().isEmpty() && !btn2.getText().isEmpty() && !btn3.getText().isEmpty() &&
                !btn4.getText().isEmpty() && !btn5.getText().isEmpty() && !btn6.getText().isEmpty() &&
                !btn7.getText().isEmpty() && !btn8.getText().isEmpty() && !btn9.getText().isEmpty()) {
            screen.setText("It's a draw!");
        }
    }

    private boolean checkRow(Button b1, Button b2, Button b3) {
        String text1 = b1.getText();
        String text2 = b2.getText();
        String text3 = b3.getText();
        if (!text1.isEmpty() && text1.equals(text2) && text1.equals(text3)) {
            screen.setText("Player " + text1 + " wins!");
            disableButtons(); // Game ends, disable buttons
            return true;
        }
        return false;
    }

    private void disableButtons() {
        btn1.setDisable(true);
        btn2.setDisable(true);
        btn3.setDisable(true);
        btn4.setDisable(true);
        btn5.setDisable(true);
        btn6.setDisable(true);
        btn7.setDisable(true);
        btn8.setDisable(true);
        btn9.setDisable(true);
    }

    public static void main(String[] args) {
        launch();
    }
}

