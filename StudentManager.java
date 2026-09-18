import java.util.ArrayList;

public class StudentManager {

    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            System.out.println("--------------------");
            student.displayStudent();
        }
    }

    public Student searchStudent(int rollNo) {

        for (Student student : students) {
            if (student.rollNo == rollNo) {
                return student;
            }
        }

        return null;
    }
}