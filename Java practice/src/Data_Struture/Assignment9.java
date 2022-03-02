package Data_Struture;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] student1Marks = new int[3];
        System.out.println("marks of student 1 in subject ABC");
        for (int i = 0; i < student1Marks.length; i++) {
            student1Marks[i] = input.nextInt();
        }
        int[] student2Marks = new int[3];
        System.out.println("marks of student 2 in subject ABC");
        for (int i = 0; i < student1Marks.length; i++) {
            student1Marks[i] = input.nextInt();
        }
        int[] student3Marks = new int[3];
        System.out.println("marks of student 3 in subject ABC");
        for (int i = 0; i < student1Marks.length; i++) {
            student1Marks[i] = input.nextInt();
        }
        int totalMarks_student1 = 0, totalMarks_student2 = 0,totalMarks_student3=0;
        for (int j = 0; j <3 ; j++) {
            totalMarks_student1 += student1Marks[j];
            totalMarks_student2 += student2Marks[j];
            totalMarks_student3 += student3Marks[j];
        }
        int totalMarks_AllSubjects = (totalMarks_student1+totalMarks_student2+totalMarks_student3);
        double totalAverage_AllSubjects = (totalMarks_AllSubjects)/3.0;
        int totalMarks_SubjectA = student1Marks[0]+student2Marks[0]+student3Marks[0];
        double totalAverage_SubjectA = totalMarks_SubjectA/3.0;
        int totalMarks_SubjectB = student1Marks[1]+student2Marks[1]+student3Marks[1];
        double totalAverage_SubjectB = totalMarks_SubjectB/3.0;
        int totalMarks_SubjectC = student1Marks[2]+student2Marks[2]+student3Marks[2];
        double totalAverage_SubjectC = totalMarks_SubjectC/3.0;
        System.out.println(totalMarks_AllSubjects);
        System.out.println(totalAverage_AllSubjects);
        System.out.println(totalMarks_SubjectA);
        System.out.println(totalAverage_SubjectA);
        System.out.println(totalMarks_SubjectB);
        System.out.println(totalAverage_SubjectB);
        System.out.println(totalMarks_SubjectC);
        System.out.println(totalAverage_SubjectC);
    }
}
