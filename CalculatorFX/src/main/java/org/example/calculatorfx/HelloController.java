package org.example.calculatorfx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    Float data = 0f;

    int operation = -1;

    @FXML
    private Button add;

    @FXML
    private Button back;

    @FXML
    private Button clear;

    @FXML
    private Button comma;

    @FXML
    private Button deci;

    @FXML
    private TextField display;

    @FXML
    private Button div;

    @FXML
    private Button eight;

    @FXML
    private Button equals;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button mult;

    @FXML
    private Button nine;

    @FXML
    private Button one;

    @FXML
    private Button seven;

    @FXML
    private Button six;

    @FXML
    private Button subt;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Label welcomeText;

    @FXML
    private Button zero;

    @FXML
    void onHelloButtonClick(ActionEvent event) {
        if (event.getSource() == one) {
            display.setText(display.getText() + "1");
        } else if (event.getSource() == two) {
            display.setText(display.getText() + "2");
        } else if (event.getSource() == three) {
            display.setText(display.getText() + "3");
        } else if (event.getSource() == four) {
            display.setText(display.getText() + "4");
        } else if (event.getSource() == five) {
            display.setText(display.getText() + "5");
        } else if (event.getSource() == six) {
            display.setText(display.getText() + "6");
        } else if (event.getSource() == seven) {
            display.setText(display.getText() + "7");
        } else if (event.getSource() == eight) {
            display.setText(display.getText() + "8");
        } else if (event.getSource() == nine) {
            display.setText(display.getText() + "9");
        } else if (event.getSource() == zero) {
            display.setText(display.getText() + "0");
        } else if (event.getSource() == comma) {
            display.setText(display.getText() + ".");
        } else if (event.getSource() == clear) {
            display.setText("");
        } else if (event.getSource() == add) {
        data = Float.parseFloat(display.getText());
        operation = 1;
        display.setText("");
        }else if (event.getSource() == subt) {
            data = Float.parseFloat(display.getText());
            operation = 2;
            display.setText("");
        }else if (event.getSource() == mult) {
            data = Float.parseFloat(display.getText());
            operation = 3;
            display.setText("");
        }else if (event.getSource() == div) {
            data = Float.parseFloat(display.getText());
            operation = 4;
            display.setText("");
        } else if (event.getSource() == deci) {
            data = Float.parseFloat(display.getText());
            data = data / 100;
            display.setText(Float.toString(data));
        } else if (event.getSource() == back) {
            String currentText = display.getText();
            if (currentText.length() > 0) {
                currentText = currentText.substring(0, currentText.length() - 1);
                display.setText(currentText);
            }
        } else if (event.getSource() == equals)
        {
            Float secondOperand = Float.parseFloat((display.getText()));
            int decim = 100;
            switch(operation)
            {
                case 1:
                    Float ans = data + secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 2:
                    ans = data - secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 3:
                    ans = data * secondOperand;
                    display.setText(String.valueOf(ans));break;
                case 4:
                    ans = 0f;
                    try {
                        ans = data / secondOperand;
                    } catch(Exception e) {display.setText("Error");}
                    display.setText(String.valueOf(ans));break;
                case 5:
                    ans = data / decim;
                    display.setText(String.valueOf(ans));break;

            }
        }
    }
}
