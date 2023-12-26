package service;

import model.ComplexNumber;

public interface ComplexNumberService<T extends ComplexNumber> {
    public void createComplexNumber(double realPart, double imaginaryPart);
}
