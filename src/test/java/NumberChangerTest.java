import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
@RunWith(JUnitParamsRunner.class)
public class NumberChangerTest {

    @Test
    @Parameters({
            "1 ,1",
            "4, 4",
            "3, Fizz",
            "5, Buzz",
            "15,FizzBuzz"
    })

    public void notChangeNumberTest(int input, String expected) {
        assertEquals(expected, NumberChanger.changeNumber(input));
    }

    @Before
    public void before(){
        NumberChanger numberChanger = new NumberChanger();
    }
}
