package JavaClassPrograms.InterfaceV2;

public class PercentageGrade implements Grade {

    @Override
    public int toPercent(String lgrade) {
        int percentage  = Integer.parseInt(lgrade);
        return percentage;
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
