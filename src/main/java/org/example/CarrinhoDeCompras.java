package org.example;

public class CarrinhoDeCompras {
    private double total;

    public void adicionar (Livros livro){
        System.out.println("Adicionado: "+ livro);
        livro.aplicaDescontoDe(0.5);
        total += livro.getValor();
    }
    public double getTotal(){
        return total;
    }
}
