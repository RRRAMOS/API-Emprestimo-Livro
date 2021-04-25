package com.djg.emprestalivro.dominio;

    //----------------------------------------------Característica do objeto
    public class Usuario {
    private int codigoUsuario;
    private String nomeCompleto;
    private String dataNascimento;
    private String endereco;

      //----------------------------------------------construtor
    public Usuario(String nomeCompleto, String dataNascimento, String endereco) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    public int getCodigoUsuario() {
        return codigoUsuario;
    }

    public void setCodigoUsuario(int codigoUsuario) {
        this.codigoUsuario = codigoUsuario;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    //----------------------------------------------Criação método imprimeUsuario()
    public void imprimirDadosUsuario(){
        System.out.println("Nome: " + this.nomeCompleto+
        "\n Data de Nascimento: " + this.dataNascimento+
       "\n Endereço:" + this.endereco
            );

    }
}




