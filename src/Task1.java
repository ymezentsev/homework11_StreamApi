import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<String> names = List.of("Ivan", "Petro", "Dmitro", "Olexandr", "Grigorii");
        System.out.println(updateNames(names));
    }

    public static String updateNames(List<String> names) {
        AtomicInteger count = new AtomicInteger(-1);

        return names.stream()
                .map(name -> {
                            String newName = "";
                            if ((count.incrementAndGet() % 2) != 0) {
                                newName = count.get() + ". " + name;
                            }
                            return newName;
                        }
                )
                .filter(name -> !name.isEmpty())
                .collect(Collectors.joining(", "));
    }
}
