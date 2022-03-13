package JavaClassPrograms.InterfaceV2;
/*
 *@Version 1.0
 * @Author Andy Kilgore
 */
//Class that determines the case for each pass or fail situation
public class PassFailGrade implements Grade {
    @Override
    public int toPercent(String lgrade) {
        return 0;
    }
    @Override
    public boolean isPassing(String lgrade) {
        switch (lgrade) {
            case "A+":
            case "B+":
            case "A":
            case "B":
            case "C+":
            case "C":
            case "D+":
            case "D":
                return true;
            case "F":
            case "F+":
                return false;
            default:
                int gradeint = Integer.parseInt(lgrade);
                if (gradeint > 59){
                    return true;
                }
                else {return false;}
        }
    }
    @Override
    public boolean includeinAverage(String lgrade) {
        return false;
    }
}

