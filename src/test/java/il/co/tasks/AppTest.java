package il.co.tasks;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    ConvertDomain firstConvert = new ConvertDomain(22, 33);
    ConvertDomain secondConvert = new ConvertDomain(10, 11);
    ConvertDomain thirdConvert = new ConvertDomain(1000, 1);

    @Test
    public void firstConvertShouldBeBiggerThenSecondConvert(){
        String expectedResult = "You can put the second Convert inside First one";
        String actualResult = ConvertComparator.convertCompare(firstConvert, secondConvert);
        assertTrue( expectedResult.equals(actualResult));
    }

    @Test
    public void secondConvertShouldBeBiggerThenFirstConvert(){
        String expectedResult = "You can put the first Convert inside Second one";
        String actualResult = ConvertComparator.convertCompare(secondConvert, firstConvert);
        assertTrue( expectedResult.equals(actualResult));
    }

    @Test
    public void negativeTest(){
        String expectedResult = "You can't put any Convert inside each other";
        String actualResult = ConvertComparator.convertCompare(thirdConvert, firstConvert);
        assertTrue( expectedResult.equals(actualResult));
    }

    @Test
    public void negativeTest1(){
        String expectedResult = "You can't put any Convert inside each other";
        String actualResult = ConvertComparator.convertCompare(firstConvert, thirdConvert);
        assertTrue( expectedResult.equals(actualResult));
    }
}
