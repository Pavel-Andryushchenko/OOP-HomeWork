import java.util.List;

public class TeacherControler implements UserControler<User>{
    private final TeacherService teacherService = new TeacherService();
    private final TeacherView teacherView = new TeacherView();
    @Override
    public void create(String firstName, String secondName, String lastNam) {
        teacherService.create(firstName, secondName, lastNam);
    }

    @Override
    public void sendOnConsole() {
        teacherView.sendOnConsole((List<Teacher>) teacherService.getTeacherList());
    }

    public void sortByFIO(){
        teacherService.getTeacherList().sort(new UserComparator<Teacher>());
    }
}
