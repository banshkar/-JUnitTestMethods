import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.*;
@RunWith(Parameterized.class)
class UserRegistrationTest {
      private  String email;
      private  boolean result;
      private  UserRegistration user ;
      public UserRegistrationTest(String email,boolean result){
          super();
          this.email=email;
          this.result=result;
      }
      @Before
      public void initial(){
          user =new UserRegistration();
      }
    @Parameterized.Parameters
    public  static Collection inputEmail(){
          return Arrays.asList(new Object[][]{
                  {"abc.100@yahoo.com",true},
                  {"abc-100@yahoo.com",true},
                  {"abc+100@yahoo.com",true},
                  {"abc100@ab.com.com",false},
                  {"abc.100@12.com",false},
                  {"abc.100.df@yahoo.com.com",false},
                  {"abc.100.@@yahoo.com",false},
          });
    }
    @Test
    public void givingEmailSamplesProvidedSearatelyForCheckingValidOrInvalid(){
        System.out.println("result"+result);
    assertEquals(result,user.checkEmailSamplesProvidedSearately(email));
    }
}