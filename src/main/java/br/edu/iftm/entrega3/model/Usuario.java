package br.edu.iftm.entrega3.model;

public class Usuario {

    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    // private String endereco;
    // private Integer telefone;
    // private String dataNasc;
    // private String sexo;
    // private String senha;

    public Usuario() {
    }

    public Usuario(Integer id, String nome, String cpf, String email){
    // , String endereco, Integer telefone, String dataNasc, String sexo, String senha) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        // this.endereco = endereco;
        // this.telefone = telefone;
        // this.dataNasc = dataNasc;
        // this.sexo = sexo;
        // this.senha = senha;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // public String getEndereco() {
    //     return this.endereco;
    // }

    // public void setEndereco(String endereco) {
    //     this.endereco = endereco;
    // }

    // public Integer getTelefone() {
    //     return this.telefone;
    // }

    // public void setTelefone(Integer telefone) {
    //     this.telefone = telefone;
    // }

    // public String getDataNasc() {
    //     return this.dataNasc;
    // }

    // public void setDataNasc(String dataNasc) {
    //     this.dataNasc = dataNasc;
    // }

    // public String getSexo() {
    //     return this.sexo;
    // }

    // public void setSexo(String sexo) {
    //     this.sexo = sexo;
    // }

    // public String getSenha() {
    //     return this.senha;
    // }

    // public void setSenha(String senha) {
    //     this.senha = senha;
    // }

}
