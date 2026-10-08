package aula05;
import java.util.Scanner;;
public class LacosDeRepeticao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int i = 0;
        for(i = 10; i>0; i--){
            System.out.println(i);
        }
        /*while (i<=9) {
            System.out.println("> Passo atual: " + i);
            i++;
        }*/

        String nome = scanner.next();
        System.out.println(nome.length());
        System.out.println("> Inicial: " + nome.charAt(0));
        scanner.close();    
    }
}
