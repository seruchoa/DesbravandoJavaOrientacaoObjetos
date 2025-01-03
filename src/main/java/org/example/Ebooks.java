package org.example;

public class Ebooks extends Livros  {
    private String warterNark;

    public Ebooks (Autor autor){
        super (autor); // *Super Usado para delegar a responsabilidade da superclasse (classe Livro) que já tem esse comportamento
    }
    @Override
    public boolean aplicaDescontoDe (double porcentagem){
        if (porcentagem > 0.15) {
            return false;
        }
        double desconto = this.getValor() * porcentagem;
        this.setValor(this.getValor() - desconto);
          return  true;
    }
    public void setWarterNark(String waterMarl){
        this.warterNark = warterNark;
    }
    public String getWarterNark(){
        return warterNark;
    }





}
