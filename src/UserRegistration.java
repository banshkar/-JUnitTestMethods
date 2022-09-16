import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    public  String checkValid(String firstName){
        Pattern pattern =Pattern.compile("^[A-Z]{3,}+$");
        Matcher check =pattern.matcher(firstName);
        if(check.matches()){
            return "Happy!";
        }
        else {
            return "Sad";
        }
    }
    public  String checkLastName(String lastName){
        Pattern pattern =Pattern.compile("^[A-Z]{3,}+$");
        Matcher check =pattern.matcher(lastName);
        if(check.matches()){
            return "Happy!";
        }
        else {
            return "Sad";
        }
    }
    public  String checkEmail(String lastName){
        Pattern pattern =Pattern.compile("^[a-zA-Z]+[.]+[a-zA-Z]{3}?(@)+[a-zA-Z]+[.]+[a-zA-Z]+[.]+[a-zA-Z]+$");
        Matcher check =pattern.matcher(lastName);
        if(check.matches()){
            return "Happy!";
        }
        else {
            return "Sad";
        }
    }
    public  String checkMobileWithSpace(String mobileNumber){
        Pattern pattern =Pattern.compile("^?(91)+\\s+[0-9]{10}+$");
        Matcher check =pattern.matcher( mobileNumber);
        if(check.matches()){
            return "Happy!";
        }
        else {
            return "Sad";
        }
    }
    public  String checkPredefinedPassword(String mobileNumber){
        Pattern pattern =Pattern.compile("^[a-zA-Z]{8,}+$");
        Matcher check =pattern.matcher( mobileNumber);
        if(check.matches()){
            return "Happy!";
        }
        else {
            return "Sad";
        }
    }
//    public static void main(String[] args) {
//        UserRegistration m =new UserRegistration();
//        Scanner sc =new Scanner(System.in);
//        System.out.println("Enter password");
//        String password= sc.nextLine();
//        System.out.println(m.checkPredefinedPassword(password));
//    }
}
