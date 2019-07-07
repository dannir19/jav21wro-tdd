import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
@RunWith(JUnitParamsRunner.class)
public class PrimeNumberTest {

    PrimeNumber primeNumbers;

   @Test
   @Parameters({
           "6"
   })
    public void checkPrimeNumbers (int range) {

       List<Integer> list = new ArrayList<Integer>();
       list.add(2);
       list.add(3);
       list.add(5);
       assertEquals(list, primeNumbers.getPrimeNumbers(range));
       /* assertThat(list)
       .isEqualTo(primeNumber.getPrimeNumbers(range));
        */
   }

   @Test
    @Parameters ({
            "6,2,3,5"
    })
    public void checkPrimeNumbers(String ... args) {
       int range =Integer.parseInt(args[0]);
       List<Integer> list = new ArrayList<Integer>();
       for (int i = 1; i < args.length ; i++) {
           list.add(Integer.parseInt(args[i]));
       }
       assertEquals(list, primeNumbers.getPrimeNumbers(range));

       /*assertThat(list)
               .isEqualTo(primeNumbers.getPrimeNumbers(range)); */
   }
   @Before
    public void before(){
       primeNumbers = new PrimeNumber();
   }
}
