package JavaClassPrograms;

import org.junit.Test;

import java.util.Locale;

public class programmingLanguage {

    public  programmingLanguage(String language) {
        language = language.toLowerCase();
        switch (language) {
            case "java":
                System.out.println("Awesome choice!");
                break;
            case "c++":
                System.out.println("Er, not hard but you sure?");
                break;
            case "python":
                System.out.println("Great choice, easiest language to start with for beginners");
                break;
            case "visual basic":
                System.out.println("Tad bit outdated. Would not recommend unless it is specifically needed or required.");
                break;
            case "ruby":
                System.out.println("Nah, you don't wanna do that to yourself.");
                break;
            case "javascript":
                System.out.println("Cool, but I would learn Java first.");
                break;
            case "groovy":
                System.out.println("Far Out! However may wanna go with a more practical language first!");
                break;
            default:
                System.out.println("Not sure, I would not try it though.");
                break;
        }
        }

    }
