package service;
import model.Student;
import model.Teacher;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DataService {
    private List<User> userList;

    public DataService() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String lastName, Type type){
        int id = getMaxId(type);
        if(type == Type.STUDENT){
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if(type == Type.TEACHER){
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }

    }
    private int getMaxId(Type type){
        boolean itsStudent = type == Type.STUDENT;
        int maxId = 0;
        for (User user: userList){
            if(user instanceof Student && itsStudent){
                maxId = ((Student) user).getStudentId() + 1;
            }
            if(user instanceof Teacher && !itsStudent){
                maxId = ((Teacher) user).getTeacherId() + 1;
            }
        }
        return maxId;
    }

    public List<User> getAllConcUser(Type type){
        List<User> resultList = new ArrayList<>();
        boolean itsStudent = type == Type.STUDENT;
        for (User user: userList){
            if(user instanceof Student && itsStudent){
                resultList.add(user);
            }
            if(user instanceof Teacher && !itsStudent){
                resultList.add(user);
            }
        }
        return resultList;

    }

    public Teacher getFirstTeacher(){
        Teacher firstTeacher = null;
        for (User user: userList){
            if( user instanceof Teacher){
                firstTeacher = (Teacher) user;
                break;
            }
        }
        return firstTeacher;
    }
}
