package ImplementandoInterface;
public class Main {
    public static void main(String[] args) throws Exception {

        Quadrado quadrado = new Quadrado(5, 10);
        quadrado.area();
        Triangulo triangulo = new Triangulo(10, 20);
        triangulo.area();
        Circulo circulo = new Circulo(6);
        circulo.area();
    }
}
