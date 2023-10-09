
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();

        System.out.println("Digite seu salário: ");
        double salario = teclado.nextDouble();

        if (idade >= 18 && salario > 2000.00) {
            System.out.println("Pode comprar um automóvel!!");
        } else {
            System.out.println("Vixi, ou você tem idade menor que 18 anos ou não tem a verba suficiente :/");
        }

        teclado.close();
    }
}