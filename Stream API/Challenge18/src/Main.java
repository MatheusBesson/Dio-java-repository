import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // if all elements are equals to element in first position, it returns true
        boolean isTheSameNum = numbers.stream()
                .allMatch(n -> n.equals(numbers.get(0)));

        System.out.println(isTheSameNum);
    }
}
