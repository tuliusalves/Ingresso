package entities;

public class Ingresso {
    private double valor;

    public Ingresso(){}

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimirValor(){
        System.out.println("O valor do ingresso R$:"+getValor());
    }
}
