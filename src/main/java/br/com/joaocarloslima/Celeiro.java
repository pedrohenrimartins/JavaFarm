package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade = 20;
    private int qtdBatatas = 2;
    private int qtdCenouras = 2;
    private int qtdMorangos = 2;

    public void armazenarBatata(){
        qtdBatatas+=2;
    }

    public void armazenarCenoura(){
        qtdCenouras+=2;
    }

    public void armazenarMorango(){
        qtdMorangos+=2;
    }

    public void consumirBatata(){
        qtdBatatas--;
    }

    public void consumirCenoura(){
        qtdCenouras--;
    }

    public void consumirMorango(){
        qtdMorangos--;
    }

    public int getEspacoDisponivel(){
         return capacidade - (qtdBatatas + qtdMorangos + qtdCenouras);
    }

    public int getOcupacao(){
        return ((qtdBatatas + qtdMorangos + qtdCenouras) / capacidade) * 100;
    }


    public boolean celeiroCheio(){
        return (qtdCenouras + qtdBatatas + qtdMorangos) >= capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdBatatas;
    }

    public int getQtdeCenouras() {
        return qtdCenouras;
    }

    public int getQtdeMorangos() {
        return qtdMorangos;
    }


}
