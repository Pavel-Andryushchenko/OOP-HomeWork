package service;

import model.StudyGroup;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class StudyGroupService implements CreaterStudyGroup {
    List<StudyGroup<User>> studyGroupList = new ArrayList<>();

    public List<StudyGroup<User>> getStudyGroupList() {
        return studyGroupList;
    }

    public void setStudyGroupList(List<StudyGroup<User>> studyGroupList) {
        this.studyGroupList = studyGroupList;
    }




    @Override
    public void createStudyGroup( List<User> listStudent, User teacher) {
        int studyGroupId = studyGroupList.size();
        studyGroupList.add(new StudyGroup<>(studyGroupId, listStudent, teacher));
    }
}
