package br.org.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.lojagames.model.*;;

@Repository
public interface CategoriaRepository extends JpaRepository<Categorias, Long>{
    
    public List <Categorias> findAllByDescricaoContainingIgnoreCase (String descricao);

}