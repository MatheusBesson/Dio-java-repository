import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean allDistinct = numbers.stream()
                .distinct()
                .count() == numbers.size();

        System.out.println(allDistinct);
    }
}
