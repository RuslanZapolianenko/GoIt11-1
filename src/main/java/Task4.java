import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11;
        long m = (long) Math.pow(2, 48);
        long seed = 123456789;

        Stream<Long> randomStream = generateRandomStream(a, c, m, seed);
        randomStream.limit(10).forEach(System.out::println);
    }

    public static Stream<Long> generateRandomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m);
    }
}


// &#x418;&#x441;&#x43F;&#x43E;&#x43B;&#x44C;&#x437;&#x443;&#x44F; Stream. iterate &#x441;&#x434;&#x435;&#x43B;&#x430;&#x439;&#x442;&#x435; &#x431;&#x435;&#x441;&#x43A;&#x43E;&#x43D;&#x435;&#x447;&#x43D;&#x44B;&#x439; &#x441;&#x442;&#x440;&#x438;&#x43C; &#x440;&#x430;&#x43D;&#x434;&#x43E;&#x43C;&#x43D;&#x44B;&#x445; &#x447;&#x438;&#x441;&#x435;&#x43B;, &#x43D;&#x43E; &#x43D;&#x435; &#x438;&#x441;&#x43F;&#x43E;&#x43B;&#x44C;&#x437;&#x443;&#x44F; Math.random()//.
// Реализуйте свой "линейный конгруэнтный генератор".
// Для этого начните с x[0] = seed и затем каждый следующий элемент x[n + 1] = 1 (a x[n] + c) % m,
// для корректных значений a, c, и m. Необходимо имплементировать метод,
// который принимает на вход параметры, c, m и seed и возвращает Stream<Long>.
// Для теста используйте данные a = 25214903917, c = 11 и m = 2^48 (2 в степени 48).
