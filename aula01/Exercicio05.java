import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        int horas, minutos, segundos;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a horas: ");

        horas = teclado.nextInt();

        System.out.println("Digite os minutos: ");
        minutos = teclado.nextInt();

        System.out.println("Digite os segundos: ");
        segundos = teclado.nextInt();

        if (horas >= 0 && horas <= 23 && minutos >= 0 && minutos <= 59 && segundos >= 0 && segundos <= 59) {

            int passouSegundos = horas * 3600 + minutos * 60 + segundos;
            int faltamSegundos = 86400 - passouSegundos;

            System.out.println("Segundos passados desde 0h00min00s: " + passouSegundos);
            System.out.println("Segundos faltando para meia-noite: " + faltamSegundos);
        } else {
            System.out.println("Entrada de tempo inválida.");
        }

        teclado.close();
    }
}