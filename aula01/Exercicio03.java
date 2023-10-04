import java.util.Scanner;
public class Exercicio03 {
    public static void main(String[]args){
        int numero1,numero2,numero3;
        Scanner teclado = new Scanner(System.in);
        System.out.println("\f Digite um número: ");
        numero1= teclado.nextInt();
        System.out.println("\f Digite outro número: ");
        numero2 = teclado.nextInt();
        System.out.println("\f Digite o terceiro número: ");
        numero3 = teclado.nextInt();
        double media = ((numero1+numero2+numero3)/3);
        System.out.println("A média dos valores é:"+media);


    }
}