package org.example;

public class CadastroDeLivros {
    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Sérgio");
        autor.setEmail("autor@email.com");
        autor.setCpf("888.888.888-88");

        Livros livros = new LivroFisico(autor);
        livros.setNome("Pratica java 8");
        livros.setValor(59.99);
        livros.aplicaDescontoDe(0.1);
        livros.setDescricao("Novos recursos da linguagem");
        livros.setIsbn("9999934-445454-54543");
        livros.setAutor(autor);

        livros.mostrarDetalhe();

    }
}
