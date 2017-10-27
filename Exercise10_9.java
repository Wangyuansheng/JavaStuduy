import java.util.ArrayList;

public class Exercise10_9 {
    public static void main(String[] args) {
        Course computer = new Course("计算机");
        computer.addStudent("小明");
        computer.addStudent("小白");
        computer.addStudent("小红");
        computer.dropStudent("小明");
//        computer.clear();
        for (Object student : computer.getStudents()) {
            System.out.println(student);
        }
    }
}

class Course {
    private String courseName;
    private ArrayList students = new ArrayList();
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(String student) {
        students.add(student);
        numberOfStudents++;
    }

    public ArrayList getStudents() {
        return students;
    }

    public int getNumberOfStudent() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public void clear() {
        students.clear();
    }
}