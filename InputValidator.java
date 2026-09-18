public class InputValidator {

    public boolean validMarks(double marks) {
        return marks >= 0 && marks <= 100;
    }

    public boolean validRollNo(int rollNo) {
        return rollNo > 0;
    }

    public boolean validName(String name) {
        return name != null && !name.trim().isEmpty();
    }
}