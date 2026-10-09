package aula07;

public class Estoque {
    static int qtd = 0;
    public static String prod[] = {
        "Arroz", "Feijão", "Macarrão", "Ovo", "Batata", "Banana", "Tomate", "Miojo", "Sucrilhos"
    };
    // Pra linkar o preço com o produto, vou usar o código que o prof criou de cotação de moedas(tem uns outros tbm)
    static double precoProd[] = {
        15.00, 10.00, 8.00, 20.00, 7.00, 12.00, 6.00, 20.00, 23.00
     };

    public static void imprimirProdutos(){
        //Screen.clear();
        System.out.println("====== PRODUTOS ======");    
        for(int i = 0; i < prod.length; i++){
            System.out.println(i + " - " + prod[i] + " - R$" + precoProd[i]);
        }


    }
}
