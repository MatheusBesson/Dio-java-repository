import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Integer secondLargest = numbers.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList()
                .get(1);

        System.out.println(secondLargest);
    }
}
