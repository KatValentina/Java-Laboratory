package Functions;

import java.util.ArrayList;
import java.util.List;

public class Page1 {
    public static <T,P>List<P> transform(List<T> list, Functii<T,P> func) {
        List<P> result = new ArrayList<>();
        for (T element : list) {
            result.add(func.apply(element));
        }
        return result;
    }
}
