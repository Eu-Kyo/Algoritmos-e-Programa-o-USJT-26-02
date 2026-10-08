package aula05;
import java.util.Scanner;;
public class DesafioJogoPalitos {
    public static void main(String[] args) {
        int qtdPlayer = 3, qtdCOMP = 3, qtdPMao = 0, qtdCOMPMao = 0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("> Olá! Boas vindas ao Jogo dos Palitinhos!\n");
        System.out.println("========== REGRAS ==========\n 1. Cada jogador possui 3 palitos\n 2. O jogador deve escolher quantos palitos esconder na mão (0 - 3).\n 3. O jogador 1 faz um palpite sobre a soma total dos palitos. \n 4. Os valores são revelados no final e a soma é calculada.\n");
        System.out.print("> Basicamente é isso, boa sorte!");

        while (qtdPlayer > 0 && qtdCOMP > 0) {
            System.out.println("===============");
            System.out.println("\n> Jogador tem "+qtdCOMP+ " palitos!");
            System.out.println("> O Computador tem "+ qtdCOMP + " palitos!\n");

            System.out.println("> Quantos palitos esconder?\n");
            qtdPMao = entrada.nextInt();

            // Escolha do PC 
            qtdCOMPMao = ((int)(Math.random()*100)) % (qtdCOMP + 1);
            
            // Chute do Jogador
            System.out.println("> Qual seu chute? ");
            int chuteP = entrada.nextInt();
            int chuteCOMP = qtdCOMP + ((int)(Math.random()*100)) % (qtdCOMP+1);
            
            System.out.println("\n> Chute do Jogador: "+ chuteP);
            System.out.println("> Computador escondeu "+qtdCOMPMao +" Palitos!");
            System.out.println("> Chute do Computador: "+ chuteCOMP+"\n");
            
            if(qtdCOMPMao+qtdPMao == chuteP){
                System.out.println("> Jogador acertou!");
                qtdPMao--;
            } else{
                if (qtdCOMPMao+qtdPMao == chuteCOMP){
                    System.out.println("> Computador acertou!");
                    qtdCOMP--;                    
                }else{
                    System.out.println("> Ninguèm acertou!");
                }
            }
            entrada.close();

        }
        System.out.println("> Fim do jogo!");

    }
}
