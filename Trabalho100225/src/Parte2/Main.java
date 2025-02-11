package Parte2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Problema "cambio"
        System.out.println("Qual o valor do dólar?");
        double cotacao = sc.nextDouble();
        System.out.println("Quantos dólares serão comprados?");
        double quantidade = sc.nextDouble();
        System.out.printf("Valor a ser pago em reais = %.2f\n", CurrencyConverter.converter(cotacao, quantidade));
 
        sc.close();
    }
}