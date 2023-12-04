package entities;

public class Vip extends Ingresso{
    private double valorAdicional;

    public Vip(){}

    public double getValorAdicional() {
        return (getValor()*0.10)+getValor();
    }

    public void imprimirValorAdicional(){
        System.out.println("O ingresso VIP com valor adicional de 10%. R$:"+getValorAdicional());
    }
}
