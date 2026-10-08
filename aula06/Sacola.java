package aula06;
import java.util.Scanner;



public class Sacola {
    static String prods[] = {"Feijão", "Batata", "Alface", "Arroz"};
    static int sacola[] = new int[1000];
    static int qtd = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Screen.clear();
        int opMenu = imprimeMenu();

        while (opMenu > 0) {
            if(opMenu == 1){
                imprimeProd();
                System.out.println("Digite alguma coisa...");
                sc.nextInt();
            }
            if(opMenu == 2){
                imprimeSacola();
                System.out.println("Digite alguma coisa...");
                sc.nextInt();
            }
            if(opMenu == 3){
                imprimeSacola();
                System.out.println();
                sc.nextInt();
                
            }
            if (opMenu == 4) {
                excluirProduto();
            }
            if(opMenu == 5)
            {

            }
            if (opMenu == 6) {
                sacola[0] = 1; sacola[1] = 3; sacola[2] = 2; sacola[3] = 0; sacola[4] = 1;
                imprimeSacola();
            }
            sc.close();
    }

        // Screen.clear();
        // imprimeProd();
        // System.out.println("> Qual deseja adicionar?\n(-1 para sair)");
        // int cod = sc.nextInt();

        // while (cod>=0) {
        //     System.out.println("> Qual deseja adicionar?\n(-1 para sair)");
        //     cod = sc.nextInt();
            
        //     sacola[qtd] = cod;
        //     qtd++;
        //     Screen.clear();
        //     imprimeProd();
            
        // }
        // imprimeSacola();
        // sc.close();
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

    public static void excluirProduto(){
        Scanner sc = new Scanner(System.in);
        imprimeSacola();
        sc.close();
    }

    public static int imprimeMenu(){
        Scanner sc = new Scanner(System.in);
        int opMenu = -1;
        while (opMenu <0 || opMenu >7) {
            System.out.println("====== MENU ======");
            System.out.println("[1] - Mostrar Produtos\n[2] - Mostar Sacola\n[3] - Inserir na Sacola\n[4] - Remover da Sacola\n[5] - Finalizar Pedido\n[0] - Sair\n[6] - DEBUG MODE");
            opMenu = sc.nextInt();
            if (opMenu <0 || opMenu >7) {
                Screen.clear();
                System.out.println("OPÇÂO INVALIDA!");
            }
        }
        sc.close();
        return opMenu;
        
    }
}


/*  Separar a Sacola e deixar como um método a parte
    - Sacola com produtos, adicionar, remover
    Menu bonitinho
    Produtos com preços
    - Total da compra
    Main fica responsável por conectar todos esses métodos, objetos e classes
*/