package org.example;

public class Livros {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livros(Autor autor){
         this.autor = autor;
    }
    public void mostrarDetalhe(){
     String mensagem = "Mostrando detalhes do livro";
     System.out.println(mensagem);
     System.out.println("Nome: "+nome);
     System.out.println("valor: "+valor);
     System.out.println("Descrição: "+descricao);
     System.out.println("ISBN: "+isbn);
     System.out.println(" --- ");
     if (this.temAutor() ){
         autor.mostrarDetalhes();
     } else {
         System.out.println(" --- ");
     }


 }
 public void setValor (double valor ){
     this.valor = valor;
 }
    public double getValor () {
        return this.valor;
 }
  public boolean temAutor(){
     return this.autor != null;
 }
  public void setNome (String nome){
        this.nome = nome;
  }
  public String getNome(){
        return this.nome;
  }
  public void setDescricao(String descricao){
        this.descricao = descricao;
  }
  public String getDescricao(){
        return this.descricao;
  }
  public void setIsbn(String isbn) {
        this.isbn = isbn;
  }
  public String getIsbn(){
        return this.isbn;
  }

  public void setAutor (Autor autor ){
        this.autor = autor;

  }
  public Autor  getAutor(){
        return autor;
  }


 public boolean aplicaDescontoDe(double porcentagem) {
     if (porcentagem > 0.3) {
         return false;
     }
         this.valor -= this.valor * porcentagem;
         return true;
     }
 }
