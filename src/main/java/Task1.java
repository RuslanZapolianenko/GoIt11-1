import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Peter", "John", "Alice", "David","Kris");
        String result = formatNames(names);
        System.out.println(result);
    }

    public static String formatNames(List<String> names) {
        return IntStream.range(0, names.size())
                .filter(i -> i % 2 != 0)
                .mapToObj(i -> (i + 1) + ". " + names.get(i))
                .collect(Collectors.joining(", "));
    }
}

//Метод принимает на вход список имен. Вернуть строку в виде: "1. Ivan, 3. Peter ...",
//   с именами из списка, стоящими под нечетным индексом (1, 3 и т.д.).