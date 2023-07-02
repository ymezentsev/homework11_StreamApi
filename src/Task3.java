import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] numbers = {"1, 2, 0", "4, 5"};
        System.out.println(getNumbersAndSort(numbers));
    }

    public static List<Integer> getNumbersAndSort(String[] numbers) {
        return Arrays.stream(numbers)
                .flatMap(element -> Arrays.stream(element.split(", ")))
                .map(Integer::parseInt)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
