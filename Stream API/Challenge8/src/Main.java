import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // sum of all digits
        System.out.println(numbers.stream()
                .flatMapToInt(n -> String.valueOf(n).chars())
                .map(c -> c - 0) // or 48
                .sum());

        // flatMapToInt turns a list or string into a stream of its parts and return IntStream; valueOf() to ASCII code, and chars becomes IntStream;
        // map to convert ASCII code to actual number (remembering '0' equals to 48 ASCII code)
        // sum all the digits of new IntStream
    }
}
