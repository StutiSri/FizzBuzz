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
    void shouldReturnFizzWhenNumberContains3InHundredthPlace() {
        for (Integer num : Arrays.asList(336, 332, 338, 337)) {
            assertEquals("Fizz", numberTransformer.outputFor(num), String.format("Expecting Fizz for %s", num));
        }
    }

    @Test
    void shouldReturnFizzWhenNumberContains3InThousandthPlace() {
        for (Integer num : Arrays.asList(322, 328, 319)) {
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
    void shouldReturnBuzzWhenNumberContains5() {
        for (Integer num : Arrays.asList(56, 541, 58)) {
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
    void shouldReturnFizzBuzzForNumbersContainingBoth3And5() {
        for (Integer num : Arrays.asList(532, 503, 53)) {
            assertEquals("FizzBuzz", numberTransformer.outputFor(num), String.format("Expecting FizzBuzz for %s", num));
        }
    }

    @Test
    void shouldReturnFizzBuzzForNumbersDivisibleBy3AndContains5() {
        for (Integer num : Arrays.asList(504, 507, 513)) {
            assertEquals("FizzBuzz", numberTransformer.outputFor(num), String.format("Expecting FizzBuzz for %s", num));
        }
    }

    @Test
    void shouldReturnNumberForNonMultiplesOf3AndOr5() {
        for (Integer num : Arrays.asList(1, 2, 4, 11, 22, 26)) {
            assertEquals(String.format("%s", num), numberTransformer.outputFor(num), String.format("Expecting %s for %s", num, num));
        }
    }

    @Test
    void shouldReturnNumberForNonMultiplesOf5AndOr3() {
        for (Integer num : Arrays.asList(305, 310, 130, 230)) {
            assertEquals("FizzBuzz", numberTransformer.outputFor(num), String.format("Expecting FizzBuzz for %s", num));
        }
    }
}