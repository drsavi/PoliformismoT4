package ImplementandoInterface;

public class Circulo extends FormaGeo {

    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        double resultado;
        resultado = 2 * 3.14 * this.raio;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
}
