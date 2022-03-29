package JavaClassPrograms.InterfaceV2;
/*
*@Version 1.0
* @Author Andy Kilgore
 */

//Interface Grade supplied with three standard methods.
public interface Grade {
    int toPercent(String lgrade);
    boolean isPassing(String lgrade);
    boolean includeinAverage(String lgrade);
}
