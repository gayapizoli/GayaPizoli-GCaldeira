import java.util.Scanner;

public class Exercicio07 {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i = 0;

        while (i <= 5) {
            System.out.println("Digite um número");
            double value = teclado.nextDouble();
            if (value < 300000)
                System.out.println("UM POUCO MAIS!");
            else
                System.out.println("UM POUCO MENOS!");
            i++;
        }

        teclado.close();
    }
}