package ru.mirea.lab22;
public interface ComplexAbstractFactory {
    Complex createComplex();
    Complex createComplex(int real, int imaginary);
}