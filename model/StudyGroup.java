package model;

import java.util.ArrayList;
import java.util.List;

public class StudyGroup<User>  extends Group<User> {


    public StudyGroup(int studyGroupId, List<User> listStudent, User teacher) {
        super(studyGroupId, listStudent, teacher);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "studyGroupId=" + studyGroupId +
                ", listStudent=" + listStudent +
                ", teacher=" + teacher +
                '}';
    }

    public List<String> showStudyGroup(){
        List<String> resultList = new ArrayList<>();
        resultList.add("StudyGroupId: " + studyGroupId);
        resultList.add(teacher.toString());
        for(User user: listStudent){
            resultList.add(user.toString());
        }
        return resultList;
    }
}
