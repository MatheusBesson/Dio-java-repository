import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Average values higher than 5
        System.out.println(numbers.stream()
                .filter(n -> n > 5)
                .mapToInt(n -> 0 + n)
                .average());

        //mapToInt use to convert to primitive int, to use methods like sum, min, max and ,in this case, average.
    }
}
