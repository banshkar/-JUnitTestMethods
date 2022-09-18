import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UserRegistration {
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String mobile;
    private  String password;
    public UserRegistration(){
    }
    public UserRegistration(String firstName){
        this.firstName=firstName;
    }
    public  String checkFirstName(String  firstName) throws Exception {
        Pattern pattern =Pattern.compile("^[A-Z]{1}+[a-zA-Z]+$");
        Matcher check =pattern.matcher(firstName);
        try {
            if(!check.matches()){
                throw  new UserException(UserException.ExceptionType.YOu_ENTERED_INVALID_DATA,"please enter right data");
            }
            if (check.matches()){
                return "SAD";
            }
            return "HAPPY";
        }catch (NullPointerException e){
            throw  new UserException(UserException.ExceptionType.ENTERED_EMPTY,"please enter data");
        }
    }
    public  String  checkLastName(String  LastName) throws UserException {
        Pattern pattern =Pattern.compile("^[A-Z]{1}+[a-zA-Z]+$");
        Matcher check =pattern.matcher(LastName);
        try {
            if(!check.matches()){
                throw  new UserException(UserException.ExceptionType.YOu_ENTERED_INVALID_DATA,"please enter right data");
            }
            if (check.matches()){
                return "SAD";
            }
            return "HAPPY";
        }catch (NullPointerException e){
            throw  new UserException(UserException.ExceptionType.ENTERED_EMPTY,"please enter data");
        }
    }
    public  String  checkEmailSamplesProvidedSearately(String  email) throws UserException {
        Pattern pattern =Pattern.compile("^[a-zA-Z0-9.+-]+[@]+[a-zA-Z]+?(.com)+$");
        Matcher check =pattern.matcher(email);
        try {
            if(!check.matches()){
                throw  new UserException(UserException.ExceptionType.YOu_ENTERED_INVALID_DATA,"please enter right data");
            }
            if (check.matches()){
                return "SAD";
            }
            return "HAPPY";
        }catch (NullPointerException e){
            throw  new UserException(UserException.ExceptionType.ENTERED_EMPTY,"please enter data");
        }
    }
    public  String  checkMobile(String mobile) throws UserException {
        Pattern pattern = Pattern.compile("^?(91)+\\s+[0-9]{10}+$");
        Matcher check = pattern.matcher(mobile);
        try {
            if(!check.matches()){
                throw  new UserException(UserException.ExceptionType.YOu_ENTERED_INVALID_DATA,"please enter right data");
            }
            if (check.matches()){
                return "SAD";
            }
            return "HAPPY";
        }catch (NullPointerException e){
            throw  new UserException(UserException.ExceptionType.ENTERED_EMPTY,"please enter data");
        }
    }
    public   String  checkPassword(String Password) throws UserException {
        Pattern pattern = Pattern.compile("^[A-Z]{1}+[a-zA-Z]{5,}+[@]+[0-9]{1,}+$");
        Matcher check = pattern.matcher(Password);
        try {
            if(!check.matches()){
                throw  new UserException(UserException.ExceptionType.YOu_ENTERED_INVALID_DATA,"please enter right data");
            }
            if (check.matches()){
                return "SAD";
            }
            return "HAPPY";
        }catch (NullPointerException e){
            throw  new UserException(UserException.ExceptionType.ENTERED_EMPTY,"please enter data");
        }
    }
}
