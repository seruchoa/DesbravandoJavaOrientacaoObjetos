package org.example;

public class LivroFisico extends Livros {

    public LivroFisico(Autor autor){
        super(autor);
    }
    public double getTaxaImpressao( double valor){
          return this.getValor() * 0.05;
    }
    public boolean aplicarDescontoDe (double porcentagem ){
        if(porcentagem > 0.3) {
            return false;
        }
        double desconto = getValor() * porcentagem;
         setValor(getValor() - desconto);
         System.out.println("Aplicar desconto no livro fisico");
          return true;
    }


}
