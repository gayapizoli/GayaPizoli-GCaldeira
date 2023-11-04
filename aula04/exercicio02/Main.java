import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FormaGeometrica> formas = new ArrayList<>();
        formas.add(new Retangulo(5, 4));
        formas.add(new Circulo(3));
        formas.add(new Triangulo(6, 8));
        formas.add(new Quadrado(5));
        formas.add(new Losango(6, 8));

        for (FormaGeometrica forma : formas) {
            System.out.println("Área do " + forma + ":" + forma.calcularArea());
        }
    }
}