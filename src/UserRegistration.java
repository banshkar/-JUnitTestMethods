import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public  boolean checkEmailSamplesProvidedSearately(String  email){
        Pattern pattern =Pattern.compile("^[a-zA-Z0-9.+-]+[@]+[a-zA-Z]+?(.com)+$");
        Matcher check =pattern.matcher(email);
        if(check.matches()){
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        UserRegistration m =new UserRegistration();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter password");
        String password= sc.nextLine();
        System.out.println(m.checkEmailSamplesProvidedSearately(password));
    }
}
