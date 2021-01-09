import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzForMultiplesOf3() {
        for (Integer num : Arrays.asList(3, 6, 9, 12)) {
            assertEquals("Fizz", fizzBuzz.outputFor(num), String.format("Expecting Fizz for %s", num));
        }
    }

    @Test
    void shouldReturnFizzForMultiplesOf5() {
        for (Integer num : Arrays.asList(5, 10, 20)) {
            assertEquals("Buzz", fizzBuzz.outputFor(num), String.format("Expecting Buzz for %s", num));
        }
    }

    @Test
    void shouldReturnFizzBuzzForMultiplesOf3And5() {
        for (Integer num : Arrays.asList(15, 45, 30)) {
            assertEquals("FizzBuzz", fizzBuzz.outputFor(num), String.format("Expecting FizzBuzz for %s", num));
        }
    }
}