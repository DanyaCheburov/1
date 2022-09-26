import io.qameta.allure.Step;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {

    @Test
    public void simpleTest2() {
        Assert.assertEquals("a", "а");
    }
}
