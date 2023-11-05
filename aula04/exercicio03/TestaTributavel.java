public class TestaTributavel {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        ContaCorrente contaCorrente = new ContaCorrente();
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        contaCorrente.depositar(1500);
        contaCorrente.sacar(200);
        gerenciador.adicionar(contaPoupanca);
        gerenciador.adicionar(contaCorrente);
        gerenciador.adicionar(seguroDeVida);

        System.out.println("Total de tributos: " + gerenciador.getTotalTributos());
    }
}