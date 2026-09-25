package br.com.joaocarloslima;

import java.util.ArrayList;

public class Terreno {

    Batata batata;
    Cenoura cenoura;
    Morango morango;
    int x;
    int y;

    public Terreno(int x, int y){
        x = this.x;
        y = this.y;
    }

    public void plantar(Batata batata){
        this.batata = batata;
    }
    public void plantar(Cenoura cenoura){
        this.cenoura = cenoura;
    }
    public void plantar(Morango morango){
        this.morango = morango;
    }

    public boolean estaOcupado(){
        return (getBatata() != null || getCenoura()!= null || getMorango()!= null);

    }

    public void colher(Celeiro celeiro){
        if(getBatata() != null){
         celeiro.armazenarBatata();
         batata = null;
        }
        if(getCenoura() != null){
            celeiro.armazenarCenoura();
            cenoura = null;
        }
        if(getMorango() != null){
            celeiro.armazenarMorango();
            morango = null;
        }

    }


    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
