package com.example.fxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Circle greenCircle;
    @FXML
    private TextField input1;
    @FXML
    private TextField input2;
    @FXML
    private Text output;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hi from JavaFX!!");
    }

    public void onCircleButtonClick(ActionEvent actionEvent) {
        Color color = new Color(0.25, 0.14, 0.333, 0.51);
        greenCircle.setFill(color);
    }

    public void calculateTheAddition(ActionEvent actionEvent) {
        int a = Integer.parseInt(input1.getText());
        int b = Integer.parseInt(input2.getText());
        output.setText(String.valueOf(a + b));
    }
}