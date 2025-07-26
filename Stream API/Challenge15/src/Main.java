import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
// if there is negative numbers in the List
        boolean thereIsNegative = numbers.stream()
                .anyMatch(n -> n < 0);

        System.out.println(thereIsNegative);
    }
}
