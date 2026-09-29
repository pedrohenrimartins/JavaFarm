package br.com.joaocarloslima;

public class Morango {

        private int tamanho = 1;
        private int tempoDeVida = 0;
        private int tempoDeCrescimento = 3;


        public void crescer(){
            if(tamanho<=4){
            tempoDeVida++;
            
            if(tempoDeVida == tempoDeCrescimento){

                
                tamanho++;
                tempoDeVida= 0;
            }
            
        }


    }

    public boolean podeColher(){
        return tamanho== 4;
    }

    public String getImagem(){
        return "images/morango"+tamanho+".png";
    }
}
