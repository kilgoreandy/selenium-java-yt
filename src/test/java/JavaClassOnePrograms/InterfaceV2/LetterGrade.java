package JavaClassPrograms.InterfaceV2;
/*
 *@Version 1.0
 * @Author Andy Kilgore
 */

//CLass that interprets lettergrade and coverts to number grade.
public class LetterGrade implements Grade {
String lgrade;
//Return grade based on input
    @Override
    public int toPercent(String lgrade) {
        switch (lgrade) {
            case "A+":
                return 95;
            case "A":
                return 90;
            case "B+":
                return 85;
            case "B":
                return 80;
            case "C+":
                return 75;
            case "C":
                return 70;
            case "D+":
                return 65;
            case "D":
                return 60;
            case "F+":
                return 55;
            case "F":
                return 50;
            default:
                return 0;
        }
    }

    @Override
    public boolean isPassing(String lgrade) {
        return false;
    }

    @Override
    public boolean includeinAverage(String lgrade) {
        return true;
    }
}
