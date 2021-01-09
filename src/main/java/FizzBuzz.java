public class FizzBuzz {

    private static final String FIZZ = "Fizz";

    String outputFor(int num) {
        if (num % 3 == 0) {
            return FIZZ;
        }
        return null;
    }
}
