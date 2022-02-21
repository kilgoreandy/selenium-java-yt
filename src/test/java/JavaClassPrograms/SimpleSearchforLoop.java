package JavaClassPrograms;
/*
* @Author Andy Kilgore
* @Version 1.0
 */

//Created main method that sets the main string to the sentence, for loop  iterates over until the specified char is
// found and lists the index
public class SimpleSearchforLoop {
    public static void main(String[] args) {
        int count;
        String sentence = "This class is awesome";
        for (count = 0; sentence.charAt(count) != 'a'; count++){
            continue;
        }
        System.out.println("The character a is first spotted at index: " + count);
    }
}
