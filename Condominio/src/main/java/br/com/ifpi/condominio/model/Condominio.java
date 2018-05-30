package br.com.ifpi.condominio.model;

import java.util.Date;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "CONDOMINIO")
public class Condominio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "mes_ano")
	@NotNull
	private Date mesAno;
	
	@Column(name = "data_pagamento")
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date dataPagamento;
	
	@Column(name = "valor_pago")
	@NotNull
	private double valorPago;
	
	@Column(name = "valor_pagar")
	private double valorPagar;
	
	@ManyToOne()
	@JoinColumn(name = "id_apt")
	private Apartamento apartamento;
	
	@Transient
	private List<ItemCondominio> itens;
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	
	public Apartamento getApartamento() {
		return apartamento;
	}

	public void setApartamento(Apartamento apartamento) {
		this.apartamento = apartamento;
	}

	public Date getMesAno() {
		return mesAno;
	}

	public void setMesAno(Date mesAno) {
		this.mesAno = mesAno;
	}

	public List<ItemCondominio> getItens() {
		return itens;
	}

	public void setItens(List<ItemCondominio> itens) {
		this.itens = itens;
	}

	public double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(double valorPagar) {
		this.valorPagar = valorPagar;
	}
	
	
	
}
