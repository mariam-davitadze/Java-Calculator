package ge.edu.btu.calculator;

import ge.edu.btu.calculator.service.impl.CalculatorServiceImpl;

public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculator = new CalculatorServiceImpl();
        calculator.sum(30, 40);
        calculator.sum(0, 30);
        calculator.sum(0.5f, 30);
        calculator.sum(0.5f, 30.5f);

        calculator.divide(30f, 10);
        calculator.divide(30, 1.5f);
        calculator.divide(30, 0);
        calculator.divide(0, 30);
        calculator.divide(0.5f, 12);
        calculator.divide(1.5f, 0.5f);
    }
}