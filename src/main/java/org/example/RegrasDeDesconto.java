package org.example;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        Livros livro = new Livros(autor);
        livro.setValor(59.90);
        System.out.println("Valor atual do livro "+ livro.getValor());

        if (!livro.aplicaDescontoDe(0.3)){
            System.out.println("O desconto no livro não pode ser maior que 30%");
        }else{
            System.out.println("O valor do livro com desconto "+ livro.getValor());
        }
        Ebooks ebook = new Ebooks(autor);
         ebook.setValor(29.90);

        if (!ebook.aplicaDescontoDe(0.15)){
            System.out.println("O desconto no ebook não pode ser maior que 15%");
        }else{
            System.out.println("O valor do ebook com desconto "+ ebook.getValor());
        }


    }
}
