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

    public void plantarBatata(int x, int y) throws Exception {
        if (!getTerreno(x, y).estaOcupado()) {
            celeiro.consumirBatata();
            getTerreno(x, y).plantar(new Batata());
        }
    }

    public void plantarCenoura(int x, int y) throws Exception {
        if (!getTerreno(x, y).estaOcupado()) {
            celeiro.consumirCenoura();
            getTerreno(x, y).plantar(new Cenoura());
        }
    }

    public void plantarMorango(int x, int y) throws Exception {
        if (!getTerreno(x, y).estaOcupado()) {
            celeiro.consumirMorango();
            getTerreno(x, y).plantar(new Morango());
        }
    }

    public void colher(int x, int y) throws Exception {
        getTerreno(x, y).colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }

    public Terreno getTerreno(int x, int y) {
        return terrenos.get((x * 13 + y));
    }

}
