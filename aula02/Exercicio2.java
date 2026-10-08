import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[]args)
    {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3, media;

        System.out.println("Ola! Insira 3 notas (0 - 100%) para calcular a média do aluno: "); System.out.println();
        System.out.println("Nota 1: ");
        nota1 = entrada.nextInt();
        System.out.println("Nota 2: ");
        nota2 = entrada.nextInt();
        System.out.println("Nota 3: ");
        nota3 = entrada.nextInt();
        
        media = ((nota1 * 30 + nota2 * 30  + nota3 * 40 ) / 100);

        System.out.println("A média do aluno é: " + media);
        //System.out.println("teste");    

        if(media>= 70){
            System.out.println("Situação: Aprovado!");
        }
        if(media >= 70 && media < 70)
        {
            System.out.println("Situação: A1");
        }
        if(media < 30)
        {
            System.out.println("Situação: Reprovado...");
        }
        entrada.close();
    }
}