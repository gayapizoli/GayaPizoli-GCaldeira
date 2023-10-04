import java.util.Scanner;
public class Exercicio02 {
    public static void main(String[]args){
        int numero1,numero2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\f Digite um número: ");
        numero1 = teclado.nextInt();
        System.out.println("\f Digite outro número: ");
        numero2 = teclado.nextInt();
        System.out.println("\nO primeiro numero é:"+numero1+" e o segundo numero é:"+numero2);

    }
}