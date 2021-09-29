package ImplementandoInterface;

public class Triangulo extends FormaGeo {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        double resultado;
        resultado = (this.base * this.altura)/2;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
}
    

