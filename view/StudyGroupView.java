package view;

import model.StudyGroup;
import model.User;

import java.util.List;

public class StudyGroupView {
    public void printOnConsole(StudyGroup<User> studyGroup){
        System.out.println(studyGroup);
    }
    public void printAsListString(StudyGroup<User> studyGroup){
        for(String string: studyGroup.showStudyGroup()){
            System.out.println(string);
        }
    }
}
