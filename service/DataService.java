package service;



import model.ComplexCalculatedNumber;

import java.util.ArrayList;
import java.util.List;

// вводимые числа сохраняются в inpootComplexNumberList, результаты операций - в resultComplexNumberList
// в качестве данных для вычисления берем два последних числп из inpootComplexNumberList
// в resultStringList сохраняютя опрации в виде строки "a + b = c"

public class DataService implements ComplexNumberService<ComplexCalculatedNumber> {
    List<ComplexCalculatedNumber> inpootComplexNumberList = new ArrayList<>();
    List<ComplexCalculatedNumber> resultComplexNumberList = new ArrayList<>();
    List<String> resultStringList = new ArrayList<>();
    ComplexNumberCalculations calculator = new ComplexNumberCalculations();
    public ComplexCalculatedNumber getFirstNumber(){
        ComplexCalculatedNumber firstNumber = null;
        if(inpootComplexNumberList.size() > 1){
            firstNumber = inpootComplexNumberList.get(inpootComplexNumberList.size() - 2);
        }
        return firstNumber;
    }

    public ComplexCalculatedNumber getSecondNumber(){
        ComplexCalculatedNumber secondNumber = null;
        if(!inpootComplexNumberList.isEmpty()){
            secondNumber = inpootComplexNumberList.getLast();
        }
        return secondNumber;
    }

    public ComplexCalculatedNumber getResultNumber(){
        ComplexCalculatedNumber resultNumber = null;
        if(!resultComplexNumberList.isEmpty()){
            resultNumber = resultComplexNumberList.getLast();
        }
        return resultNumber;
    }

    public void createComplexNumber(double realPart, double imaginaryPart){
        inpootComplexNumberList.add(new ComplexCalculatedNumber(realPart, imaginaryPart));
    }
    public void sumComplexNumber(){
        resultComplexNumberList.add(calculator.addComplexNumber(getFirstNumber(), getSecondNumber()));
        resultStringList.add(getFirstNumber().toString() + " + " + getSecondNumber().toString() + " = " + getResultNumber().toString());
    }
    public void subtractComplexNumber(){;
        resultComplexNumberList.add(calculator.subtractComplexNumber(getFirstNumber(), getSecondNumber()));
        resultStringList.add(getFirstNumber().toString() + " - " + getSecondNumber().toString() + " = " + getResultNumber().toString());
    }

    public void multiplyComplexNumber(){
        resultComplexNumberList.add(calculator.multiplyComplexNumber(getFirstNumber(), getSecondNumber()));
        resultStringList.add(getFirstNumber().toString() + " * " + getSecondNumber().toString() + " = " + getResultNumber().toString());
    }

    public void divideComplexNumber(){
        resultComplexNumberList.add(calculator.divideComplexNumber(getFirstNumber(), getSecondNumber()));
        resultStringList.add(getFirstNumber().toString() + " / " + getSecondNumber().toString() + " = " + getResultNumber().toString());
    }

    public List<ComplexCalculatedNumber> getInpootComplexNumberList() {
        return inpootComplexNumberList;
    }

    public void setInpootComplexNumberList(List<ComplexCalculatedNumber> inpootComplexNumberList) {
        this.inpootComplexNumberList = inpootComplexNumberList;
    }

    public List<ComplexCalculatedNumber> getResultComplexNumberList() {
        return resultComplexNumberList;
    }

    public void setResultComplexNumberList(List<ComplexCalculatedNumber> resultComplexNumberList) {
        this.resultComplexNumberList = resultComplexNumberList;
    }

    public List<String> getResultStringList() {
        return resultStringList;
    }

    public void setResultStringList(List<String> resultStringList) {
        this.resultStringList = resultStringList;
    }
}
