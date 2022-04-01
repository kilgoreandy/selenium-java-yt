package JavaClassPrograms.InterfaceV2;
/*
 *@Version 1.0
 * @Author Andy Kilgore
 */

//Main method for grade. Created mixed array of grade type object. Casts to appropriate method and prints grades along with average.
public class GradeMain {
    public static void main(String[] args) {
        Object allGrades[] = new Object[]{"A+", "A", "B+", "B", "C+", "C", "D+", "D", "F+", "F", 96, 84, 72, 69, 51,
                "Pass", "Fail"};
        //Declare variables
        int[] intArray = new int[15];
        int count = 0;
        int total = 0;
        int intnext = 0;
        //Create objects
        PercentageGrade pg = new PercentageGrade();
        LetterGrade lg = new LetterGrade();
        PassFailGrade pfg = new PassFailGrade();
        //For each object in array, print standard template and cast to corresponding method to identify and parse.
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
                pfg.includeinAverage(lg.lgrade);
                //Add to separate array to calculate average
                intArray[intnext] = lg.toPercent(strTemp.toString());
                intnext++;

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
                //Add to separate array to calculate average
                intArray[intnext] = Integer.parseInt(strTemp.toString());
                intnext ++;

            }
            count++;
          }
        //calculate average
        for(int i : intArray){
            total += i;
        }
        System.out.println("The average of your grades: " + (total/15) + "%");


    }
}
