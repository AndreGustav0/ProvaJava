package com.example.ProvaJava.Mapper;

import com.example.ProvaJava.Dto.TrabalhoDTO;
import com.example.ProvaJava.Entity.Trabalho;

public class TrabalhoMapper {
    public static TrabalhoDTO paraDTO (Trabalho trabalho){
        return new TrabalhoDTO(
                trabalho.getId(),
                trabalho.getEndereco()
        );
    }
}
