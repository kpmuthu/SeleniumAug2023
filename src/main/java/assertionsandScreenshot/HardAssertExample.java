package assertionsandScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void testHardAssert() {
        int actualResult = 5;
        int expectedResult = 10;
        
        Assert.assertEquals(actualResult, expectedResult, "Values do not match");
        
        // The test will stop here if the assertion fails
        System.out.println("This will not be executed if the assertion fails");
    }
}