package JavaClassPrograms.InterfaceV1;

public class PercentageGrade implements Grade {

    @Override
    public int toPercent(String lgrade) {
        return 0;
    }

    @Override
    public boolean isPassing(String lgrade) {
        return false;
    }

    @Override
    public boolean includeinAverage(String lgrade) {
        return false;
    }
}
