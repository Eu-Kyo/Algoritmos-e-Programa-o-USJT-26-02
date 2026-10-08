package aula04;
import java.util.Scanner;

public class Exercicio0402 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double imc, peso, altura;
        System.out.println("Boas vindas! Digite seu peso e altura para calcular seu IMC (Indice de Massa Corporal):"); System.out.println();
        System.out.println("Digite seu peso: ");
        peso = entrada.nextDouble(); System.out.println();
        System.out.println("Agora digite a sua altura (m): ");
        altura = entrada.nextDouble(); System.out.println();

        imc = peso / (altura * altura);
        System.out.println("Seu IMC é: "+imc); System.out.println(); System.out.println("");

        if(imc<=18.5){
            System.out.println("Magro.");
        } else{
            if (imc<=25){
                System.out.println("Padrão.");
            } else{
                if(imc<=30){
                    System.out.println("Sobrepeso.");
                } else {
                    System.out.println("Obeso.");
                }
            }
        }
        entrada.close();
    }
}
