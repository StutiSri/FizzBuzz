package com.incubyte.fizz.buzz;

public class NumberTransformer {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final int NUMBER_ASSOCIATED_WITH_FIZZ = 3;
    private static final int NUMBER_ASSOCIATED_WITH_BUZZ = 5;

    public String outputFor(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        if (isMultipleOf(num, NUMBER_ASSOCIATED_WITH_FIZZ) || containsDigit(num, NUMBER_ASSOCIATED_WITH_FIZZ)) {
            stringBuilder.append(FIZZ);
        }
        if (isMultipleOf(num, NUMBER_ASSOCIATED_WITH_BUZZ) || containsDigit(num, NUMBER_ASSOCIATED_WITH_BUZZ)) {
            stringBuilder.append(BUZZ);
        }
        if (stringBuilder.length() == 0) {
            stringBuilder.append(num);
        }
        return stringBuilder.toString();
    }

    private boolean containsDigit(int num, int digitToBeSearched) {
        while (num % 10 != 0) {
            int digitInNumber = num % 10;
            if (digitInNumber == digitToBeSearched) {
                return true;
            }
            num = num / 10;
        }
        return false;
    }

    private boolean isMultipleOf(int num, int factor) {
        return num % factor == 0;
    }
}
