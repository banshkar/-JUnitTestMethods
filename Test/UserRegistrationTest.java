import org.junit.Assert;
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
    public void givenFirstName_Should_ReturnHappy() {
       UserRegistration userRegistration1=new UserRegistration();
       try{
           userRegistration1.checkFirstName("Jitendra");
       } catch (Exception e){
           System.out.println(e);
       }
    }
    @Test
    public void givenLastName_Should_ReturnHappy()  {

        UserRegistration userRegistration1=new UserRegistration();
        try{
            userRegistration1.checkLastName("Banshkar");
        } catch (Exception e){
            System.out.println(e);
        }
    }
    @Test
    public void givenEmail_Should_ReturnHappy(){
        UserRegistration userRegistration1=new UserRegistration();
        try{
            userRegistration1.checkEmailSamplesProvidedSearately("jitendra@gmail.com");
        } catch (Exception e){
            System.out.println(e);
        }
    }
    @Test
    public void givenMobile_Should_ReturnHappy(){
        UserRegistration userRegistration1=new UserRegistration();
        try{
            userRegistration1.checkMobile("91 8523694578");
        } catch (Exception e){
            System.out.println(e);
        }
    }
    @Test
    public void givenPassword_Should_ReturnHappy(){
        UserRegistration userRegistration1=new UserRegistration();
        try{
            userRegistration1.checkPassword("Jitendra@123");
        } catch (Exception e){
            System.out.println(e);
        }
    }
}