package org.example;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driver Development");
        fisico.setValor(59.90);

        Ebooks ebook = new Ebooks(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionar(fisico);
        carrinho.adicionar(ebook);

        System.out.println("Total "+ carrinho.getTotal());
    }
}
