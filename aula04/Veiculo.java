
abstract class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract double calcularCustoViagem(int distancia);
}

class Carro extends Veiculo {
    public Carro(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }


    public double calcularCustoViagem(int distancia) {
        // Custo de R$0.20/km
        return distancia * 0.20;
    }
}

class Moto extends Veiculo {
    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }


    public double calcularCustoViagem(int distancia) {
        // Custo de R$0.15/km
        return distancia * 0.15;
    }
}



