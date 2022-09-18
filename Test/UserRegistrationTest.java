import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
class UserRegistrationTest {
   UserRegistration userRegistration =new UserRegistration();
    @Test
    public void givenFirstName_Should_ReturnHappy(){
        String result =userRegistration.checkFirstName("Jitendra");
        assertEquals("HAPPY",result);
    }
    @Test
    public void givenLastName_Should_ReturnHappy(){
        String result =userRegistration.checkLastName("Banshkar");
        assertEquals("HAPPY",result);

    }
    @Test
    public void givenEmail_Should_ReturnHappy(){
        String result =userRegistration.checkEmailSamplesProvidedSearately("jitendra123@gmail.com");
        assertEquals("HAPPY",result);
    }
    @Test
    public void givenMobile_Should_ReturnHappy(){
        String result =userRegistration.checkMobile("91 8525646312");
        assertEquals("HAPPY",result);
    }
    @Test
    public void givenPassword_Should_ReturnHappy(){
        String result =userRegistration.checkPassword("Jitendra@123");
        assertEquals("HAPPY",result);
    }
}