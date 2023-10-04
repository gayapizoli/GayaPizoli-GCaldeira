import java.util.Scanner;

//exercicio para o usuario informar o tipo de calculo a ser realizado
public class Exercicio04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\fDigite um valor");
        double valor1 = teclado.nextDouble();
        System.out.println("\fDigite um valor");
        double valor2 = teclado.nextDouble();

        System.out.println("\fEscolha a operacao a ser realizada:" +
                "\nadicao = digite 1.\nsubtracao = digite 2." +
                "\nmultiplicacao = digite 3.\ndivisão = digite 4.\nSAIR DO CODIGO = 9");
        int operacao = teclado.nextInt();
        if (operacao == 1) {
            System.out.println("O resultado é: " + (valor1 + valor2));
        }
        if (operacao == 2) {
            System.out.println("O resultado é: " + (valor1 - valor2));
        }
        if (operacao == 3) {
            System.out.println("O resultado é: " + (valor1 * valor2));
        }
        if (operacao == 4) {
            System.out.println("O resultado é: " + (valor1 / valor2));
        }


    }

}