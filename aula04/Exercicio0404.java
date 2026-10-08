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
        
        // Com certeza pode ser simplificado, mas foi o que eu consegui
        if (num1 > num2 && num1 > num3) {
            System.out.println("> " + num1 + " é o maior número!");
        }
        else{
            if (num2>num3 ) {
                System.out.println("> " + num2 + " é o maior número!");
            }
            else{
                System.out.println("> " + num3 + " é o maior número!");
            }
        }
        numScanner.close();
    }
}

/*
    num1 > num2 > num3; 
    se num1>num2 e num2>num3: num1 maior
    senao num2>num3: num2 maior
    senao: num3 maior
*/