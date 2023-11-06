import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<Tarefa> listaDeTarefas = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1: Adicionar tarefa");
            System.out.println("2: Remover tarefa");
            System.out.println("3: Exibir todas as tarefas");
            System.out.println("4: Sair");
            int escolha = teclado.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = teclado.next();
                    System.out.print("Data: ");
                    String data = teclado.next();
                    System.out.print("Descrição: ");
                    String descricao = teclado.next();
                    Tarefa tarefa = new Tarefa(titulo, data, descricao);
                    listaDeTarefas.add(tarefa);
                    break;
                case 2:
                    System.out.println("Tarefas disponíveis para remoção:");
                    for (int i = 0; i < listaDeTarefas.size(); i++) {
                        System.out.println(i + ". " + listaDeTarefas.get(i).titulo);
                    }
                    System.out.print("Digite o número da tarefa a ser removida: ");
                    int indice = teclado.nextInt();
                    if (indice >= 0 && indice < listaDeTarefas.size()) {
                        listaDeTarefas.remove(indice);
                    }
                    break;
                case 3:
                    System.out.println("Todas as tarefas na lista:");
                    for (Tarefa t : listaDeTarefas) {
                        System.out.println("Título: " + t.titulo);
                        System.out.println("Data: " + t.data);
                        System.out.println("Descrição: " + t.descricao);
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
