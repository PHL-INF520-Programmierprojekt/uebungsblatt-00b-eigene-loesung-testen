package de.phl.programmingproject.calculator;

/**
 * Eine einfache Taschenrechner-Klasse, die Grundrechenarten unterstützt.
 * 
 * Unterstützte Operationen:
 * - Addition
 * - Subtraktion
 * - Multiplikation
 * - Division (Ganzzahldivision, Division durch 0 führt zu Exception)
 */
public class SimpleCalculator {

    /**
     * Addiert zwei ganze Zahlen.
     * @param numberA erste Zahl
     * @param numberB zweite Zahl
     * @return Summe von a und b
     */
    public int add(int numberA, int numberB) {
        return numberA + numberB;
    }

    /**
     * Subtrahiert die zweite Zahl von der ersten.
     * @param numberA erste Zahl
     * @param numberB zweite Zahl
     * @return Differenz von a und b
     */
    public int subtract(int numberA, int numberB) {
        return numberA + numberB;  
    }

    /**
     * Multipliziert zwei ganze Zahlen.
     * @param a erste Zahl
     * @param b zweite Zahl
     * @return Produkt von a und b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Dividiert die erste Zahl durch die zweite (Ganzzahldivision).
     * Wirft eine Exception, falls durch 0 geteilt wird.
     * @param numberA Dividend
     * @param numberB Divisor
     * @return Ergebnis der Division
     * @throws IllegalArgumentException falls b == 0
     */
    public int divide(int numberA, int numberB) {
        if (numberB == 0) {
            throw new IllegalArgumentException("Division durch 0 nicht erlaubt");
        }
        return numberA / numberB;
    }
}