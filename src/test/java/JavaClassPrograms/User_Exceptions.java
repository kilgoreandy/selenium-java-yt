package JavaClassPrograms;
/*
 *@Author Andy Kilgore
 * @Version 1.0
 */
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
//Creates a User class, adds three Users to a hashmap and prompts user for login. If incorrect, throws custom Exception.
public class User_Exceptions {
    String username;
    String password;
    String role;
    public User_Exceptions(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
    public static void main(String[] args) throws AccessDenied {
        User_Exceptions a = new User_Exceptions("bsegar", "bsegar", "user");
        User_Exceptions b = new User_Exceptions("jhendrix", "jhendrix", "user");
        User_Exceptions c = new User_Exceptions("lmcquire", "lmcquire", "superuser");
        HashMap<String, String> db = new HashMap<>();
        db.put(a.username, a.password);
        db.put(b.username, b.password);
        db.put(c.username, c.password);
        System.out.println("Input your username please");
        Scanner s = new Scanner(System.in);
        String login = s.next();
        Boolean loggged_in = false;
        while (!loggged_in) {
            if (db.containsValue(login)) {
                System.out.println("Hello " + login + " Input password.");
                loggged_in = true;
            } else {
                System.out.println("User not recognized, try again");
                login = s.next();
            }
        }
        loggged_in = false;
        String pswd = s.next();
        String temp = db.get(login);
        while (!loggged_in){
            if (!Objects.equals(pswd,temp)){
                throw new AccessDenied("Wrong password. Try again");
            }
            else if (Objects.equals(pswd,temp)){
                System.out.println("You are logged in " + login );
                loggged_in = true;
            }
            else {
                System.out.println("Unknown error occurred contact IT");
                break;
            }
        }
    }
}
