/* Arrays e modularização - 01/10/26 */

package aula06;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Screen.clear();
        //int produtos[] = new int[1000];
        //int qnt = 0;
        //System.out.println(produtos[3]);
        Scanner sc = new Scanner(System.in);

        Conversa.oiGente();
        Conversa.bomDIa("Caio");
        Conversa.xingamento(sc.next());
    
    }


    static int calculadora(int a, int b){
        return a + b;   
    }
}

