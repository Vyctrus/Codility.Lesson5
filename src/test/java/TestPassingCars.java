import org.example.PassingCars;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TestPassingCars {
    static Stream<Arguments> methodSourceArgs() {
        return Stream.of(
                arguments(new int[]{0,1,0,1,1}, 5)
        );
    }

    @ParameterizedTest
    @MethodSource("methodSourceArgs")
    public void solutionTest(int[] A, int expected) {
        PassingCars s = new PassingCars();
        assertTrue((s.solution(A)==expected));
    }
}
