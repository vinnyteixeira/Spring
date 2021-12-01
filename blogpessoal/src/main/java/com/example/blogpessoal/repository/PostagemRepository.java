package com.example.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.blogpessoal.postagem.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	
}
