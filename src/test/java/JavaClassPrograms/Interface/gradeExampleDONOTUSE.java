//package JavaClassPrograms.Interface;
//
//public class gradeExampleDONOTUSE {
//}
//
//
//public interface Grade {
//    int toPercent();
//
//    boolean isPass();
//
//    boolean includeInAverage();
//}
//
//class LetterGrade implements Grade {
//    String grade;
//
//    public LetterGrade(String grade) {
//        this.grade = grade;
//    }
//
//    @Override
//    public int toPercent() {
//        if (grade.equals("A+")) {
//            return 95;
//        } else if (grade.equals("A")) {
//            return 90;
//        } else if (grade.equals("B+")) {
//            return 80;
//        } else if (grade.equals("B")) {
//            return 70;
//        } else if (grade.equals("C")) {
//            return 50;
//        } else if (grade.equals("D")) {
//            return 40;
//        } else {
//            return 30;
//        }
//    }
//
//    @Override
//    public boolean isPass() {
//        return toPercent() >= 40;
//    }
//
//    @Override
//    public boolean includeInAverage() {
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "LetterGrade: " + grade;
//    }
//
//}
//
//class PercentageGrade implements Grade {
//    int percentage;
//
//    public PercentageGrade(int grade) {
//        this.percentage = grade;
//    }
//
//    @Override
//    public int toPercent() {
//        return percentage;
//    }
//
//    @Override
//    public boolean isPass() {
//        return toPercent() >= 40;
//    }
//
//    @Override
//    public boolean includeInAverage() {
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "PercentageGrade: " + percentage + "%";
//    }
//
//}
//
//class PassFailGrade implements Grade {
//    boolean isPass;
//
//    public PassFailGrade(boolean grade) {
//        this.isPass = grade;
//    }
//
//    @Override
//    public int toPercent() {
//        return isPass ? 70 : 30;
//    }
//
//    @Override
//    public boolean isPass() {
//        return isPass;
//    }
//
//    @Override
//    public boolean includeInAverage() {
//        return false;
//    }
//
//    @Override
//    public String toString() {
//        return "PassFailGrade: " + (isPass ? "Pass" : "Fail");
//    }
//
//}
