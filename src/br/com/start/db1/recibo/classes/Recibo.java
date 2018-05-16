package br.com.start.db1.recibo.classes;

public class Recibo {
	private Cidade cidade;
	
	private Emitente emitente;
	
	private Endereco endereco;
	
	private Pagador pagador;
	
	private List<Servico> servico;
	
	public Integer numero;
	
	public Double valor;
	
	public Date dataCadastro;
	
	public Date dataEmissao;
	
	private Boolean confirmacao;
	
	public String getDataEmissaoDescritiva() {
		return String;
	}
	
	public String getValorDescritivo() {
		return String;
	}
}
