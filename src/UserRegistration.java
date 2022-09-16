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
//    public static void main(String[] args) {
//        UserRegistration b =new UserRegistration();
//        System.out.println( b.isValid("JI"));
//    }
}
