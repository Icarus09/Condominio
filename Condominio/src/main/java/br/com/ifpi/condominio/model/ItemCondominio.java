package br.com.ifpi.condominio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="ITEM_CONDOMINIO")
public class ItemCondominio { // uma despesa do condominio.
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@NotNull
	private String referencia;
	
	@NotNull
	private double valor;
	
	@ManyToOne
    @JoinColumn(name = "id_despesa", nullable = false)
	private Despesa despesa;
	
	@ManyToOne
    @JoinColumn(name = "id_condominio", nullable = false)
	private Condominio condominio;
	
}
