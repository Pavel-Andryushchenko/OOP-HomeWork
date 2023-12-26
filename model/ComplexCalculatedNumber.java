package model;

public class ComplexCalculatedNumber extends ComplexNumber{
    public ComplexCalculatedNumber(double realPart, double imaginaryPart) {
        super(realPart, imaginaryPart);
    }

    @Override
    public double getRealPart() {
        return super.getRealPart();
    }

    @Override
    public void setRealPart(double realPart) {
        super.setRealPart(realPart);
    }

    @Override
    public double getImaginaryPart() {
        return super.getImaginaryPart();
    }

    @Override
    public void setImaginaryPart(double imaginaryPart) {
        super.setImaginaryPart(imaginaryPart);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
