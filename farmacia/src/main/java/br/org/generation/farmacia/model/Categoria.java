package br.org.generation.farmacia.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



@Entity
@Table(name = "tb_categoria")
public class Categoria{
	    
	    @Id	
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
	    
	    @NotBlank(message = "O atributo categoria é obrigatório e não pode conter espaços em branco")
	    @Size(min = 3, max = 100, message = "A categoria deve ter no minimo 3 e no maximo 100 caracteres")
	    private String categoria;
	    
	    @NotBlank(message = "O atributo descrição é Obrigatório!")
		@Size(min = 3,max = 100,message = "A descrição deve ter no minimo 3 e no maximo 100 caracteres")
		private String descricao;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCategoria() {
			return categoria;
		}

		public void setCategoria(String categoria) {
			this.categoria = categoria;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

	

		
		
		

		
}
