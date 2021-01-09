import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzForNumber3() {
        assertEquals("Fizz", fizzBuzz.outputFor(3));
    }
}