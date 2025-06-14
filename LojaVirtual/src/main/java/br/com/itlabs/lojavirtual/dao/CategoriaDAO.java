package br.com.itlabs.lojavirtual.dao;

import br.com.itlabs.lojavirtual.model.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

public interface CategoriaDAO extends CrudRepository<Categoria, Integer> {

    //Consultas customizadas

    //1 - categoria por palavra chave
    public ArrayList<Categoria> findByNomeContaining(String palavra);


}
