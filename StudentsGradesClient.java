package studentsgrades;

// Lab 12 Client Class //
// Wahab, Abdul //
import java.util.Arrays;
import java.text.DecimalFormat;
import java.util.Scanner;

public class StudentsGradesClient {

    public static void main(String args[]) {
        DecimalFormat numFormat = new DecimalFormat("#00.00");
        Scanner putin = new Scanner(System.in);

        StudentsGrades studentsGrades;
        System.out.println("Please enter the number of students >");
        studentsGrades = new StudentsGrades(putin.nextInt());
        System.out.println("The # of students is : " + studentsGrades.getNumberOfStudents());
        System.out.println("The mode grade is: " + studentsGrades.getModeGrades());
        System.out.println("The maximum grade is: " + studentsGrades.getMaximumGrades());
        System.out.println("The median grade is: " + studentsGrades.getMedianGrades());
        System.out.println("The average grade is: " + numFormat.format(studentsGrades.getAverageGrades()));
        System.out.println(studentsGrades.toString());
        if (studentsGrades.equals(studentsGrades)) {
            System.out.println("Both arrays are equivalent.");
        } else {
            System.out.println("Both arrays aren't equivalent.");
        }
    }
}
