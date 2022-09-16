import org.junit.jupiter.api.Test;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {
    UserRegistration user =new UserRegistration();
    @Test
    public void givingFirstNameForChecking(){
       String check =user.checkValid("JITENDRA");
       assertEquals("Happy!",check);
    }
}