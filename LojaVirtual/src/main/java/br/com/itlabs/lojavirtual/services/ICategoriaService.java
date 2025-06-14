package br.com.itlabs.lojavirtual.services;

import br.com.itlabs.lojavirtual.model.Categoria;

import java.util.ArrayList;

public interface ICategoriaService {
    //Este método recebe uma categoria só com o nome preenchido e vai inserir no banco.
    public Categoria inserirNovaCategoria(Categoria categoria);

    //Este médoto vai alterar a categoria existente e retornar-la se o update deu certo e null caso contrário.
    public Categoria alterarCategoria(Categoria categoria);

    //Este médoto vai recuperar todas as categorias sem filtro.
    public ArrayList<Categoria> recuperarTodasCategorias();

    //Este método vai recuperar todas as categorias por palavra chave.
    public ArrayList<Categoria> recuperarPorPalavraChave(String palavraChave);
}
