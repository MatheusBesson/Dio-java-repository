import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int start = 5;
        int end = 10;

        List<Integer> filtered = numbers.stream()
                .filter(n -> n >= start && n <= end)
                .collect(Collectors.toList());

        System.out.println(filtered);
    }
}
