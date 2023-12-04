package entities;

public class CamaroteInferior extends Vip{
    private String localizacao;

    public CamaroteInferior(){}

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirLocal(){
        imprimirValorAdicional();
        System.out.println("Localização: "+ getLocalizacao());
    }
}
