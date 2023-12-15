public class StudentControler implements UserControler<Student>{
    private final StudentService studentService = new StudentService();
    private final StudentView studentView = new StudentView();
    @Override
    public void create(String firstName, String secondName, String lastNam) {
        studentService.create(firstName, secondName, lastNam);
    }

    @Override
    public void sendOnConsole() {
        studentView.sendOnConsole(studentService.getStudentList());
    }
}
