import conroller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("aaa", "aaa", "aaa");   // создаем 3 студентов и одного учителя
        controller.createStudent("bbb", "bbb", "bbb");
        controller.createStudent("ccc", "ccc", "ccc");
        controller.createTeacher("AAA","BBB", "CCC");

        controller.createStudyGroup();          // создаем группу из всех студентов и первого попавшегося учителя(в стиле GeekBrains)
        controller.createStudyGroup();         // еще одну
        controller.getStudyGroup();             // выводим на экран
        controller.getStudyGroupAsListStrings();   // выводим на экран в виде списка строк
    }
}
