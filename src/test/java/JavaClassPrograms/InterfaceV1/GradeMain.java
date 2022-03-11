package JavaClassPrograms.InterfaceV1;

public class GradeMain {
    public static void main(String[] args) {
        String[] gradesArray = { "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F+", "F" };
        int[] intArray = new int[10];
        int count = 0;
        int total = 0;
        PercentageGrade pg = new PercentageGrade();
        LetterGrade lg = new LetterGrade();
        PassFailGrade pfg = new PassFailGrade();
        for (String strTemp : gradesArray) {
            System.out.print("Letter Grade: " + strTemp.charAt(0));
            if (pfg.isPassing(strTemp)) {System.out.print(" Pass");            }
            else{System.out.print(" Fail");            }
            System.out.println(" Grade Percent " + lg.toPercent(strTemp) + "%");
            intArray[count] = lg.toPercent(strTemp);
            count++;
        }
        for(int i : intArray){
            total += i;
        }
        System.out.println("The average of your grades:  " + (total/10) + "%");
    }
}
