import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("\f Selecione uma opção: \n 1. Gestante \n 2. Idosa \n 3. Pessoa com Deficiência (PCD) \n 4. Nenhuma das alternativas");

        int escolha = teclado.nextInt();
        
        if(escolha == 1 ||escolha == 2 ||escolha == 3 ||escolha == 4) {
                System.out.println("Você tem direito à fila prioritária.");
                
            }else{
                System.out.println("Opção inválida.");
        }

        teclado.close();
    }
}