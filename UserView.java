import java.util.List;

public interface UserView <T extends User>{                                           //Interface Segregation Principle
    void sendOnConsole(List<T> list);
}
