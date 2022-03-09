package JavaClassPrograms.Interface;

public class LetterGrade implements Grade{
    String lgrade;

    switch (lgrade){
        case lgrade.equalsIgnoreCase("A+"):
            System.out.println(ha);
    }
    

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
