/*  Código que simula o funcionamento de um mercado, com base no código Sacola.java feito na aula 6. 
    Vou refazer ele bonitinho, separando em outras classes e métodos */
package aula07;
import java.util.Scanner;

import aula06.Screen;

public class Sacola {
    static int sacola[] = new int[1000];
    
    public static void imprimirSacola(){
        Screen.clear();
        System.out.println("====== SACOLA ======");
        if (Estoque.qtd == 0) {
            System.out.println("> A sacola está vazia!\n");
        }
        for(int i = 0; i < Estoque.qtd; i ++){
            int codProd = sacola[i];
            System.out.println(i + ". Código: " + codProd + " - " + Estoque.prod[codProd]);

        }
    }

    public static void addSacola(){
        Scanner sc = new Scanner(System.in);
        Estoque.imprimirProdutos();
        System.out.println("\n> Qual produto deseja adicionar na sacola?");
        int codProd = sc.nextInt();
        /* Pra acessar uma variável estática de outra classe, eu posso simplesmente chamar essa classe e identificar a variável(Estoque.prod.length) */
        while (codProd < 0 || codProd > Estoque.prod.length - 1) { 
            System.out.println("> Código invalido!\n>Digite outro código:");
            codProd = sc.nextInt();
        }
        sacola[Estoque.qtd] = codProd;
        Estoque.qtd++; 
        //addSacola();
    }
}
