import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.List;

public class PrimeNumber {

    public List<Integer> getPrimeNumbers (int range) {
     List<Integer> list = new ArrayList<Integer>();
     for (int i =2; i < range; i++) {
         int max_divider = (int) Math.sqrt(i);
         boolean isPrime = false;
         for (int j = 2; j <=max_divider; j++) {
             if (i % j ==0 ) {
                 isPrime = true;
                 break;
             }
         }
         if (!isPrime) {
             list.add(i);
         }
     }
        return list;
    }
}
