package controller;

import service.DataService;
import view.ComplexNumberView;
import view.MenuView;

import java.util.Scanner;
import java.util.logging.Logger;

public class Controller {
    private static final Logger logger = Logger.getLogger(DataService.class.getName());
    private final DataService dataService = new DataService();
    private final ComplexNumberView view = new ComplexNumberView();
    private final MenuView menuView = new MenuView();
    private final Scanner scn = new Scanner(System.in);

    public void showMenu(){
        menuView.showMenu();
    }
    public void enterTwoComplexNumber() {
        menuView.showTextInOneLine("Введите вещественную часть первого числа : ");
        double firstRealPart = scn.nextDouble();
        menuView.showTextInOneLine("Введите мнимую часть первого числа: ");
        double firstImaginaryPart = scn.nextDouble();
        dataService.createComplexNumber(firstRealPart, firstImaginaryPart);
        menuView.showTextInOneLine("Введите вещественную часть второго числа : ");
        double secondRealPart = scn.nextDouble();
        menuView.showTextInOneLine("Введите мнимую часть второго числа: ");
        double secondImaginaryPart = scn.nextDouble();
        dataService.createComplexNumber(secondRealPart, secondImaginaryPart);
        menuView.showTextInManyLines("Введенные вами числа: ");
        view.complexNumberView(dataService.getFirstNumber());
        view.complexNumberView(dataService.getSecondNumber());
    }

    public void sumComplexNumber() {
        if (dataService.getInpootComplexNumberList().size() < 2) {
            menuView.showTextInManyLines("Сначала введите числа!");
        } else {
            dataService.sumComplexNumber();
            logger.info(dataService.getResultStringList().getLast());
        }

    }

    public void subtractComplexNumber() {
        if (dataService.getInpootComplexNumberList().size() < 2) {
            menuView.showTextInManyLines("Сначала введите числа!");
        } else {
            dataService.subtractComplexNumber();
            logger.info(dataService.getResultStringList().getLast());
        }

    }

    public void multiplyComplexNumber() {
        if (dataService.getInpootComplexNumberList().size() < 2) {
            menuView.showTextInManyLines("Сначала введите числа!");
        } else {
            dataService.multiplyComplexNumber();
            logger.info(dataService.getResultStringList().getLast());
        }

    }

    public void divideComplexNumber() {
        if (dataService.getInpootComplexNumberList().size() < 2) {
            menuView.showTextInManyLines("Сначала введите числа!");
        } else {
            dataService.divideComplexNumber();
            logger.info(dataService.getResultStringList().getLast());
        }
    }

    public void showHistoryOperation(){
        for (String resultOfOperation: dataService.getResultStringList()){
            logger.info(resultOfOperation);
        }
    }
}
