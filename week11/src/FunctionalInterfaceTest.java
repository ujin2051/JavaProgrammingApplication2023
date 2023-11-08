import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> square = n -> n * n;
        System.out.println(square.apply(7));

        BinaryOperator<Integer> add = (a, b) -> a + b;
        System.out.println(add.apply(7, -11));

        Consumer<String> pokemon = (name) -> {
            System.out.println(name + "!");
            // return 9; = 오류남 (컨슈머는 리턴값이 없음)
        };
        pokemon.accept("피카츄");
    }
}
