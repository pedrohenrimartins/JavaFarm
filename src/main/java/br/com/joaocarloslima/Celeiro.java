package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade = 20;
    private int qtdeBatatas = 2;
    private int qtdeCenouras = 2;
    private int qtdeMorangos = 2;

    public void armazenarBatata() throws Exception {
        if (getEspacoDisponivel() < 2) {
            throw new Exception("O celeiro está cheio!");
        }
        qtdeBatatas += 2;
    }

    public void armazenarCenoura() throws Exception {
        if (getEspacoDisponivel() < 2) {
            throw new Exception("O celeiro está cheio!");
        }
        qtdeCenouras += 2;
    }

    public void armazenarMorango() throws Exception {
        if (getEspacoDisponivel() < 2) {
            throw new Exception("O celeiro está cheio!");
        }
        qtdeMorangos += 2;
    }

    public void consumirBatata() throws Exception {
        if (qtdeBatatas <= 0) {
            throw new Exception("Não há batatas no celeiro!");
        }
        qtdeBatatas--;
    }

    public void consumirCenoura() throws Exception {
        if (qtdeCenouras <= 0) {
            throw new Exception("Não há cenouras no celeiro!");
        }
        qtdeCenouras--;
    }

    public void consumirMorango() throws Exception {
        if (qtdeMorangos <= 0) {
            throw new Exception("Não há morangos no celeiro!");
        }
        qtdeMorangos--;
    }

    public int getEspacoDisponivel(){
         return capacidade - (qtdeBatatas + qtdeMorangos + qtdeCenouras);
    }

    public double getOcupacao(){
        return (qtdeBatatas + qtdeMorangos + qtdeCenouras) / capacidade;
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
