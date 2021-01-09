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
}