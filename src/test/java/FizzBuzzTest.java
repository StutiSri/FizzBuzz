import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzForMultiplesOf3() {
        for (Integer num : Arrays.asList(3, 6, 9, 12)) {
            assertEquals("Fizz", fizzBuzz.outputFor(num));
        }
    }

    @Test
    void shouldReturnFizzForMultiplesOf5() {
        for (Integer num : Arrays.asList(5, 10, 15)) {
            assertEquals("Buzz", fizzBuzz.outputFor(num));
        }
    }
}