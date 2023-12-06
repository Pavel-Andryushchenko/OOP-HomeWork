import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        создаем 5 пустых групп студентов
        StudentGroup studentGroup1 = new StudentGroup(new ArrayList<>(), 101);
        StudentGroup studentGroup2 = new StudentGroup(new ArrayList<>(), 102);
        StudentGroup studentGroup3 = new StudentGroup(new ArrayList<>(), 103);
        StudentGroup studentGroup4 = new StudentGroup(new ArrayList<>(), 104);
        StudentGroup studentGroup5 = new StudentGroup(new ArrayList<>(), 105);

//       создаем 3, изначально пустых потока, добавляем раличное колличество групп студентов
        Stream stream1 = new Stream("streame1", new ArrayList<>());
        stream1.addStudentGroup(studentGroup1);
        stream1.addStudentGroup(studentGroup2);
        stream1.addStudentGroup(studentGroup3);
        stream1.addStudentGroup(studentGroup4);
        stream1.addStudentGroup(studentGroup5);

        Stream stream2 = new Stream("streame2", new ArrayList<>());
        stream2.addStudentGroup(studentGroup1);
        stream2.addStudentGroup(studentGroup2);
        stream2.addStudentGroup(studentGroup3);

        Stream stream3 = new Stream("streame3", new ArrayList<>());
        stream3.addStudentGroup(studentGroup1);

//        сортируем потоки по колличеству групп в них, выводим на экран
        StreamService streamService = new StreamService(Arrays.asList(stream1, stream2, stream3));
        for (Stream stream: streamService.getSortedStreamBySize()){
            System.out.println(stream);
        }
    }
}
