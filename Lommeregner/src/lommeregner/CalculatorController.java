/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lommeregner;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *
 * @author Frederik
 */
public class CalculatorController implements Initializable
{

    private String figure = null;
    private ArrayList<TextField> textfields;
    private ArrayList<Double> numbers;
    private Calculation calculator;

    @FXML
    private TextField txtHeight;
    @FXML
    private TextField txtWidth;
    @FXML
    private TextField txtLength;
    @FXML
    private TextField txtVolume;
    @FXML
    private Button btnCalculate;
    @FXML
    private ComboBox<String> comboFigures;

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        calculator = new Calculation();
        textfields = new ArrayList<>();
        numbers = new ArrayList<>();
        comboFigures.getItems().addAll("Cube", "Pyramide");
    }

    @FXML
    private void handleCalculate(ActionEvent event)
    {
        if (!numbers.isEmpty() && !textfields.isEmpty())
        {
            numbers.clear();
            textfields.clear();
        }

        switch (figure)
        {
            case "Cube":
                textfields.add(txtHeight);
                textfields.add(txtLength);
                textfields.add(txtVolume);
                textfields.add(txtWidth);
                break;
            case "Pyramide":
                textfields.add(txtHeight);
                textfields.add(txtLength);
                textfields.add(txtVolume);
                textfields.add(txtWidth);
                break;
        }
    }

    private void whichToCalculate(String calculation)
    {
        double height;
        double width;
        double length;
        double volume;
        switch (calculation)
        {
            case "cubeVolume":
                height = Double.parseDouble(txtHeight.getText());
                width = Double.parseDouble(txtWidth.getText());
                length = Double.parseDouble(txtLength.getText());
                volume = calculator.calculateCubeVolume(width, height, length);
                txtVolume.setText(Double.toString(volume));
                break;

            case "cubeWidth":
                volume = Double.parseDouble(txtVolume.getText());
                height = Double.parseDouble(txtHeight.getText());
                length = Double.parseDouble(txtLength.getText());
                width = calculator.calculateCubeSize(volume, height, length);
                txtWidth.setText(Double.toString(width));
                break;

            case "cubeHeight":
                volume = Double.parseDouble(txtVolume.getText());
                width = Double.parseDouble(txtWidth.getText());
                length = Double.parseDouble(txtLength.getText());
                height = calculator.calculateCubeSize(volume, width, length);
                txtHeight.setText(Double.toString(height));
                break;

            case "cubeLength":
                volume = Double.parseDouble(txtVolume.getText());
                width = Double.parseDouble(txtWidth.getText());
                height = Double.parseDouble(txtHeight.getText());
                length = calculator.calculateCubeSize(volume, width, height);
                txtLength.setText(Double.toString(length));
                break;
        }
    }

    public void canCalculate()
    {
        for (TextField txtfield : textfields)
        {
            if (!txtfield.getText().isEmpty())
            {
                try
                {
                    double number = Double.parseDouble(txtfield.getText());
                    numbers.add(number);
                } catch (NumberFormatException ex)
                {
                    System.out.println("Only numbers please!");
                    return;
                }
            }
        }

        if (textfields.size() - numbers.size() == 1)
        {
            switch (figure)
            {
                case "Cube":
                    if (txtVolume.getText().isEmpty())
                    {
                        whichToCalculate("cubeVolume");
                    } else if (txtWidth.getText().isEmpty())
                    {
                        whichToCalculate("cubeWidth");
                    } else if (txtHeight.getText().isEmpty())
                    {
                        whichToCalculate("cubeHeight");
                    } else if (txtLength.getText().isEmpty())
                    {
                        whichToCalculate("cubeLength");
                    }
                    break;
                    
                case "Pyramide":
                    if (txtVolume.getText().isEmpty())
                    {
                        whichToCalculate("pyramideVolume");
                    } else if (txtWidth.getText().isEmpty())
                    {
                        whichToCalculate("pyramideWidth");
                    } else if (txtHeight.getText().isEmpty())
                    {
                        whichToCalculate("pyramideHeight");
                    } else if (txtLength.getText().isEmpty())
                    {
                        whichToCalculate("pyramideLength");
                    }
                    break;
            }
        }
    }

    @FXML
    private void comboSelectFigure(ActionEvent event)
    {
        figure = comboFigures.getValue();
    }

}
