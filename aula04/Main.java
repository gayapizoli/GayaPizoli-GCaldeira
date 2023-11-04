import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a marca do veículo: ");
        String marca = scanner.nextLine();

        System.out.print("Informe o modelo do veículo: ");
        String modelo = scanner.nextLine();

        System.out.print("Informe o ano do veículo: ");
        int ano = scanner.nextInt();

        System.out.print("Informe a distância da viagem em quilômetros: ");
        int distancia = scanner.nextInt();

        Veiculo carro = new Carro(marca, modelo, ano);
        Veiculo moto = new Moto(marca, modelo, ano);

        double custoCarro = carro.calcularCustoViagem(distancia);
        double custoMoto = moto.calcularCustoViagem(distancia);

        System.out.println("Custo da viagem de Carro: R$" + custoCarro);
        System.out.println("Custo da viagem de Moto: R$" + custoMoto);

        scanner.close();
    }
}
