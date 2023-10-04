import java.util.Scanner;
public class Exercicio04 {
    public static void main(String[] args) {
        double salarioMin = 1320.0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor do salário:");
        double salario = teclado.nextDouble();

        double valor = salario / salarioMin;

        System.out.println("O usuario ganha "  + " salários mínimos.");

        System.out.printf("O usuario ganha %.2f salários mínimos", valor);

        teclado.close();
    }
}

