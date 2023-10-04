import java.util.Scanner;

public class Exercicio05 {

    //codigo que recebe um texto e divide no meio

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um frase/palavra");
        String input = teclado.nextLine();

        String halfInput = input.substring(0, (input.length() / 2));


        if (input.length() % 2 == 0) {
            System.out.println("Metade do texto: " + halfInput);
        } else {
            System.out.println("não pode ser dividido");
        }

        teclado.close();
    }
}