package aula06;
import java.util.Scanner;



public class Sacola {
    static String prods[] = {"Feijão", "Batata", "Alface", "Arroz"};
    static int sacola[] = new int[1000];
    static int qtd = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Screen.clear();
        imprimeProd();
        System.out.println("> Qual deseja adicionar?\n(-1 para sair)");
        int cod = sc.nextInt();

        while (cod>=0) {
            System.out.println("> Qual deseja adicionar?\n(-1 para sair)");
            cod = sc.nextInt();
            
            sacola[qtd] = cod;
            qtd++;
            Screen.clear();
            imprimeProd();
            
        }
        imprimeSacola();
    }
    public static void imprimeProd(){

        System.out.println("====== PRODUTOS ======");
        for(int i = 0; i < prods.length; i++){
            System.out.println(i+" - "+ prods[i]);
        }
    }
    public static void imprimeSacola(){
        System.out.println("====== SACOLA ======");
        for(int i = 0; i < qtd; i++){
            int cod = sacola[i];
            System.out.println(i+" - "+ prods[cod]);
        }
    }
}
