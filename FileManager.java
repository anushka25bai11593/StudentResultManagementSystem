import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public void saveResult(Student student, Result result) {

        try {

            FileWriter writer =
                    new FileWriter("students.txt", true);

            writer.write(
                    student.rollNo + "," +
                    student.name + "," +
                    student.course + "," +
                    result.total + "," +
                    result.percentage + "," +
                    result.grade + "\n"
            );

            writer.close();

            System.out.println("Result saved successfully!");

        } catch (IOException e) {

            System.out.println("Error while saving file.");
        }
    }
}