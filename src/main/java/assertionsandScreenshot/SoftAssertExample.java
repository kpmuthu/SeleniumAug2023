package assertionsandScreenshot;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;

public class SoftAssertExample {

    @Test
    public void testSoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        
        int actualResult = 5;
        int expectedResult = 10;
        
        softAssert.assertEquals(actualResult, expectedResult, "Values do not match");
        
        // The test continues running even if the assertion fails
        System.out.println("This will be executed even if the assertion fails");
        
        // Perform more assertions
        softAssert.assertTrue(false, "This assertion will fail too");
        
        // Collect all assertion failures
        softAssert.assertAll();
    }
}

