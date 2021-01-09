public class NumberTransformer {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final int FIZZ_FACTOR = 3;
    private static final int BUZZ_FACTOR = 5;

    String outputFor(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        if (isMultipleOf(num, FIZZ_FACTOR)) {
            stringBuilder.append(FIZZ);
        }
        if (isMultipleOf(num, BUZZ_FACTOR)) {
            stringBuilder.append(BUZZ);
        }
        if(stringBuilder.length() == 0){
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }

    private boolean isMultipleOf(int num, int factor) {
        return num % factor == 0;
    }
}
