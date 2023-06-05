
    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class Task2 {
        public static List<String> sortAndUpperCase(List<String> strings) {
            List<String> result = new ArrayList<>(strings);
            for (int i = 0; i < result.size(); i++) {
                result.set(i, result.get(i).toUpperCase());
            }
            Collections.sort(result, Collections.reverseOrder());
            return result;
        }

        public static void main(String[] args) {
            List<String> strings = List.of("Ivan", "John", "Peter", "Alice", "Michael");
            List<String> sortedStrings = sortAndUpperCase(strings);
            System.out.println(sortedStrings);
        }
    }


