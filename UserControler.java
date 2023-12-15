public interface UserControler <T extends User>{                                      //Interface Segregation Principle
    void create(String firstName, String secondName, String lastNam);
    void sendOnConsole();
}
