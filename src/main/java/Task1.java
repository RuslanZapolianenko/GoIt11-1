
    import java.util.List;

    public class Task1 {
        public static String formatNames(List<String> names) {
            StringBuilder formattedNames = new StringBuilder();
            for (int i = 0; i < names.size(); i++) {
                if (i % 2 != 0) {
                    formattedNames.append((i + 1)).append(". ").append(names.get(i)).append(", ");
                }
            }
            if (formattedNames.length() > 0) {
                formattedNames.delete(formattedNames.length() - 2, formattedNames.length());
            }
            return formattedNames.toString();
        }

        public static void main(String[] args) {
            List<String> names = List.of("Ivan", "John", "Peter", "Alice", "Michael");
            String result = formatNames(names);
            System.out.println(result);
        }
    }


