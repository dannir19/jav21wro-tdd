import org.junit.Test;

public class Testtest {

  @Test
    public void getPrimeNumbers() {
        int range = 1000;

        for (int i = 2; i < range; i++) {
            double max_divider = (int)Math.sqrt(i); //nwd liczby jaki sprawdzamy
            boolean isPrime = false;
            for (int j = 2; j <= max_divider; j++) {
                if (i % j == 0) {
                    isPrime = true;
                    break;
                }
            }
            if (!isPrime) {
                System.out.println(i);
            }
        }

    }
}
