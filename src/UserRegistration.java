import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public  String checkFirstName(String  firstName){
        Pattern pattern =Pattern.compile("^[A-Za-z]+$");
        Matcher check =pattern.matcher(firstName);
        if(check.matches()){
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
    public  String  checkLastName(String  LastName){
        Pattern pattern =Pattern.compile("^[A-Za-z]+$");
        Matcher check =pattern.matcher(LastName);
        if(check.matches()){
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
    public  String  checkEmailSamplesProvidedSearately(String  email){
        Pattern pattern =Pattern.compile("^[a-zA-Z0-9.+-]+[@]+[a-zA-Z]+?(.com)+$");
        Matcher check =pattern.matcher(email);
        if(check.matches()){
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
    public  String  checkMobile(String mobile) {
        Pattern pattern = Pattern.compile("^?(91)+\\s+[0-9]{10}+$");
        Matcher check = pattern.matcher(mobile);
        if (check.matches()) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
    public   String  checkPassword(String Password) {
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-zA-Z]{5,}+[@]+[0-9]{1,}+$");
        Matcher check = pattern.matcher(Password);
        if (check.matches()) {
            return "HAPPY";
        } else {
            return "SAD";
        }
    }
    public static void main(String[] args) {
        UserRegistration m =new UserRegistration();
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter firstName");
        String firstName= sc.nextLine();
        System.out.println(m.checkPassword(firstName));
    }
}
