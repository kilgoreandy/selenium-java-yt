package JavaClassPrograms;
/*
* @Author Andy Kilgore
* @Version 1.0
 */

//Created main method that sets the main string to the sentence, while look iterates over until the specified char is
// found and lists the index
public class SimpleSearch {
    public static void main(String[] args) {
        String sentence = "This class is awesome";
        char current = '$';
        int count = 0;

        while (sentence.charAt(count) != 'a'){
            count++;
        }
        System.out.println("The character a is first spotted at index: " + count);
    }
}
