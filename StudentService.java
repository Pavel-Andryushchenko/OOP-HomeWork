import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student>{ //Open closed Principle, Liskov substitution Principle
    private final List<Student> studentList = new ArrayList<>();
    @Override
    public void create(String firstName, String secondName, String lastName) {
        int maxId = 0;
        for(Student student: studentList){
            if(maxId < student.getStudentID()){
                maxId = student.getStudentID();
            }
        }
        studentList.add(new Student(++maxId, firstName, secondName, lastName));
    }

    public String getStudentFio(Student student){
        // какой-то код
        return null;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
