package aula04;
import java.util.Scanner;

// Ler 3 números inteiros e apresentá-los em ordem crescente.

public class Exercicio0405 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num1, num2, num3, auxiliar;
        System.out.println("> Digite 3 números inteiros para os organizar em ordem crescente: ");
        num1 = entrada.nextInt();
        num2 = entrada.nextInt();
        num3 = entrada.nextInt();

        if (num1>num2) {
            auxiliar = num1;    // maior armazenado 
            num1 = num2;        // valor 1 recebe o valor 2, o menor fica primeiro
            num2 = auxiliar;    // valor 2 recebe o 1, que é o maior, ficando o menor na pos 1 e o maior na 2
        }
        if (num2>num3) {
            auxiliar = num2;    // valor(1) é armazenado
            num2 = num3;        // recebe o valor do proximo
            num3 = auxiliar;    // troca com o valor 2, ficando com o maior valor na ultima posição
        }
        if (num1>num2) {
            auxiliar = num1;    // repete para evitar que a ordem do valor 1 e 2 fiquem incorretas
            num1 = num2;
            num2 = auxiliar;
        }

        System.out.println("> Os números ordenados são: "+ num1+", "+num2+", "+num3);
        entrada.close();
    }    
}

/*
    Eu posso OU armazenar em uma variável cada valor em ordem, OU printar conforme a ordem
    Ordem crescente: num1<num2<num3
*/