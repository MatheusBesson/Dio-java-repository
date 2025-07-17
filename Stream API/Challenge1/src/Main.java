import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

     // numbers sorted directly if object implements Comparable (like Integer in this case)
     numbers.stream()
             .sorted()
             .forEach(System.out::println);
    }
}
