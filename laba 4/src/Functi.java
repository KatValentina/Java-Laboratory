import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functi {
    public static <T, P> List<P> transformList(List<T> sourceList, Function<T, P> function) {
        if (sourceList == null) {
            return new ArrayList<>();
        }

        List<P> result = new ArrayList<>();
        for (T item : sourceList) {
            result.add(function.apply(item));
        }
        return result;
    }


}
