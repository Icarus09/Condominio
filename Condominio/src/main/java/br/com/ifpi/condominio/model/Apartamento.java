package br.com.ifpi.condominio.model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "APARTAMENTO")
public class Apartamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int numero;
	
	@NotNull
	@Column(name = "qtd_quartos")
	private int quantidadeQuartos;

	@Enumerated(EnumType.STRING)
	private TipoOcupacao ocupacao;
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getQuantidadeQuartos() {
		return quantidadeQuartos;
	}
	
	public void setQuantidadeQuartos(int quantidadeQuartos) {
		this.quantidadeQuartos = quantidadeQuartos;
	}
	
	public TipoOcupacao getOcupacao() {
		return ocupacao;
	}
	
	public void setOcupacao(TipoOcupacao ocupacao) {
		this.ocupacao = ocupacao;
	}
	
}
