package com.example.ProvaJava.Service;

import com.example.ProvaJava.Dto.PessoaCreateDTO;
import com.example.ProvaJava.Dto.PessoaDTO;
import com.example.ProvaJava.Entity.Pessoa;
import com.example.ProvaJava.Entity.Trabalho;
import com.example.ProvaJava.Mapper.PessoaMapper;
import com.example.ProvaJava.Repository.PessoaRepository;
import com.example.ProvaJava.Repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    public PessoaDTO criar(PessoaCreateDTO dto) {
        Trabalho trabalho = trabalhoRepository.findById(dto.getTrabalhoId()).orElseThrow();
        Pessoa pessoa = new Pessoa(dto.getNome(), dto.getCPF(), trabalho);
        pessoa = pessoaRepository.save(pessoa);
        return PessoaMapper.paraDTO(pessoa);
    }

    public List<PessoaDTO> listar() {
        return pessoaRepository.findAll().stream().map(PessoaMapper::paraDTO).toList();
    }

    public PessoaDTO buscar(Long id) {
        return pessoaRepository.findById(id).map(PessoaMapper::paraDTO).orElse(null);
    }

    public void deletar(Long id) {
        pessoaRepository.deleteById(id);
    }
}
