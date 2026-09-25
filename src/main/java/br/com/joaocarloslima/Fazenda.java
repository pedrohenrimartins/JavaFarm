package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    List<ArrayList<Terreno>> terrenos;
    Celeiro celeiro;

    public Fazenda(Celeiro celeiro) {
        this.celeiro = celeiro;

        for(int i = 0; i < 13; i++){
            for (int j = 0; j < 13; j++){

            }
        }
    }

    public void plantarBatata(int x, int y){
        if(celeiro.getQtdeBatatas() > 0 && !terrenos.get(x).get(y).estaOcupado()){
            Batata batata = new Batata();
            terrenos.get(x).get(y).plantar(batata);

            celeiro.consumirBatata();
        }

    }

    public void plantarCenoura(int x, int y){
        if(celeiro.getQtdeCenouras() > 0 && !terrenos.get(x).get(y).estaOcupado()){
            Cenoura cenoura = new Cenoura();
            terrenos.get(x).get(y).plantar(cenoura);

            celeiro.consumirCenoura();
        }

    }

    public void plantarMorango(int x, int y){
        if(celeiro.getQtdeMorangos() > 0 && !terrenos.get(x).get(y).estaOcupado()){
            Morango morango = new Morango();
            terrenos.get(x).get(y).plantar(morango);

            celeiro.consumirMorango();
        }

    }

    public void colher(int x, int y){
        terrenos.get(x).get(y).colher(celeiro);
    }

    public Terreno getTerreno(int x, int y){
        return terrenos.get(x).get(y);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }


}
