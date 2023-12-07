import java.util.ArrayList;
import java.util.List;

public class StudentService implements UserService<Student>{
    private final List<Student> studentList = new ArrayList<>();
    @Override
    public void create(String firstName, String secondName, String lastNam) {
        int maxId = 0;
        for(Student student: studentList){
            if(maxId < student.getStudentID()){
                maxId = student.getStudentID();
            }
        }
        studentList.add(new Student(++maxId, firstName, secondName, lastNam));
    }

    public List<Student> getStudentList() {
        return studentList;
    }
}
