/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lommeregner;

import com.fathzer.soft.javaluator.DoubleEvaluator;

/**
 *
 * @author Frederik Jensen
 */
public class Calculation {

    public double calculateCubeVolume(double width, double height, double length) {
        double volume = width * height * length;
        return volume;
    }

    public double calculateCubeSize(double volume, double size1, double size2) {
        double size3 = volume / (size1 * size2);
        return size3;
    }

    public double calculateFunctionVolume(double a, double b, String function, int n) {
        double result = 0;

        String convertedFunction = function;
        
        DoubleEvaluator evaluator = new DoubleEvaluator();

        double deltaX = (b - a) / n;

        for (int i = 0; i <= n; i++) {
            double deltaTimeX = a + i * deltaX;
            if (i == 0) {
                double yZero = evaluateFunction(convertedFunction, a);
                result = result + (0.5 * yZero);
            } else if (i == n) {
                double yLast = evaluateFunction(convertedFunction, deltaTimeX);
                result = result + (0.5 * yLast);
            } else {
                double yN = evaluateFunction(convertedFunction, deltaTimeX);
                result = result + yN;
            }

        }
        
        result = result * deltaX;
        
        double averageLimit = evaluateFunction(convertedFunction,(a+b) / 2);
        
        String volume = "pi*" + averageLimit + "*" + result;
        result = evaluator.evaluate(volume);
        
        return result;
    }
    
    private String convertFunction(String function) {
        String convertedFunction = "";
        for (int i = 0; i < function.length(); i++) {
            if (function.charAt(i) == 'x') {
                convertedFunction = convertedFunction + "*" + function.charAt(i);
            } else {
                convertedFunction = convertedFunction + function.charAt(i);
            }
        }
        return convertedFunction;
    }
    
    private double evaluateFunction(String function, double x) {
        DoubleEvaluator evaluator = new DoubleEvaluator();
        String convertFunction = function.replace("x", Double.toString(x));
        return evaluator.evaluate(convertFunction);
    }
}
