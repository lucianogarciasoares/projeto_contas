package br.com.cotiinformatica.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Conta {
	
	private Integer idConta;
	private String nome;
	private Double valor;
	private Date data;
	private String observacoes;
	
	private Usuario usuario;
	private Categoria categoria;
	
}
