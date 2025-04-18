package com.example.ProvaJava.Service;

import com.example.ProvaJava.Dto.TrabalhoCreateDTO;
import com.example.ProvaJava.Dto.TrabalhoDTO;
import com.example.ProvaJava.Entity.Trabalho;
import com.example.ProvaJava.Mapper.TrabalhoMapper;
import com.example.ProvaJava.Repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository repository;

    public TrabalhoDTO create(TrabalhoCreateDTO dto) {
        Trabalho trabalho = new Trabalho(dto.getEndereco());
        trabalho = repository.save(trabalho);
        return TrabalhoMapper.paraDTO(trabalho);
    }

    public List<TrabalhoDTO> listar() {
        return repository.findAll().stream().map(TrabalhoMapper::paraDTO).toList();
    }

    public TrabalhoDTO buscar(Long id) {
        return repository.findById(id).map(TrabalhoMapper::paraDTO).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
