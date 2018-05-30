package br.com.ifpi.condominio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "TIPO_DESPESA")
public class TipoDespesa {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "Nome")
	@NotNull
	private String nome;

	@Column(name = "Valor_Rateado")
	@NotNull
	private boolean valorRateado;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isValorRateado() {
		return valorRateado;
	}
	
	public void setValorRateado(boolean valorRateado) {
		this.valorRateado = valorRateado;
	}
	
	
	
	
}
