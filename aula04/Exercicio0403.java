package aula04;
import java.util.Scanner;;;

// Identificador de anos bissextos:

public class Exercicio0403 {
    public static void  main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("> Olá, boas vindas! \n> Digite um ano para descobrir se é bissexto ou não :D");
        int ano = scanner.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0)
        {
            System.out.println("> "+ ano + " é um ano bissexto!! :0");
        }else{
            System.out.println("> " + ano + " não é um ano bissexto... :(");
        }
        scanner.close();
    }
}
