package service;

import model.ComplexCalculatedNumber;

public class ComplexNumberCalculations implements MathematicalOperation<ComplexCalculatedNumber> {

    @Override
    public ComplexCalculatedNumber addComplexNumber(ComplexCalculatedNumber firstTerm, ComplexCalculatedNumber secondTerm) {
        double newRealPart = firstTerm.getRealPart() + secondTerm.getRealPart();
        double newImaginaryPart = firstTerm.getImaginaryPart() + secondTerm.getImaginaryPart();
        return new ComplexCalculatedNumber(newRealPart, newImaginaryPart);
    }

    @Override
    public ComplexCalculatedNumber subtractComplexNumber(ComplexCalculatedNumber firstTerm, ComplexCalculatedNumber secondTerm) {
        double newRealPart = firstTerm.getRealPart() - secondTerm.getRealPart();
        double newImaginaryPart = firstTerm.getImaginaryPart() - secondTerm.getImaginaryPart();
        return new ComplexCalculatedNumber(newRealPart, newImaginaryPart);
    }

    @Override
    public ComplexCalculatedNumber multiplyComplexNumber(ComplexCalculatedNumber firstTerm, ComplexCalculatedNumber secondTerm) {
        double newRealPart = firstTerm.getRealPart() * secondTerm.getRealPart() - firstTerm.getImaginaryPart() * secondTerm.getImaginaryPart();
        double newImaginaryPart = firstTerm.getImaginaryPart() * secondTerm.getRealPart() + firstTerm.getRealPart() + firstTerm.getImaginaryPart();
        return new ComplexCalculatedNumber(newRealPart, newImaginaryPart);
    }

    @Override
    public ComplexCalculatedNumber divideComplexNumber(ComplexCalculatedNumber firstTerm, ComplexCalculatedNumber secondTerm) {
        double newRealPart = (firstTerm.getRealPart() * secondTerm.getRealPart() - firstTerm.getImaginaryPart() * secondTerm.getImaginaryPart()) / (secondTerm.getRealPart() * secondTerm.getRealPart() + secondTerm.getImaginaryPart() * secondTerm.getImaginaryPart());
        double newImaginaryPart = (firstTerm.getImaginaryPart() * secondTerm.getRealPart() + firstTerm.getRealPart() + firstTerm.getImaginaryPart()) / ((secondTerm.getRealPart() * secondTerm.getRealPart() + secondTerm.getImaginaryPart() * secondTerm.getImaginaryPart()));
        return new ComplexCalculatedNumber(newRealPart, newImaginaryPart);
    }
}
