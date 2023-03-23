package br.com.franquiaacai;

public class Acai {
    public int tamanho;
    public double valor;
    public  boolean possuiAcrescimo;

    public Acai(int tamanho, boolean possuiAcrescimo) {
        this.tamanho = tamanho;
        this.possuiAcrescimo = possuiAcrescimo;
        this.valor = calculaValorAcai();
    }



    public double calculaValorAcai(){
        if(tamanho == 300){
            valor = 8.00;
        }
        else if(tamanho == 500){
            valor = 10.00;
        } else if (tamanho == 700) {
            valor = 12.00;
        }
        if(possuiAcrescimo){
            valor += 2.00;
        }
        return valor;

    }

    public double getValor(){
        return valor;
    }



}
