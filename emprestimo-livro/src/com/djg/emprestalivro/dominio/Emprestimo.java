package com.djg.emprestalivro.dominio;

public class Emprestimo {

    private int codigo;
    private Usuario usuario;
    private Livro livro;
    private String dataEmprestimo;
    private String dataDevolucao;

    //----------------------------------------------construtor
    public Emprestimo(Usuario usuario, Livro livro, String dataEmprestimo, String dataDevolucao){
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    //----------------------------------------------método
    public void imprimeDadosEmprestimo(){
        System.out.println("Codigo Emprestimo" + codigo +

               "\nNome usuario " +   this.getUsuario().getNomeCompleto()+
                "\nNome do Livro " + this.getLivro().getNome()+
                "\nNome da Emprestimo " + this.getDataEmprestimo()+
                "\nNome da Devolução " + this.getDataDevolucao());
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro (Livro livro) {
        this.livro = livro;
    }

    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
