package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {
    List<Terreno> terrenos;
    Celeiro celeiro;

    public Fazenda() {
        for(int i = 0; i < 13; i++){
            
            for (int j = 0; j < 13; j++){

                terrenos.add(new Terreno(i, j));

            }
        }
    }


  


}
