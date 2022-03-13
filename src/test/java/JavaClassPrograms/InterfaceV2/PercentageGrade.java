package JavaClassPrograms.InterfaceV2;
/*
 *@Version 1.0
 * @Author Andy Kilgore
 */

//Class that converts string into an int and returns
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
