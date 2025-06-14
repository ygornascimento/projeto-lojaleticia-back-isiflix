package br.com.itlabs.lojavirtual.controller;

import br.com.itlabs.lojavirtual.model.Categoria;
import br.com.itlabs.lojavirtual.services.ICategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class CategoriaController {
    @Autowired
    private ICategoriaService categoriaService;

    @GetMapping("/categoria")
    public ResponseEntity<ArrayList<Categoria>> listarTodas() {
        return ResponseEntity.ok().body(categoriaService.recuperarTodasCategorias());
    }

    @GetMapping("/categoria/search")
    public ResponseEntity<ArrayList<Categoria>> recuperarPorPalavraChave(@RequestParam("key") String palavraChave) {
        if (palavraChave != null) {
            return ResponseEntity.ok().body(categoriaService.recuperarPorPalavraChave(palavraChave));
        }
        return ResponseEntity.badRequest().build();
    }

    @PostMapping("/categoria")
    public ResponseEntity<Categoria> adicionarNova(@RequestBody Categoria categoria) {
        Categoria resultado = categoriaService.inserirNovaCategoria(categoria);
        if (resultado != null) {
            return ResponseEntity.status(201).body(resultado);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/categoria")
    public ResponseEntity<Categoria> alterarDados(@RequestBody Categoria categoria) {
        Categoria resultado = categoriaService.alterarCategoria(categoria);
        if (resultado != null) {
            return ResponseEntity.ok(resultado);
        }
        return ResponseEntity.badRequest().build();
    }
}
