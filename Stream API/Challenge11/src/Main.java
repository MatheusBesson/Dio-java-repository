import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // squares sum

        List<Integer> squaredNum = numbers.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squaredNum);

        int sumOfSquared = squaredNum.stream()
                .reduce(0, (n1, n2) -> n1 + n2);

        System.out.println(sumOfSquared);
    }
}
