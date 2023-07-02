import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        Stream<Long> randomNumber = getRandomNumber(25214903917L, 11L, (long) Math.pow(2, 48), 1L);
        System.out.println(randomNumber.limit(5).collect(Collectors.toList()));
    }

    public static Stream<Long> getRandomNumber(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}

