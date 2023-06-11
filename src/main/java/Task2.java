import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Ivan", "Peter", "John", "Alice", "David","Kris");
        List<String> result = sortAndToUpper(strings);
        System.out.println(result);
    }

    public static List<String> sortAndToUpper(List<String> strings) {
        return strings.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}

//Метод принимает на вход список из строк (можно список из Задания 1).
// Возвращает список этих строк в верхнем регистре и отсортированные по убыванию (от Z до А).
