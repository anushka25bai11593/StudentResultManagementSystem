public class ReportGenerator {

    public void generate(Student student, Result result) {

        System.out.println("\n========== RESULT REPORT ==========");
        System.out.println("Roll Number : " + student.rollNo);
        System.out.println("Name        : " + student.name);
        System.out.println("Course      : " + student.course);

        System.out.println("-----------------------------------");
        System.out.println("Java Marks  : " + result.javaMarks);
        System.out.println("Maths Marks : " + result.mathsMarks);
        System.out.println("DSA Marks   : " + result.dsaMarks);

        System.out.println("-----------------------------------");
        System.out.println("Total       : " + result.total);
        System.out.println("Percentage  : " + result.percentage);
        System.out.println("Grade       : " + result.grade);

        System.out.println("===================================");
    }
}