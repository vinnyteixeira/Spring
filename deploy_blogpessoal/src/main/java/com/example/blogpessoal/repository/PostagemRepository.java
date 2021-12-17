package com.example.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blogpessoal.postagem.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List <Postagem> findAllByTituloContainingIgnoreCase(String Titulo);
	
	
}
