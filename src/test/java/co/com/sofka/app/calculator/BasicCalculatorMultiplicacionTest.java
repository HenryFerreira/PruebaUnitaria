package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorMultiplicacionTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several multiplicacion")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "1,    2,   2",
            "3,    3,   9",
            "5,   -5, -25"
    })

    public void severalMultiplicacion(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiplicacion(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
