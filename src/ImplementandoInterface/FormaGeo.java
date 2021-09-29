package ImplementandoInterface;

public abstract class FormaGeo implements IRotacionavel, IDesenhavel{

    public abstract double area();
    
    @Override
    public void desenhar() {
        System.out.println("Desenhando forma geométrica."); 
    }

    @Override
    public void rotacionar() {
        System.out.println("Rotacionando forma geométrica.");
    }  
}
