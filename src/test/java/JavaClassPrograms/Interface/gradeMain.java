package JavaClassPrograms.Interface;

import java.util.Random;

public class gradeMain {
    public static void main(String[] args) {
        int[] AllGrades = new int[10];
        Random r = new Random();
        for (int count = 0; count <10; count++){
            int grade = r.nextInt(100)+1;
            AllGrades[count] = grade;
            System.out.println(AllGrades[count]);

        }

    }
}
