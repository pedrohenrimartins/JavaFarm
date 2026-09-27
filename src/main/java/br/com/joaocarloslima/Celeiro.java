package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade = 20;
    private int qtdeBatatas = 2;
    private int qtdeCenouras = 2;
    private int qtdeMorangos = 2;

    public void armazenarBatata(){
        qtdeBatatas+=2;
    }

    public void armazenarCenoura(){
        qtdeCenouras+=2;
    }

    public void armazenarMorango(){
        qtdeMorangos+=2;
    }

    public void consumirBatata(){
        qtdeBatatas--;
    }

    public void consumirCenoura(){
        qtdeCenouras--;
    }

    public void consumirMorango(){
        qtdeMorangos--;
    }

    public int getEspacoDisponivel(){
         return capacidade - (qtdeBatatas + qtdeMorangos + qtdeCenouras);
    }

    public int getOcupacao(){
        return ((qtdeBatatas + qtdeMorangos + qtdeCenouras) / capacidade) * 100;
    }


    public boolean celeiroCheio(){
        return (qtdeCenouras + qtdeBatatas + qtdeMorangos) >= capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }


}
