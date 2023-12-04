/**
 * Gibt die Summe, Differenz, Produkt und Quotient von x und y aus
 */

public class Rechnen {
    public static void main(String[] args){
        int x = 1;
        int y = 0;
        System.out.println("Summe: " + (x+y));
        System.out.println("Differenz: " + (x-y));
        System.out.println("Produkt: " + (x*y));
        System.out.println("Quotient: " + (x/y));
    }
}

/**
 * Es fällt auf, dass in der Runtime beim teilen durch null ein fehler geworfen wird, und die Division immer ein ganzzahliges ergebis gibt
 */