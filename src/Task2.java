import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Petro", "Dmitro", "Olexandr", "Grigorii");
        System.out.println(setToUpperCaseAndSortByDesc(names));
    }

    public static List<String> setToUpperCaseAndSortByDesc(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
