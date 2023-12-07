import java.util.ArrayList;
import java.util.List;

public class TeacherService implements UserService<Teacher>{
    private int teacherId = 0;

    List<Teacher> teacherList = new ArrayList<>();
    @Override
    public void create(String firstName, String secondName, String lastNam) {
        teacherList.add(new Teacher(firstName, secondName, lastNam, teacherId++));
//        teacherId++;
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }
}
