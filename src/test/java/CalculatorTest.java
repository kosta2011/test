import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Assertions.assertEquals(10, Calculator.add(7, 3));
    }

    // Можно добавить еще тесты для других операций
}
