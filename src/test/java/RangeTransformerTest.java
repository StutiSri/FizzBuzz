import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.willReturn;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@RunWith(JUnitPlatform.class)
class RangeTransformerTest {
    private RangeTransformer rangeTransformer;
    private NumberTransformer numberTransformer;

    @BeforeEach
    void init(@Mock NumberTransformer numberTransformer) {
        rangeTransformer = new RangeTransformer(numberTransformer);
        this.numberTransformer = numberTransformer;
    }

    @Test
    void shouldReturnEmptyListForRangeOf0() {
        List<String> transformedRange = rangeTransformer.transform(0);

        assertEquals(0, transformedRange.size());
    }

    @Test
    void shouldReturnSingletonForRangeOf1() {
        when(numberTransformer.outputFor(1)).thenReturn("1");

        List<String> transformedRange = rangeTransformer.transform(1);

        assertEquals(1, transformedRange.size());
    }

    @Test
    void shouldReturnSingletonWithValueAs1ForRangeOf1() {
        when(numberTransformer.outputFor(1)).thenReturn("1");
        List<String> transformedRange = rangeTransformer.transform(1);
        assertEquals("1", transformedRange.get(0));
    }

    @Test
    void shouldReturnListWithSize3ForRangeOf3() {
        willReturn("1").given(numberTransformer).outputFor(1);
        willReturn("SomeFunc").given(numberTransformer).outputFor(2);
        willReturn("OtherFunc").given(numberTransformer).outputFor(3);

        List<String> transformedRange = rangeTransformer.transform(3);

        assertEquals(3, transformedRange.size());
    }

    @Test
    void shouldReturnListWithTransformedValueRangeOf3() {
        willReturn("1").given(numberTransformer).outputFor(1);
        willReturn("SomeFunc").given(numberTransformer).outputFor(2);
        willReturn("OtherFunc").given(numberTransformer).outputFor(3);

        List<String> transformedRange = rangeTransformer.transform(3);

        assertEquals("1", transformedRange.get(0));
        assertEquals("SomeFunc", transformedRange.get(1));
        assertEquals("OtherFunc", transformedRange.get(2));
    }
}