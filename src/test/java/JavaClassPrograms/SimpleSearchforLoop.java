package JavaClassPrograms;
/*
* @Author Andy Kilgore
* @Version 1.0
 */

//Created main method that sets the main string to the sentence, while look iterates over until the specified char is
// found and lists the index
public class SimpleSearchforLoop {
    public static void main(String[] args) {
        String sentence = "This class is awesome";
        char current = '$';
        int count;

        for (count = 0; current != 'a'; count++){
            current = sentence.charAt(count);
        }
        System.out.println("The character a is first spotted at index: " + count);
    }
}
