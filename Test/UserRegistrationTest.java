import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
class UserRegistrationTest {
    UserRegistration user =new UserRegistration();
    @Test
    public void givingFirstNameForCheckingValidOrInvalid(){
       String check =user.checkValid("JITENDRA");
       assertEquals("Happy!",check);
    }
    @Test
    public void givingLastNameForCheckingValidOrInvalid(){
        String check =user.checkLastName("BANSHKAR");
        assertEquals("Happy!",check);
    }
    @Test
    public void givingEmailForCheckingValidOrInvalid(){
        String check =user.checkEmail("abc.xyz@bc.com.in");
        assertEquals("Happy!",check);
    }
    @Test
    public void givingMobileNUmberForCheckingValidOrInvalid(){
        String check =user.checkMobileWithSpace("91 8035826412");
        assertEquals("Happy!",check);
    }

}