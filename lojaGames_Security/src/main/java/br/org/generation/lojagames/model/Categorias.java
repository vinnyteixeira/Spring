package br.org.generation.lojagames.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "tb_categorias")
public class Categorias{
	    
	    @Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
	    
	    @NotBlank(message = "O atributo categoria é obrigatório e não pode conter espaços em branco")
	    @Size(min = 3, max = 10, message = "A categoria deve ter no minimo 3 e no maximo 10 caracteres")
	    private String Nome_categoria;
	    
	    @NotBlank(message = "O atributo descrição é Obrigatório!")
		@Size(min = 3,max = 50,message = "A descrição deve ter no minimo 5 e no maximo 50 caracteres")
		private String descricao;

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome_categoria() {
			return Nome_categoria;
		}

		public void setNome_categoria(String nome_categoria) {
			Nome_categoria = nome_categoria;
		}

		
		
		

		
}