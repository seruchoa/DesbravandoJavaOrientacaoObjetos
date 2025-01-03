package org.example;

public class LivroFisico extends Livros {

    public LivroFisico(Autor autor){
        super(autor);
    }
    public double getTaxaImpressao( double valor){
          return this.getValor() * 0.05;
    }


}
