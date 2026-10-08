/* Exercício 01 - Caixa de Super Mercado Modular
    1.Exibir os produtos
    2.Ler as compras do usuário
    3.Calcular o total
    4.Exibir o resumo da compra 
*/
package aula06;
import java.util.Scanner;

public class Exercicio0106 {
    static String produtos[] = {"Arroz", "Feijão", "Carne", "Frango", "Ovo", "Leite", "Kinder Ovo", "Banana", "Melância", "Maçã", "Suco de laranja"};
    static String sacola[] = new String[1000]; // Um array contendo os produtos, outro contendo o tamanho max desse array
    static int qnt = 0;
    public static void main(String[] args){
        Screen.clear();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Boas vindas! Escolha os produtos que deseja:");
        imprimeProduto();
        System.out.println("Digite (-1) para sair");
        int cod = sc.nextInt();

        while (cod >= 0) {
            System.out.println("Qual produto adicionar?\n(-1 para sair)");
            cod = sc.nextInt();

            //sacola[qnt] = cod;

        }




        sc.close();
    }   
    public static void imprimeProduto(){
        System.out.println("======== PRODUTOS ========");
        for(int i = 0; i < produtos.length; i++){
            System.out.println(i + " - "+ produtos[i]);
        }
    } 
}
