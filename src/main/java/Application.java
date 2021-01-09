import com.incubyte.fizz.buzz.NumberTransformer;
import com.incubyte.fizz.buzz.RangeTransformer;

import java.util.List;

public class Application {

    private static final int DEFAULT_RANGE = 100;

    public static void main(String[] args) {
        int range = rangeFromInput(args);
        NumberTransformer numberTransformer = new NumberTransformer();
        List<String> transformedList = new RangeTransformer(numberTransformer).transform(range);

        for (String transformedNumber : transformedList) {
            System.out.println(transformedNumber);
        }
    }

    private static int rangeFromInput(String[] arg) {
        if (arg == null || arg.length == 0) {
            return DEFAULT_RANGE;
        }
        return Integer.parseInt(arg[0]);
    }
}
