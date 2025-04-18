package com.example.ProvaJava.Controller;

import com.example.ProvaJava.Dto.TrabalhoCreateDTO;
import com.example.ProvaJava.Dto.TrabalhoDTO;
import com.example.ProvaJava.Service.TrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/trabalho")
public class TrabalhoController {

    @Autowired
    private TrabalhoService service;

    @PostMapping
    public ResponseEntity<TrabalhoDTO> criar(@RequestBody TrabalhoCreateDTO dto) {
        TrabalhoDTO trabalhoSalvo =  service.create(dto);

        return ResponseEntity.created(
                        UriComponentsBuilder
                                .newInstance()
                                .path("/trabalho/{id}")
                                .buildAndExpand(trabalhoSalvo.getId())
                                .toUri())
                .body(trabalhoSalvo);
    }

    @GetMapping
    public ResponseEntity<List<TrabalhoDTO>> listar() {
        List<TrabalhoDTO> trabalhoListar = service.listar();

        return ResponseEntity.ok(trabalhoListar);
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrabalhoDTO> buscar(@PathVariable Long id) {
        TrabalhoDTO trabalhoBuscar = service.buscar(id);

        return ResponseEntity.ok(trabalhoBuscar);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        service.deletar(id);

        return ResponseEntity.noContent().build();
    }
}
