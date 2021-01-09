public class FizzBuzz {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    public static final int FIZZ_FACTOR = 3;
    public static final int BUZZ_FACTOR = 5;

    String outputFor(int num) {
        if (isMultipleOf(num, FIZZ_FACTOR)) {
            return FIZZ;
        }
        if (isMultipleOf(num, BUZZ_FACTOR)) {
            return BUZZ;
        }
        return null;
    }

    private boolean isMultipleOf(int num, int factor) {
        return num % factor == 0;
    }
}
