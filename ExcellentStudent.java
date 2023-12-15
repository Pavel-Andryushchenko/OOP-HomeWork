public class ExcellentStudent extends User{                                           // Single Responsibility Principle
    private int excellentStudentId;                                                   //Dependency Inversion Principle
    public ExcellentStudent(int excellentStudentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        String status = "excellent student";
        this.excellentStudentId = excellentStudentId;
    }

    public int getExcellentStudentId() {
        return excellentStudentId;
    }

    public void setExcellentStudentId(int excellentStudentId) {
        this.excellentStudentId = excellentStudentId;
    }
}
