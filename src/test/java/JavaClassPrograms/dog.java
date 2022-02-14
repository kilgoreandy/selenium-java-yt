package JavaClassPrograms;
//@author Andy Kilgore
//@version 1.0
// Dog program
public class dog {
    int size;
    void bark() {
        switch (size){
            case 0:
                System.out.println("Not valid dog size");
                break;
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("Yip! Yip!");
                break;
            case 6: case 7: case 8: case 9: case 10:
                System.out.println("Ruff! Ruff!");
                break;
            default:
                System.out.println("Woof! Woof!");
                break;
        }
    }
}


