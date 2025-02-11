package Parte2;

// Classe CurrencyConverter
public class CurrencyConverter {
    public static final double IOF = 0.06;

    public static double converter(double cotacao, double quantidade) {
        return quantidade * cotacao * (1 + IOF);
    }
}