package signin;
import javafx.scene.control.TextField;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {
    @FXML private TextField textF;
    @FXML private Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    @FXML private Button plus,minus,multiply,division;
    @FXML private Button Cc,equils;

    double firstValue = 0.0;
    String operation;
    double rezult =0;


    @FXML public void Text () {
        Button[] but = {b0, b1,b2, b3, b4, b5, b6, b7, b8, b9};
        for (Button i : but) {
        i.setOnAction(event -> engine(i.getText()));
        }

        Button[] sign = {plus,minus,multiply,division};
        for (Button s : sign) {
            s.setOnAction(event -> {
            firstValue = Double.valueOf(textF.getText());
            textF.setText("");
            operation = s.getText();});
        }

        Cc.setOnAction(event -> {
            String temp = textF.getText();
            textF.setText(temp.substring(0, temp.length() - 1));
        });
    }

    @FXML private void engine (String text) {

        textF.appendText(text);

        double secondValue = Double.valueOf(textF.getText());

        if ("+".equals(operation)){
            rezult =firstValue + secondValue;
        }
        if ("-".equals(operation)){
            rezult =firstValue - secondValue;
        }
        if ("*".equals(operation)){
            rezult =firstValue * secondValue;
        }
        if ("/".equals(operation)){
            rezult =firstValue / secondValue;
        }

        equils.setOnAction(event ->textF.setText(rezult+""));

    }
}

