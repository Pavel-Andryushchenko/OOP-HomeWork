import controller.Controller;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        Scanner scanner = new Scanner(System.in);
        while (true){
            controller.showMenu();
            String enteredData = scanner.next();
            switch (enteredData){
                case ("1"):
                    controller.enterTwoComplexNumber();
                    break;
                case ("2"):
                    controller.sumComplexNumber();
                    break;
                case ("3"):
                    controller.subtractComplexNumber();
                    break;
                case ("4"):
                    controller.multiplyComplexNumber();
                    break;
                case ("5"):
                    controller.divideComplexNumber();
                    break;
                case ("6"):
                    controller.showHistoryOperation();
                    break;
                case ("q"):
                    break;
                default:
                    System.out.println("Повторите попытку");
                    break;
            }
            if(enteredData.equals("q")) {break;}
        }
    }
}
