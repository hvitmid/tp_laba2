package com.example.tp_laba2.model;
import  java.lang.Math;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Count {

    int num1, num2, operator;
    String expression;           //само выражение

    public Count() {            //генерация примера
        this.num1 = (int) ( Math.random()*100);
        this.num2 = (int) ( Math.random()*100);
        this.operator = (int) ( Math.random()*4);
        switch (operator) {
            case 0:
                expression = num1 + " + " + num2;
                break;
            case 1:
                expression = num1 + " - " + num2;
                break;
            case 2:
                expression = num1 + " * " + num2;
                break;
            case 3:
                expression = num1 + " / " + num2;
                break;
            default:
                expression = "";
        }
    }

    @Override
    public String toString() {
        return "Решите пример и нажмите Enter: " + expression;
    }

    public double calculateResult() {
        String[] parts = expression.split(" ");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        String operator = parts[1];
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return new BigDecimal((double) num1 / num2).setScale(3, RoundingMode.HALF_UP).doubleValue();
            default:
                return 0;
        }
    }
}
