package service;

import model.ComplexNumber;

public interface MathematicalOperation<T extends ComplexNumber> {
    public T addComplexNumber(T firstTerm, T secondTerm);
    public T subtractComplexNumber(T firstTerm, T secondTerm);
    public T multiplyComplexNumber(T firstTerm, T secondTerm);
    public T divideComplexNumber(T firstTerm, T secondTerm);
}
