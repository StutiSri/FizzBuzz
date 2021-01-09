import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RangeTransformerTest {
    private RangeTransformer rangeTransformer = new RangeTransformer();

    @Test
    void shouldReturnEmptyListForRangeOf0() {
        List<String> transformedRange = rangeTransformer.transform(0);
        assertEquals(0, transformedRange.size());
    }

    @Test
    void shouldReturnSingletonForRangeOf1() {
        List<String> transformedRange = rangeTransformer.transform(1);
        assertEquals(1, transformedRange.size());
    }

    @Test
    void shouldReturnSingletonWithValueAs1ForRangeOf1() {
        List<String> transformedRange = rangeTransformer.transform(1);
        assertEquals("1", transformedRange.get(0));
    }

    @Test
    void shouldReturnListWithSize3ForRangeOf3() {
        List<String> transformedRange = rangeTransformer.transform(3);
        assertEquals(3, transformedRange.size());
    }

    @Test
    void shouldReturnListWithTransformedValueRangeOf3() {
        List<String> transformedRange = rangeTransformer.transform(3);
        assertEquals("1", transformedRange.get(0));
        assertEquals("2", transformedRange.get(1));
        assertEquals("3", transformedRange.get(2));
    }
}