package com.incubute.fizz.buzz;

import com.incubyte.fizz.buzz.NumberTransformer;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberTransformerTest {

    private NumberTransformer numberTransformer = new NumberTransformer();

    @Test
    void shouldReturnFizzForMultiplesOf3() {
        for (Integer num : Arrays.asList(3, 6, 9, 12)) {
            assertEquals("Fizz", numberTransformer.outputFor(num), String.format("Expecting Fizz for %s", num));
        }
    }

    @Test
    void shouldReturnFizzWhenNumberContains3InUnitsPlace() {
        for (Integer num : Arrays.asList(13, 23, 43, 39)) {
            assertEquals("Fizz", numberTransformer.outputFor(num), String.format("Expecting Fizz for %s", num));
        }
    }

    @Test
    void shouldReturnFizzForMultiplesOf5() {
        for (Integer num : Arrays.asList(5, 10, 20)) {
            assertEquals("Buzz", numberTransformer.outputFor(num), String.format("Expecting Buzz for %s", num));
        }
    }

    @Test
    void shouldReturnFizzBuzzForMultiplesOf3And5() {
        for (Integer num : Arrays.asList(15, 45, 30)) {
            assertEquals("FizzBuzz", numberTransformer.outputFor(num), String.format("Expecting FizzBuzz for %s", num));
        }
    }

    @Test
    void shouldReturnNumberForNonMultiplesOf3AndOr5() {
        for (Integer num : Arrays.asList(1, 2, 4, 11, 31, 34)) {
            assertEquals(String.format("%s", num), numberTransformer.outputFor(num), String.format("Expecting %s for %s", num, num));
        }
    }
}