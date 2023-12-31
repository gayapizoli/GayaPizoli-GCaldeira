import java.util.Scanner;

public class Exercicio01 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = teclado.nextInt();

        System.out.println("Digite outro número: ");
        int num2 = teclado.nextInt();

        System.out.println("Intervalo escolhido [ " + num1 + " , " + num2 + " ]");
        System.out.println("São primos: ");

        for (int i = num1; i <= num2; i++) {
            if (primo(i)) {
                System.out.print(i + " ");
            }
        }
        teclado.close();
    }

    public static boolean primo(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPrimeUpgrade(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isPrimeUltimate(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}