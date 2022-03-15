package co.com.sofka.app.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BasicCalculatorDivicionTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several divicion")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "1,    1,   1",
            "2,    2,   1",
            "20,   4,   5",
            "50,  -5, -10"
    })

    public void severalDivicion(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.divicion(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing divicion  : 100 / 0 = ??")
    public void divicionEntreCero() {
        var mensaje = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            basicCalculator.divicion(100L, 0L);
        }).getMessage();

        Assertions.assertEquals("No se puede dividir entre cero", mensaje);
    }
}
