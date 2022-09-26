import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {


    @BeforeTest
    public void profileSetup() {
       System.out.println("Production by eblopas");
    }


    @Test
    public void firstTest(){
       Assert.assertEquals(1,1);
    }
    @AfterTest
    public void reportReady() {
        System.out.println("Вадик еблопас");
    }
}
