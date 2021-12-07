package br.org.generation.lojagames.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_produto")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private int quantidade;
	
	@NotBlank(message = "O atributo titulo é Obrigatório!")
	@Size(min = 3,max = 100,message = "O titulo deve ter no minimo 3 e no maximo 20 caracteres")
	private String titulo;
	
	private String foto;
	
	@NotNull(message = "O atributo valor é Obrigatorio!")
	private float valor;
	
	
	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categorias categorias;


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public String getFoto() {
		return foto;
	}


	public void setFoto(String foto) {
		this.foto = foto;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public float getValor() {
		return valor;
	}


	public void setValor(float valor) {
		this.valor = valor;
	}


	public Categorias getCategorias() {
		return categorias;
	}


	public void setCategorias(Categorias categorias) {
		this.categorias = categorias;
	}


	

	

}