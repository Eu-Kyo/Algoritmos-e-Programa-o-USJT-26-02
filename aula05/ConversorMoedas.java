package aula05;

import java.util.Scanner;

public class ConversorMoedas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String moedas[] = { "Dolar", "Euro", "Libras", "Kwanza", "Geo", "Rosarios" };
        Double cotacao[] = { 5.18, 5.89, 6.85, 177.32, 0.03, 0.08 };

        /*
         * for(int i = 0 ; i<moedas.length; i++){
         * System.out.println("> Moeda: " + moedas[i]+" |  Cotação: "+cotacao[i]);
         * }
         */

        for (int i = 0; i < moedas.length; i++) {
            System.out.println("[" + i + "] - Moeda " + moedas[i]);
        }   
        System.out.println("> Qual moeda converter? ");
        int op = entrada.nextInt();

    }
}

// ctrl k ctrl c // ctrl k ctrl u