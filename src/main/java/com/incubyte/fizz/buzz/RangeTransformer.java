package com.incubyte.fizz.buzz;

import java.util.ArrayList;
import java.util.List;

public class RangeTransformer {

    private NumberTransformer numberTransformer;

    public RangeTransformer(NumberTransformer numberTransformer) {
        this.numberTransformer = numberTransformer;
    }

    public List<String> transform(int range) {
        ArrayList<String> transformedRange = new ArrayList<String>();
        for (int num = 1; num <= range; num++) {
            transformedRange.add(numberTransformer.outputFor(num));
        }
        return transformedRange;
    }
}
