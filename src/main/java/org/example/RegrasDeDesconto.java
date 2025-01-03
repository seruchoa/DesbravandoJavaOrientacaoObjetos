package org.example;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Livros livro = new Livros();
        livro.setValor(59.90);
        System.out.println("Valor atual do livro "+ livro.getValor());

        if (!livro.aplicaDescontoDe(0.3)){
            System.out.println("O valor do desconto não pode ser maior que 30%");
        }else{
            System.out.println("O valor com desconto "+ livro.getValor());
        }
    }
}
