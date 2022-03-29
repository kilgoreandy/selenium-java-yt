package JavaClassPrograms.InterfaceV1;

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
            default:
                return false;
        }
    }

    @Override
    public boolean includeinAverage(String lgrade) {
        return false;
    }
}

