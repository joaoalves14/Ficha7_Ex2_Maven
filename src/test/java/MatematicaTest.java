import static org.junit.jupiter.api.Assertions.*;

import org.example.Matematica;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class MatematicaTest {

    @ParameterizedTest
    @ValueSource(ints = {3, 23, 311, 487, 653, 947})
    public void testIsPrimeWithPrimes(int number) {
        assertTrue(Matematica.isPrime(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {32, 64, 2, 20, 30, 26})
    public void testIsEvenWithEvens(int number) {
        assertTrue(Matematica.isEven(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {23, 46, 115, 184, 207, 230})
    public void testIsMultipleOf23(int number) {
        assertTrue(Matematica.isMultiple(number, 23));
    }

    @ParameterizedTest
    @ValueSource(ints = {25, 39, 949})
    public void testIsNotPrimeAndEvenAndNotMultipleOf23(int number) {
        assertFalse(Matematica.isPrime(number));
        assertFalse(Matematica.isEven(number));
        assertFalse(Matematica.isMultiple(number, 23));
    }
}
