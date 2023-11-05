import java.util.Scanner;
import java.util.Random;

public class UsoDeArray {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random numAleatorio = new Random();

        int[] num = new int[10]; //capacidade do array

        for (int i = 0; i < num.length; i++) {
            num[i] = numAleatorio.nextInt(100) + 1;
        }

        System.out.println("Insira um número:");
        int numero = teclado.nextInt();
        boolean existe = false;

        for (int i = 0; i < num.length; i++) {
            if (num[i] == numero) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("O número está presente no array.");
        } else {
            System.out.println("O número não está presente no array.");
        }
    }
}
