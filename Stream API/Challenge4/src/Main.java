import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // removing all odd numbers and returning a new List
        List<Integer> evenList = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(toList());

        System.out.println(evenList);
    }
}
