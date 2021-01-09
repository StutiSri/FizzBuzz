package functional;

import com.incubyte.fizz.buzz.NumberTransformer;
import com.incubyte.fizz.buzz.RangeTransformer;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeTransformerFunctionalTest {

    private RangeTransformer rangeTransformer;

    @BeforeEach
    void init(){
        rangeTransformer = new RangeTransformer(new NumberTransformer());
    }

    @Test
    void shouldReturnEmptyListForRangeOf0() {
        List<String> transformedList = rangeTransformer.transform(0);
        assertEquals(0, transformedList.size());
    }

    @Test
    void shouldReturnSingletonForRangeOf1() {
        List<String> transformedList = rangeTransformer.transform(1);
        assertEquals(1, transformedList.size());
        assertEquals("1", transformedList.get(0));
    }

    @Test
    void shouldReturnTransformedListForRangeOf15() {
        List<String> transformedList = rangeTransformer.transform(15);
        assertEquals(15, transformedList.size());
        assertEquals("1", transformedList.get(0));
        assertEquals("2", transformedList.get(1));
        assertEquals("Fizz", transformedList.get(2));
        assertEquals("4", transformedList.get(3));
        assertEquals("Buzz", transformedList.get(4));
        assertEquals("Fizz", transformedList.get(5));
        assertEquals("7", transformedList.get(6));
        assertEquals("8", transformedList.get(7));
        assertEquals("Fizz", transformedList.get(8));
        assertEquals("Buzz", transformedList.get(9));
        assertEquals("11", transformedList.get(10));
        assertEquals("Fizz", transformedList.get(11));
        assertEquals("Fizz", transformedList.get(12));
        assertEquals("14", transformedList.get(13));
        assertEquals("FizzBuzz", transformedList.get(14));
    }

    @Test
    void shouldReturnTransformedListForRangeOf150() {
        List<String> transformedList = rangeTransformer.transform(150);
        assertEquals(150, transformedList.size());
        assertEquals("Fizz", transformedList.get(31));
        assertEquals("FizzBuzz", transformedList.get(52));
        assertEquals("Buzz", transformedList.get(54));
        assertEquals("FizzBuzz", transformedList.get(56));
        assertEquals("Fizz", transformedList.get(113));
        assertEquals("FizzBuzz", transformedList.get(129));
    }
}
