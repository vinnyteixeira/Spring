package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persistenciaAtencaoAosDetalhes")
public class HelloController {

	@GetMapping
	public String helloShow() {
		return "Objetivo de aprendizagem da semana<br /> me aprimorar em spring";
	}
}
