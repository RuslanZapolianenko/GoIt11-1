import java.util.Arrays;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        String[] array = {"1, 2, 0", "4, 5"};
        String result = extractAndSortNumbers(array);
        System.out.println(result);
    }

    public static String extractAndSortNumbers(String[] array) {
        return Arrays.stream(array)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(String::trim)
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}

//Дан массив:

//["1, 2, 0", "4, 5"]

//Получить из массива все числа, вернуть в отсортированном виде, разделенные запятой, то есть

//"0, 1, 2, 4, 5"
