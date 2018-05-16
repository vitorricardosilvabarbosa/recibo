package br.com.start.db1.recibo.classes;

import br.com.start.db1.recibo.tipo.TipoLogradouro;

import br.com.start.db1.classes.Cidade;

public class Endereco {
	
	private TipoLogradouro tipoLogradouro;
	
	private Cidade cidade;
	
	private String logradouro;
	
	private String numero;
	
	private String complemento;
	
	private String bairro;
	
	private Integer cep;
	
	public String getCepFormatado() {
		return cep.toString();
	}
}
