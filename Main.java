
public class Main {
    public static void main(String[] args) {
        TeacherControler controller = new TeacherControler();
        controller.create("Aab", "Aab", "Aab");
        controller.create("abb", "abb", "abb");
        controller.create("aaa", "aaa", "aaa");
        controller.create("AAA", "AAA", "AAA");
        controller.sendOnConsole();                                              //учителя до сортировки
        controller.sortByFIO();
        System.out.println();
        controller.sendOnConsole();                                              //учителя после сортировки по ФИО

    }

}
