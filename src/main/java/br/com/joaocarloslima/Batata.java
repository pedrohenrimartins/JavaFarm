package br.com.joaocarloslima;

public class Batata {

        private int tamanho = 1;
        private int tempoDeVida = 0;
        private int tempoDeCrescimento = 3;


        public void crescer(){
            tempoDeVida++;
            if(tempoDeVida == tempoDeCrescimento)tamanho++;
        }

        public boolean podeColher(){
            return tamanho== 4;
        }

        public String getImagem(){
            return "images/batata" +tamanho+";png";
        }

}
