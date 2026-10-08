package aula04;
import java.util.Scanner;

// Exercício 7 – Comparação entre Datas Simplificadas

public class Exercicio0407 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("> Olá! Insira duas datas(dd/mm/aa): ");
        int dia1, dia2, mes1, mes2, ano1, ano2;

        
        while (true) {
            dia1 = entrada.nextInt();
            mes1 = entrada.nextInt();
            ano1 = entrada.nextInt();
            dia2 = entrada.nextInt();
            mes2 = entrada.nextInt();
            ano2 = entrada.nextInt();

            if (dia1 > 31|| dia2 >31 ) {
            System.out.println("ERRO: o dia inserido é invalido!");
            }
            if (mes1 > 12 || mes2 > 12) {
                System.out.println("ERRO: o mês inserido é inválido!");
            }
            if (ano1 <= 0 || ano2 <= 0) {
                System.out.println("ERRO: o ano inserido é inválido!");
            }

            System.out.println("> Data inserida: ");
            System.out.format("%d/%d/%d\n%d/%d/%d\n", dia1, mes1, ano1, dia2, mes2, ano2);

            if (ano1 > ano2) {
                System.out.format("> %d/%d/%d é a mais antiga!\n", dia2, mes2, ano2);
                
            }
            else{
                System.out.format("> %d/%d/%d é a mais antiga!\n", dia1, mes1, ano1);

                /*if (mes1 > mes2) {
                    if (dia1 > dia2) {
                        System.out.format("> %d/%d/%d é a mais antiga!", dia1, mes1, ano1);
                    }
                    System.out.format("> %d/%d/%d é a mais antiga!", dia2, mes2, ano2);
                }
                System.out.format("> %d/%d/%d é a mais antiga!", dia2, mes2, ano2);*/
            }
            entrada.close();
        }
    }
}
