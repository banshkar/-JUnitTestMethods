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
}
