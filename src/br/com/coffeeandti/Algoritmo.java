package br.com.coffeeandti;

public class Algoritmo {

    public static void  main(String[] args){

        int[] valores = {10,15,20,17,7,3,90,600,-1,-10,35,93,70};
        double menorValor = Double.POSITIVE_INFINITY;

        for(int i = 0; i < valores.length; i++){
            if(valores[i] < menorValor){
                menorValor = valores[i];
            }
        }
        System.out.println("Menor valor = " + menorValor);
    }

}
