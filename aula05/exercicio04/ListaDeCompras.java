import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) {
        ArrayList<Compra> listaDeCompras = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1: Adicionar itens");
            System.out.println("2: Remover item");
            System.out.println("3: Exibir a lista");
            System.out.println("4: Sair");
            int escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Título: ");
                    String nome = teclado.next();
                    System.out.print("Data: ");
                    String data = teclado.next();
                    System.out.print("Validade: ");
                    String validade = teclado.next();
                    Compra compra = new Compra(nome, data, validade);
                    ListaDeCompras.add(compra);
                    break;
                case 2:
                    System.out.println("Itens disponíveis para remoção:");
                    for (int i = 0; i < ListaDeCompras.size(); i++) {
                        System.out.println(i + ". " + ListaDeCompras.get(i).nome);
                    }
                    System.out.print("Digite o número do item a ser removido: ");
                    int indice = teclado.nextInt();
                    if (indice >= 0 && indice < ListaDeCompras.size()) {
                        ListaDeCompras.remove(indice);
                    }
                    break;
                case 3:
                    System.out.println("Todos os itens na lista:");
                    for (Compra t : ListaDeCompras) {
                        System.out.println("Nome: " + t.nome);
                        System.out.println("Data: " + t.data);
                        System.out.println("Validade: " + t.validade);
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    teclado.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
