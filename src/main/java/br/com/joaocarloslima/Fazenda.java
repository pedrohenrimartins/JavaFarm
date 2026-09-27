package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    List<Terreno> terrenos;
    Celeiro celeiro;

    public Fazenda() {

        terrenos = new ArrayList<>();
        celeiro = new Celeiro();
        
        for (int i = 0; i < 13; i++) {

            for (int j = 0; j < 13; j++) {

                terrenos.add(new Terreno(i, j));

            }
        }
    }

    public void plantarBatata(int x, int y) {

        if (celeiro.getQtdeBatatas() > 0 && !getTerreno(x, y).estaOcupado()) {
            Batata batata = new Batata();
            getTerreno(x, y).plantar(batata);
            terrenos.add(new Terreno(x, y));

            celeiro.consumirBatata();
        }

    }

    public void plantarCenoura(int x, int y) {

        if (celeiro.getQtdeCenouras() > 0 && !getTerreno(x, y).estaOcupado()) {
            Cenoura cenoura = new Cenoura();
            getTerreno(x, y).plantar(cenoura);
            terrenos.add(new Terreno(x, y));

            celeiro.consumirCenoura();
        }

    }

    public void plantarMorango(int x, int y) {

        if (celeiro.getQtdeMorangos() > 0 && !getTerreno(x, y).estaOcupado()) {
            Morango morango = new Morango();
            getTerreno(x, y).plantar(morango);
            terrenos.add(new Terreno(x, y));

            celeiro.consumirMorango();
        }

    }

    public void colher(int x, int y) {
        getTerreno(x, y).colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public Terreno getTerreno(int x, int y) {
        return terrenos.get((x * 13 + y));
    }

}
