package com.code.exersice;

public class SimpleCalculator {

    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {


        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("sub= " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("multi= " + calculator.getMultiplicationResult());
        System.out.println("div= " + calculator.getDivisionResult());

        calculator.setFirstNumber(10.0);
        calculator.setSecondNumber(4);
        System.out.println("add= " + calculator.getAdditionResult());
        System.out.println("sub= " + calculator.getSubtractionResult());

        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(2.3);
        System.out.println("multi= " + calculator.getMultiplicationResult());
        System.out.println("div= " + calculator.getDivisionResult());


    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {

        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {

        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {

        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {

        if (secondNumber == 0)

            return 0;

        return firstNumber / secondNumber;
    }

}
