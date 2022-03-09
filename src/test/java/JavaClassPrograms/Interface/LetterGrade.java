package JavaClassPrograms.Interface;

public class LetterGrade implements Grade{
    String lgrade;

        String calculateletterGrade (String lgrade) {
            switch (lgrade) {
                case lgrade.equalsIgnoreCase("A+"):
                    System.out.println("ha");
                case lgrade.equalsIgnoreCase("A"):
                    System.out.println("ha");
                case lgrade.equalsIgnoreCase("B+"):
                    System.out.println("ha");
                case lgrade.equalsIgnoreCase("B"):
                    System.out.println("ha");
                case lgrade.equalsIgnoreCase("C+"):
                    System.out.println("ha");
                case lgrade.equalsIgnoreCase("C"):
                    System.out.println("ha");
                case lgrade.equalsIgnoreCase("D+"):
                    System.out.println("ha");
                case lgrade.equalsIgnoreCase("D"):
                    System.out.println("ha");
                case lgrade.equalsIgnoreCase("F+"):
                    System.out.println("ha");
                case lgrade.equalsIgnoreCase("F"):
                    System.out.println("ha");
            }
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
