package com.example.blogpessoal.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blogpessoal.postagem.*;;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	public Optional<Tema> findByDescricao(String descricao);
    
    public List <Tema> findAllByDescricaoContainingIgnoreCase (String descricao);
    

}