package entities;

public abstract class Ingresso {
    private double valor;

    public Ingresso(){}

    public double getValor() {
        return 100;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void imprimirValor(){
        System.out.println("O valor do ingresso R$:"+getValor());
    }

    public void imprimirValorAdicional() {
    }

    public void imprimirRelatorio() {
    }

    public void imprimirNormal() {
    }
}
