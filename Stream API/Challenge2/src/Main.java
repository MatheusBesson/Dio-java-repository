import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Even numbers sum
        System.out.println(numbers.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (n1, n2) -> n1 + n2));
    }
}
