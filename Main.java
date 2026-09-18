import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        StudentManager manager = new StudentManager();
        ResultCalculator calculator = new ResultCalculator();
        ReportGenerator report = new ReportGenerator();
        FileManager fileManager = new FileManager();
        InputValidator validator = new InputValidator();

        while (true) {

            System.out.println("\n===== STUDENT RESULT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Generate Result");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Roll Number: ");
                    int rollNo = sc.nextInt();

                    if (!validator.validRollNo(rollNo)) {
                        System.out.println("Invalid roll number.");
                        break;
                    }

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    if (!validator.validName(name)) {
                        System.out.println("Invalid name.");
                        break;
                    }

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student student =
                            new Student(rollNo, name, course);

                    manager.addStudent(student);

                    break;

                case 2:

                    manager.displayStudents();

                    break;

                case 3:

                    System.out.print("Enter Roll Number: ");
                    int searchRoll = sc.nextInt();

                    Student found =
                            manager.searchStudent(searchRoll);

                    if (found != null) {
                        found.displayStudent();
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Roll Number: ");
                    int resultRoll = sc.nextInt();

                    Student resultStudent =
                            manager.searchStudent(resultRoll);

                    if (resultStudent == null) {
                        System.out.println("Student not found.");
                        break;
                    }

                    System.out.print("Enter Java marks: ");
                    double java = sc.nextDouble();

                    System.out.print("Enter Maths marks: ");
                    double maths = sc.nextDouble();

                    System.out.print("Enter DSA marks: ");
                    double dsa = sc.nextDouble();

                    if (!validator.validMarks(java) ||
                        !validator.validMarks(maths) ||
                        !validator.validMarks(dsa)) {

                        System.out.println("Marks must be between 0 and 100.");
                        break;
                    }

                    Result result =
                            new Result(java, maths, dsa);

                    calculator.calculate(result);

                    report.generate(resultStudent, result);

                    fileManager.saveResult(resultStudent, result);

                    break;

                case 5:

                    System.out.println("Thank you!");
                    sc.close();
                    return;

                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}