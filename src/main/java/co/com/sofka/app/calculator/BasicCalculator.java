package co.com.sofka.app.calculator;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class BasicCalculator {
    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 + number2;
    }

    public Long resta(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 - number2;
    }

    public Long multiplicacion(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 * number2;
    }

    public Long divicion(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        if (number2 == 0) {
            throw new IllegalArgumentException("No se puede vividir entre cero");
        }
        return number1 / number2;
    }

    public Long resto(Long number1, Long number2) {
        logger.info("Summing {} + {}", number1, number2);
        return number1 % number2;
    }

}
