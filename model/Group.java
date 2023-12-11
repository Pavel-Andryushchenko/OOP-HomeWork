package model;

import java.util.List;

public abstract class Group<User> {
    int studyGroupId;
    List<User> listStudent;
    User teacher;

    public Group(int studyGroupId, List<User> listStudent, User teacher) {
        this.studyGroupId = studyGroupId;
        this.listStudent = listStudent;
        this.teacher = teacher;
    }
}
