package ImplementandoInterface;

public class Quadrado extends FormaGeo {

    private double base;
    private double altura;

    public Quadrado(double base, double altura) {
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double area() {
        double resultado;
        resultado = this.base * this.altura;
        System.out.println("Resultado: " + resultado);
        return resultado;
    }
}
    
    

