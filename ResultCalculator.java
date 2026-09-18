public class ResultCalculator {

    public void calculate(Result result) {

        result.total = result.javaMarks
                + result.mathsMarks
                + result.dsaMarks;

        result.percentage = result.total / 3;

        if (result.percentage >= 90) {
            result.grade = "A+";
        } else if (result.percentage >= 80) {
            result.grade = "A";
        } else if (result.percentage >= 70) {
            result.grade = "B";
        } else if (result.percentage >= 60) {
            result.grade = "C";
        } else if (result.percentage >= 50) {
            result.grade = "D";
        } else {
            result.grade = "F";
        }
    }
}