import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\f Digite seu nome: ");
        nome = teclado.nextLine();
        System.out.println("\n Olá " + nome + "!");

    }
}