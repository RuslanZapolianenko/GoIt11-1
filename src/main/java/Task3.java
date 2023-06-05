
    import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
    public class Task3 {

        public static String extractAndSortNumbers(String[] array) {
            List<Integer> numbers = new ArrayList<>();
            for (String str : array) {
                String[] strNumbers = str.split(", ");
                for (String numStr : strNumbers) {
                    try {
                        int num = Integer.parseInt(numStr);
                        numbers.add(num);
                    } catch (NumberFormatException e) {
                        // Пропускаем невалидные числа
                    }
                }
            }
            Collections.sort(numbers);
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < numbers.size(); i++) {
                if (i > 0) {
                    result.append(", ");
                }
                result.append(numbers.get(i));
            }
            return result.toString();
        }

        public static void main(String[] args) {
            String[] array = {"1, 2, 0", "4, 5"};
            String sortedNumbers = extractAndSortNumbers(array);
            System.out.println(sortedNumbers);
        }
    }


