package org.example;

public class Autor {
    private String nome;
    private String email;
    private String cpf;

    public void mostrarDetalhes (){
            String mensagem = "Mostrando detalhes do autor";
            System.out.println(mensagem);
            System.out.println("Autor: "+ nome);
            System.out.println("E-mail do autor: "+ email);
            System.out.println("CPF do autor: "+ cpf);
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public String getCpf() {
        return cpf;
    }
}
