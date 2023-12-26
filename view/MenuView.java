package view;

public class MenuView {
    public void showMenu(){
        System.out.println("""
                Введите цифру, соответствующую пункту меню:
                1 - Ввести два числа
                2 - Сложить
                3 - Вычесть
                4 - Умножить
                5 - Поделить
                6 - История операций
                q - Выход""");
    }
    public void showTextInManyLines(String text){
        System.out.println(text);
    }

    public void showTextInOneLine(String text){
        System.out.print(text);
    }
}
