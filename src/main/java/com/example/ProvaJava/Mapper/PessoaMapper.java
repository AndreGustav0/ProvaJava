package com.example.ProvaJava.Mapper;

import com.example.ProvaJava.Dto.PessoaDTO;
import com.example.ProvaJava.Entity.Pessoa;

public class PessoaMapper {
    public static PessoaDTO paraDTO (Pessoa pessoa){
        return new PessoaDTO(
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getCpf(),
                pessoa.getTrabalho().getEndereco()
        );
    }
}
