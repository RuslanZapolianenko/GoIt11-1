
    import java.util.Iterator;
import java.util.stream.Stream;

    public class Task5 {
        public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
            Iterator<T> iteratorFirst = first.iterator();
            Iterator<T> iteratorSecond = second.iterator();

            Stream.Builder<T> builder = Stream.builder();

            while (iteratorFirst.hasNext() && iteratorSecond.hasNext()) {
                builder.accept(iteratorFirst.next());
                builder.accept(iteratorSecond.next());
            }

            return builder.build();
        }

        public static void main(String[] args) {
            Stream<Integer> first = Stream.of(1, 2, 3, 4, 5);
            Stream<Integer> second = Stream.of(6, 7, 8, 9, 10);

            Stream<Integer> zippedStream = zip(first, second);

            zippedStream.forEach(System.out::println);
        }
    }


//Напишите метод public static <T> Stream<T> zip(Stream<T> first, Stream<T> second)
// который "перемешивает" элементы из стримов first и second, останавливается тогда,
// когда у одного из стримов закончатся элементы.