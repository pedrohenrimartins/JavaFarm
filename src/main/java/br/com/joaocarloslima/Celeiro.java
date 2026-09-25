package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade;
    private int qtdBatatas;
    private int qtdCenouras;
    private int qtdMorangos;

    public void armazenarBatata(){
        qtdBatatas++;
    }

    public void armazenarCenoura(){
        qtdCenouras++;
    }

    public void armazenarMorango(){
        qtdMorangos++;
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

    public int getQtdBatatas() {
        return qtdBatatas;
    }

    public int getQtdCenouras() {
        return qtdCenouras;
    }

    public int getQtdMorangos() {
        return qtdMorangos;
    }


}
