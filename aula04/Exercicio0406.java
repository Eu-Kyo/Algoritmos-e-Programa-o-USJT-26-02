package aula04;
import java.util.Scanner;

// Sistema de validação de senha com condicionais.

public class Exercicio0406 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        

        System.out.println("> Crie uma senha com: ");
        System.out.println(" * Pelo menos 8 caracteres.\n * Pelo menos um número\n * Pelo menos uma letra maiúscula.");
        // Condicionais:
        while (true) {
            //boolean cond1, cond2, cond3;
            System.out.print("> Digite a senha: ");
            String senha = input.nextLine();

            if (senha.length()<8) {
                System.out.println("ERRO: A senha deve ter, pelo menos, 8 caracteres!");
            }
            else{
                if (!senha.matches(".*\\d.*")) {
                    System.out.println("ERRO: A senha deve ter, pelo menos, 1 número!");
                }
                else{
                    for (char c : senha.toCharArray()){
                        boolean isUpper = Character.isUpperCase(c);

                        if (isUpper == false) {
                            System.out.println("ERRO: A senha deve ter, pelo menos, uma letra maíuscula!");
                            break;
                        }
                        else{
                            System.out.println("> Senha válida!");
                        }    
                    }
                }
            }
            input.close();
        }
    }
}

// eu nao consegui deixar melhor que isso, vou ver com o professor depois como melhorar