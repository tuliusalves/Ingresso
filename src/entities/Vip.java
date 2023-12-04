package entities;

public class Vip extends Ingresso{
    private double valorAdicional;
    private String localizacao;
    public Vip(){}

    public double getValorAdicional() {
        return (getValor()*0.10)+getValor();
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirLocal(){
        System.out.println("Localização: "+ getLocalizacao());
    }
}
