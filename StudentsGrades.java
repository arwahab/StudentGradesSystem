package studentsgrades;

//Lab 12 //
// Wahab, Abdul //

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
import java.text.DecimalFormat;

public class StudentsGrades {

    Random ranNum = new Random();
    int grade, grades[];
    int sum = 0;
    int numStudents;
    DecimalFormat numberFormat = new DecimalFormat("#00.00");

    public StudentsGrades(int studentNumber) {
        numStudents = studentNumber;
        grades = new int[numStudents];
        for (int a = 0; a < numStudents; a++) {
            grades[a] = ranNum.nextInt(101);
        }

        Arrays.sort(grades);
    }

    public void sortingGrades(int[] grades) {
        Arrays.sort(grades);
    }

    public int[] getStudentsGrades() {
        int[] temp = new int[grades.length];
        for (int d = 0; d < grades.length; d++) {
            temp[d] = grades[d];
        }
        return temp;
    }

    public int getNumberOfStudents() {
        return numStudents;
    }

    public void setStudentsGrades(int b) {
        grade = b;
    }

    public double getAverageGrades() {
        for (int c = 0; c < grades.length; c++) {
            sum += grades[c];
        }
        double averageGrades = (double) sum / numStudents;
        return averageGrades;
    }

    public int getMaximumGrades() {
        int maxGrades = grades[0];
        for (int g = 1; g < grades.length; g++) {
            if (grades[g] > maxGrades) {
                maxGrades = grades[g];
            }
        }
        return maxGrades;
    }

    public int getMinimumGrades() {
        int minGrades = grades[0];
        for (int e = 0; e < grades.length; e++) {
            if (grades[e] < grades[minGrades]) {
                minGrades = grades[e];
            }
        }
        return minGrades;
    }

    public String toString() {
        String returnItem = "The grades are >";
        for (int h = 0; h < grades.length; h++) {
            returnItem += grades[h] + ", ";
        }
        return returnItem;
    }

    public double getMedianGrades() {
        double medianGrades = 0;
        if (grades.length % 2 == 0) {
            medianGrades = (grades[grades.length / 2] + grades[(grades.length / 2) - 1]) / (double) 2;
        } else {
            medianGrades = grades[((grades.length - 1) / 2)];
        }
        return medianGrades;
    }

    public int getModeGrades() {
        int scan = 0, tempScan;
        int modeGrades = grades[0];
        int tempoMode = 0;
        for (int k = 0; k < (grades.length - 1); k++) {
            tempScan = grades[k];
            tempScan = 1;
            for (int i = k + 1; k < grades.length; k++) {
                if (tempoMode == grades[i]) {
                    tempScan++;
                }
            }
            if (tempScan > scan) {
                modeGrades = tempoMode;
                scan = tempScan;
            }
        }
        return modeGrades;
    }

    public int[] printStudentsGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }
        return grades;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof StudentsGrades)) {
            return false;
        }
        StudentsGrades objgrades = (StudentsGrades) obj;
        for (int w = 0; w < grades.length; w++) {
            if (grades[w] != objgrades.grades[w]) {
                return false;
            }
        }
        return true;

    }

}
