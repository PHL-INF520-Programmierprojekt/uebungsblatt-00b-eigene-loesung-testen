package de.phl.programmingproject.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 * Testklasse für den {@link SimpleCalculator}.
 * <p>
 * Diese Klasse enthält Unit-Tests für die vier Grundrechenarten (Addition, Subtraktion,
 * Multiplikation, Division) des {@code SimpleCalculator}. Die Tests überprüfen, ob die
 * Methoden korrekte Ergebnisse liefern und ob bei ungültigen Eingaben (z.B. Division durch Null)
 * die erwarteten Ausnahmen geworfen werden.
 * <p>
 * Hinweis: Die Platzhalterwerte (-1) für a, b und expected müssen durch sinnvolle Testwerte ersetzt werden.
 */
public class SimpleCalculatorTest {

    /**
     * Testet die Methode {@link SimpleCalculator#add(int, int)}.
     * <p>
     * Überprüft, ob die Addition zweier Zahlen korrekt berechnet wird.
     */
    @Test
    void testAddition() {
        SimpleCalculator calc = new SimpleCalculator();
        // TODO: a, b und expected anpassen
        int a = -1;
        int b = -1;
        int expected = -1;

        int actual = calc.add(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Testet die Methode {@link SimpleCalculator#subtract(int, int)}.
     * <p>
     * Überprüft, ob die Subtraktion zweier Zahlen korrekt berechnet wird.
     */
    @Test
    void testSubtraction() {
        SimpleCalculator calc = new SimpleCalculator();
        // TODO: a, b und expected anpassen
        int a = -1;
        int b = -1;
        int expected = -1;

        int actual = calc.subtract(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Testet die Methode {@link SimpleCalculator#multiply(int, int)}.
     * <p>
     * Überprüft, ob die Multiplikation zweier Zahlen korrekt berechnet wird.
     */
    @Test
    void testMultiplication() {
        SimpleCalculator calc = new SimpleCalculator();
        // TODO: a, b und expected anpassen
        int a = -1;
        int b = -1;
        int expected = -1;

        int actual = calc.multiply(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Testet die Methode {@link SimpleCalculator#divide(int, int)}.
     * <p>
     * Überprüft, ob die Division zweier Zahlen korrekt berechnet wird.
     */
    @Test
    void testDivision() {
        SimpleCalculator calc = new SimpleCalculator();
        // TODO: a, b und expected anpassen
        int a = -1;
        int b = -1;
        int expected = -1;

        int actual = calc.divide(a, b);
        assertEquals(expected, actual);
    }

    /**
     * Testet die Methode {@link SimpleCalculator#divide(int, int)} mit Division durch Null.
     * <p>
     * Erwartet, dass eine {@link IllegalArgumentException} geworfen wird, wenn der Divisor Null ist.
     */
    @Test
    void testDivisionDurchNull() {
		    // TODO: a und b anpassen, sodass eine IllegalArgumentException geworfen wird
		    int a = -1;
		    int b = -1;
        SimpleCalculator calc = new SimpleCalculator();
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(a, b);
        });
    }
}