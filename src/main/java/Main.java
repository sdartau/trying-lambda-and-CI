import java.util.function.BiFunction;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Runnable sayHello = () -> System.out.println("Hello from lambda");
        sayHello.run();

        Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("text"));

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a+b;
        System.out.println(add.apply(4, 5));
    }
}
