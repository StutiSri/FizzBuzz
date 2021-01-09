import java.util.ArrayList;
import java.util.List;

class RangeTransformer {
    List<String> transform(int range) {
        ArrayList<String> transformedRange = new ArrayList<String>();
        if(range == 0){
            return transformedRange;
        }
        transformedRange.add(String.format("%s", range));
        return transformedRange;
    }
}
