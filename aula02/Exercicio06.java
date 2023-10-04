import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um frase/palavra");
        String input = teclado.nextLine();

        String aoContrario = sistema(input);
        System.out.println("A string ao contrário é: " + aoContrario);

        teclado.close();
    }

    public static String sistema(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        return stringBuilder.reverse().toString();
    }
}
