package JavaClassOnePrograms;
/*
 *@Author Andy Kilgore
 * @Version 1.0
 */
//Custom Exception throwable by User_Exceptions
public class AccessDenied extends Exception {
    public AccessDenied(String errorMessage){
        System.out.println("Wrong password, account has been accessed too many times contact IT");
    }
}
