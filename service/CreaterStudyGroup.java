package service;

import model.User;

import java.util.List;

public interface CreaterStudyGroup {
    void createStudyGroup(List<User> listStudent, User teacher);
}
