
    import java.util.stream.Stream;

    public class Task4 {

        public static Stream<Long> generateRandomNumbers(long a, long c, long m, long seed) {
            return Stream.iterate(seed, n -> (a * n + c) % m);
        }

        public static void main(String[] args) {
            long a = 25214903917L;
            long c = 11L;
            long m = (long) Math.pow(2, 48);
            long seed = 123456789L;

            Stream<Long> randomNumbers = generateRandomNumbers(a, c, m, seed);
            randomNumbers.limit(10).forEach(System.out::println);
        }
    }


