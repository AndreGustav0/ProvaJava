package com.example.ProvaJava.Dto;

public class PessoaDTO {
    private Long id;
    private String nome;
    private int cpf;
    private String endereco;

    public PessoaDTO(Long id, String nome, int cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getcpf() {
        return cpf;
    }

    public void setcpf(int cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
