package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorRestaTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several resta")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "1,    1,   0",
            "1,    2,   -1",
            "49,  51, -2",
            "1,  100, -99"
    })

    public void severalResta(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.resta(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
}
