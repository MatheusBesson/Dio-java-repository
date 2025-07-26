import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        // collecting prime numbers
        List<Integer> primeNumbers = numbers.stream()
                .filter(Main::isPrime)
                .collect(Collectors.toUnmodifiableList());

        System.out.println(primeNumbers);

    }

    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
