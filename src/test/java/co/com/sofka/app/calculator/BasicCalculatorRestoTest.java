package co.com.sofka.app.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorRestoTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several resto")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "1,    1,   0",
            "2,    2,   0",
            "20,   3,   2",
            "50,   4,   2"
    })

    public void severalDivicion(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.resto(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing resto  : 100 / 0 = ??")
    public void divicionEntreCero() {
        var mensaje = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            basicCalculator.resto(100L, 0L);
        }).getMessage();

        Assertions.assertEquals("No se puede dividir entre cero", mensaje);
    }
}
