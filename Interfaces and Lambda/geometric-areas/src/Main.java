
public class Main {

    public static void main(String[] args) {
        FormaGeometrica quadrado = new Quadrado(5);
        FormaGeometrica retangulo = new Retangulo(4, 6);
        FormaGeometrica circulo = new Circulo(3);

        System.out.printf("Área do quadrado: %.2f%n", quadrado.calcularArea());
        System.out.printf("Área do retângulo: %.2f%n", retangulo.calcularArea());
        System.out.printf("Área do círculo: %.2f%n", circulo.calcularArea());
    }
}
