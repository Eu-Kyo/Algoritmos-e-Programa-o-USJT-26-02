/*  Código que simula o funcionamento de um mercado, com base no código Sacola.java feito na aula 6. 
    Vou refazer ele bonitinho, separando em outras classes e métodos */

package aula07;
import java.util.Scanner;
import aula06.Screen;

public class Mercado {
    public static void main(String[] args) {
        Screen.clear();
        Scanner sc = new Scanner(System.in);
        int opMenu = imprimirMenu();

        while (opMenu > 0) {
            if(opMenu == 1){
                Estoque.imprimirProdutos();
                System.out.println("> ENTER para voltar.");
                sc.nextLine();   
            }
            if (opMenu == 2) {
                Sacola.imprimirSacola();
                System.out.println("> ENTER para voltar.");
                sc.nextLine();
            }
            if (opMenu == 3) {
                Sacola.addSacola();
                
            }
            // if (opMenu == 4) {
            //     removerSacola();
            // }
            // if (opMenu == 5) {
            //     finalizarCompra();
            // }
            /*if (opMenu == 6) {
                
            }*/
            if (opMenu == 7) {
                // DEBUG MODE (vou descobrir como fazer)
            }
            Screen.clear();
            opMenu = imprimirMenu();
        }
    }

    public static int imprimirMenu(){
        Screen.clear();
        Scanner sc = new Scanner(System.in);
        int menuOp = -1;
        
        while (menuOp < 0 || menuOp > 5) {
            System.out.println("====== MENU ======");
            System.out.println("[1] - Mostrar Produtos\n[2] - Mostar Sacola\n[3] - Inserir na Sacola\n[4] - Remover da Sacola\n[5] - Finalizar Pedido\n[0] - Sair\n[6] - DEBUG MODE\n");
            menuOp = sc.nextInt();
            if (menuOp < 0 || menuOp >7) {
                Screen.clear();
                System.out.println("OPÇÂO INVALIDA!\n");
            }
        }
        return menuOp;
    }
    
}
