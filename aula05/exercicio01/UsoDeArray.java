import java.util.Scanner;

public class UsoDeArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double[] num = new double[5]; //capacidade do array

        for(int i = 0 ; i < num.length ; i++){
            System.out.println("Digite um número: ");
            num[i] = teclado.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < num.length; i++) {
            soma += num[i];
        }

        double media = soma / num.length;

        System.out.println("Números digitados:");
        for (int i = 0; i < num.length; i++) {
            System.out.println("Número " + (i + 1) + ": " + num[i]);
        }
        System.out.println("Soma dos números digitados: " + soma);
        System.out.println("Média dos números digitados: " + media);
    }
}
