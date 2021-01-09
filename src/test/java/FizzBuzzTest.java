import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    private FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void shouldReturnFizzForNumber3() {
        assertEquals("Fizz", fizzBuzz.outputFor(3));
    }
}