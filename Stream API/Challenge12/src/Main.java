import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int productOfNumbers = numbers.stream()
                .reduce(1, (n1, n2) -> n1 * n2);

        System.out.println(productOfNumbers);
    }
}
