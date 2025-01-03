package org.example;

import java.awt.geom.Arc2D;

public class CalculadoraDeEstoque {
    public static void  main(String []args){
        //int contador = 0;
        double soma = 0;

//        while (contador < 35){
//            double valorLivro = 59.99;
//            //soma = soma + valorLivro;
//            soma += valorLivro;
//            contador ++;
//        }
        for (int contador = 0; contador < 35; contador ++){
            soma += 59.99;
        }

        System.out.println("O total do estoque é "+ soma);

        if (soma < 150){
            System.out.println("Seu estoque está muito baixo!");
        }else if(soma >= 2000){
            System.out.println("Seu estoque está muito alto!");
        }
        else {
            System.out.println("Seu estoque está ótimo!");
        }

    }
}
