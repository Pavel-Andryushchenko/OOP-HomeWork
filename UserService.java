public interface UserService <T extends User>{                                        //Interface Segregation Principle
    void create(String firstName, String secondName, String lastNam);
}
