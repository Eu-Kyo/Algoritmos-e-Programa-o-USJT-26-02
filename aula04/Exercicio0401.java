package aula04;
import  java.util.Scanner;

// Reajuste salarial de funcionários

public class Exercicio0401 {
    public static void main(String[]args){
        double salario = 0;
        double salarioReaj = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu salário: ");
        salario = scanner.nextLong();
        
        if (salario <= 2000) {
            salarioReaj = (salario + salario * 0.5);
            System.out.println("Seu salário reajustado é: " + salarioReaj + ", reajuste de 50%");
        }
        if (salario > 2000 && salario < 5000) {
            salarioReaj = (salario + salario * 0.2);
            System.out.println("Seu salário reajustado é: " + salarioReaj + ", reajuste de 20%");
        }
        if(salario>5000){
            salarioReaj = (salario + salario * 0.1);
            System.out.println("Seu salário reajustado é: " + salarioReaj + ", reajuste de 10%");
        }        

    }
}
