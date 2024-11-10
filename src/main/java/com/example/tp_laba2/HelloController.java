package com.example.tp_laba2;

import com.example.tp_laba2.model.Count;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class HelloController {
    public Rectangle indicator;
    @FXML
    private Label expression;
    @FXML
    private Label resultLabel;
    @FXML
    private TextField answerField;
    private Count count = new Count();

    @FXML
    protected void dragged_label() { //показать пример в лейбле
        expression.setText(count.toString());
        indicator.setFill(Color.WHITE);
    }

    @FXML
    public void text_entered() {
        double result;
        try {
            result = count.calculateResult();
            double userAnswer = Double.parseDouble(answerField.getText());
            if (userAnswer == result) {
                resultLabel.setText("Правильно!");
                indicator.setFill(Color.GREEN);
            } else {
                resultLabel.setText("Неправильно. Ответ: " + result);
                indicator.setFill(Color.RED);
            }
        } catch (Exception e) {
            resultLabel.setText("Ошибка: Некорректное выражение или ответ.");
        }
       answerField.clear();
    }
}