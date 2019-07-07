public class NumberChanger {

    public static String changeNumber (Integer input) {

        if (input.intValue() % 15 ==0 ) { // mozna zrobic tez jako &&  ||  albo else if
            return "FizzBuzz";
        }
        else if  (input.intValue() % 5 ==0 ) {

            return "Buzz";
        } else if (input.intValue() % 3 ==0 )
        {

            return "Fizz";
        }
        else{
            return input.toString();
        }
    }
}
