public class Student extends User implements Comparable<Student>{
    private int studentID;

    public Student(int studentID, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }



    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", firstName='" + super.getFirstName() + '\'' +
                ", secondName='" + super.getSecondName() + '\'' +
                ", lastName='" + super.getLastName() + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if(studentID > o.getStudentID()){
            return 1;
        }
        if(studentID < o.getStudentID()){
            return -1;
        }
        return 0;
    }
}
