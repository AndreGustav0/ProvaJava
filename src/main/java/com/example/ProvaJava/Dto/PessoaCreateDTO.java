package com.example.ProvaJava.Dto;

public class PessoaCreateDTO {
    private String nome;
    private int cpf;
    private Long trabalhoId;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPF() {
        return cpf;
    }

    public void setcpf(int cpf) {
        this.cpf = cpf;
    }

    public Long getTrabalhoId() {
        return trabalhoId;
    }

    public void setTrabalhoId(Long trabalhoId) {
        this.trabalhoId = trabalhoId;
    }
}
