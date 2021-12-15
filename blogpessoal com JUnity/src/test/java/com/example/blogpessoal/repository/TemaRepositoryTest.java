package com.example.blogpessoal.repository;



import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import com.example.blogpessoal.postagem.Tema;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TemaRepositoryTest {
    
	@Autowired
	private TemaRepository temaRepository;
	
	@BeforeAll
	void start(){

		temaRepository.save(new Tema(0L, "TemaDescricao1"));
		temaRepository.save(new Tema(0L, "TemaDescricao2"));
		temaRepository.save(new Tema(0L, "TemaDescricao3"));
		
		

	}
	
	@Test
	@DisplayName("Retorna 1 descricao")
	public void deveRetornarUmaDescricao() {

		Optional<Tema> descricao = temaRepository.findByDescricao("TemaDescricao1");
		assertTrue(descricao.get().getDescricao().equals("TemaDescricao1"));
	}
	
	@Test
	@DisplayName("Retorna 3 descrições")
	public void deveRetornarTresDescricao() {

		List<Tema> listaDeDescricao = temaRepository.findAllByDescricaoContainingIgnoreCase("Tema");
		assertEquals(3, listaDeDescricao.size());
		assertTrue(listaDeDescricao.get(0).getDescricao().equals("TemaDescricao1"));
		assertTrue(listaDeDescricao.get(1).getDescricao().equals("TemaDescricao2"));
		assertTrue(listaDeDescricao.get(2).getDescricao().equals("TemaDescricao3"));
		
	}
}
