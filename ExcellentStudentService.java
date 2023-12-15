import java.util.ArrayList;
import java.util.List;

public class ExcellentStudentService implements UserService<ExcellentStudent>{        // Single Responsibility Principle
    private final List<ExcellentStudent> excellentStudents = new ArrayList<>();       //Dependency Inversion Principle
    @Override
    public void create(String firstName, String secondName, String lastName) {
        excellentStudents.add(new ExcellentStudent(excellentStudents.size(), firstName, secondName, lastName));
    }

}
