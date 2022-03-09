package JavaClassPrograms.Interface;

public class PercentageGrade implements Grade{
    @Override
    public int toPercent() {
        return 0;
    }

    @Override
    public boolean isPassing() {
        return false;
    }

    @Override
    public boolean includeinAverage() {
        return false;
    }
}
