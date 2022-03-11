package JavaClassPrograms.InterfaceV2;

public class GradeMain {
    public static void main(String[] args) {
        Object allGrades[] = new Object[]{"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F+", "F", 96, 84, 72, 69, 51,
                "Pass", "Fail"};
        int[] intArray = new int[5];
        int count = 0;
        int total = 0;
        int intnext = 0;
        PercentageGrade pg = new PercentageGrade();
        LetterGrade lg = new LetterGrade();
        PassFailGrade pfg = new PassFailGrade();
        for (Object strTemp : allGrades) {
            System.out.print("Grade " + count + ": ");
            String temp = strTemp.getClass().toString();
            if (strTemp.equals("Pass") || strTemp.equals("Fail")) {
                System.out.println(strTemp);
            }
            else if (temp.equals("class java.lang.String")) {
                System.out.print(strTemp + "");
                if (pfg.isPassing(strTemp.toString())){
                    System.out.println(" Pass");
                }
                else{
                    System.out.println(" Fail");
                }

            }
            else if (temp.equals("class java.lang.Integer")) {
                System.out.print(strTemp + "");
                if (pfg.isPassing(strTemp.toString())){
                    System.out.print(" Pass ");
                }
                else{
                    System.out.print(" Fail ");
                }
                System.out.println(pg.toPercent(strTemp.toString()) + "%");
                intArray[intnext] = Integer.parseInt(strTemp.toString());
                intnext ++;

            }
            count++;
          }
        for(int i : intArray){
            total += i;
        }
        System.out.println("The average of your grades: " + (total/5) + "%");
    }
}
