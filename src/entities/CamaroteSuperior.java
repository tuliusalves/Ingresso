package entities;

public class CamaroteSuperior extends Vip{
    private double valorCamSuperior;

    public CamaroteSuperior(){}

    public double getValorCamSuperior() {
        return (getValorAdicional()*0.20)+ getValorAdicional();
    }

    public void imprimirRelatorio(){
        imprimirValor();
        System.out.println("O ingresso com adicional do camarote Superior R$:"
                +getValorCamSuperior());
    }
}
