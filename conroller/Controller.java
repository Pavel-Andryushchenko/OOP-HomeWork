package conroller;

import model.Student;
import model.StudyGroup;
import service.StudyGroupService;
import model.User;
import service.DataService;
import service.Type;
import view.StudentView;
import view.StudyGroupView;

public class Controller {
    private final StudyGroupService studyGroupService = new StudyGroupService();
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupView studyGroupView = new StudyGroupView();
    public void createStudent(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.STUDENT);
    }
    public void createTeacher(String firstName, String secondName, String lastName){
        dataService.create(firstName, secondName, lastName, Type.TEACHER);
    }
    public void getAllStudent(){
        for (User user: dataService.getAllConcUser(Type.STUDENT)){
            studentView.printOnConsole((Student) user);
        }
    }
    public void createStudyGroup(){
       studyGroupService.createStudyGroup(dataService.getAllConcUser(Type.STUDENT), dataService.getFirstTeacher());
    }

    public void getStudyGroup(){

        for (StudyGroup<User> studyGroup: studyGroupService.getStudyGroupList()){
            studyGroupView.printOnConsole(studyGroup);
        }

    }

    public void getStudyGroupAsListStrings(){

        for (StudyGroup<User> studyGroup: studyGroupService.getStudyGroupList()){
            studyGroupView.printAsListString(studyGroup);
        }

    }
}
