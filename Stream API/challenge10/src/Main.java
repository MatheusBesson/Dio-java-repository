import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> multipleOf3And5Odd = numbers.stream()
                .filter(n -> n % 2 != 0)
                        .filter(n -> n % 3 == 0 || n % 5 == 0)
                                .collect(Collectors.toList());
        System.out.println(multipleOf3And5Odd);
    }
}
