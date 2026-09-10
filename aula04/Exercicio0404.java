package aula04;
import java.util.Scanner;

// Identificar maior número.

public class Exercicio0404 {
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);

        System.out.println("> Digite 3 números inteiros para que eu apresente o maior entre eles: ");
        int num1 = numScanner.nextInt();
        int num2 = numScanner.nextInt();
        int num3 = numScanner.nextInt();
        
        if (num1 > num2 && num3 > num1) {
            System.out.println("> "+ num3 + " é o maior número!");
        }
        if (num2 > num3 && num1 > num2) {
            System.out.println("> " + num1 + " é o maior número!");
        } else {
            System.out.println("> " + num2 + " é o maior número!");
        }
    }
}
