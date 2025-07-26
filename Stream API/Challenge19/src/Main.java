import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        // filtering and adding divisors of 3 and 5
        Optional<Integer> by3And5 = numbers.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .reduce((n1, n2) -> n1 + n2);

        System.out.println(by3And5);

        // other way to do it
        int sum = numbers.stream()
                .filter(n -> n % 3 == 0 || n % 5 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sum);
    }
}
