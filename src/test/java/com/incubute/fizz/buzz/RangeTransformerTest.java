package com.incubute.fizz.buzz;

import com.incubyte.fizz.buzz.NumberTransformer;
import com.incubyte.fizz.buzz.RangeTransformer;
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
        mockForRangeOf3();

        List<String> transformedRange = rangeTransformer.transform(3);

        assertEquals(3, transformedRange.size());
    }

    @Test
    void shouldReturnListWithTransformedValueRangeOf3() {
        mockForRangeOf3();

        List<String> transformedRange = rangeTransformer.transform(3);

        assertEquals("1", transformedRange.get(0));
        assertEquals("SomeFunc", transformedRange.get(1));
        assertEquals("OtherFunc", transformedRange.get(2));
    }

    @Test
    void shouldReturnListWithSize10ForRangeOf10() {
        mockForRangeOf10();

        List<String> transformedRange = rangeTransformer.transform(10);

        assertEquals(10, transformedRange.size());
    }

    @Test
    void shouldReturnListWithTransformedValueRangeOf10() {
        mockForRangeOf10();

        List<String> transformedRange = rangeTransformer.transform(10);

        assertEquals("1", transformedRange.get(0));
        assertEquals("SomeFunc", transformedRange.get(1));
        assertEquals("OtherFunc", transformedRange.get(2));
        assertEquals("4", transformedRange.get(3));
        assertEquals("5", transformedRange.get(4));
        assertEquals("Other", transformedRange.get(5));
        assertEquals("WhatThis", transformedRange.get(6));
        assertEquals("8", transformedRange.get(7));
        assertEquals("9", transformedRange.get(8));
        assertEquals("10", transformedRange.get(9));
    }

    private void mockForRangeOf10() {
        mockForRangeOf3();
        willReturn("4").given(numberTransformer).outputFor(4);
        willReturn("5").given(numberTransformer).outputFor(5);
        willReturn("Other").given(numberTransformer).outputFor(6);
        willReturn("WhatThis").given(numberTransformer).outputFor(7);
        willReturn("8").given(numberTransformer).outputFor(8);
        willReturn("9").given(numberTransformer).outputFor(9);
        willReturn("10").given(numberTransformer).outputFor(10);
    }

    private void mockForRangeOf3() {
        willReturn("1").given(numberTransformer).outputFor(1);
        willReturn("SomeFunc").given(numberTransformer).outputFor(2);
        willReturn("OtherFunc").given(numberTransformer).outputFor(3);
    }
}