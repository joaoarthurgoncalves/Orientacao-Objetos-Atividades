package modelo;

public class Prato {
	
private String descricao;	
private Integer quantidade;
private Double ValorUnitario;
	 
public String getDescricao() {
	return descricao;
}
public void setDescricao(String descricao) {
	this.descricao = descricao;
}
public Integer getQuantidade() {
	return quantidade;
}
public void setQuantidade(Integer quantidade) {
	this.quantidade = quantidade;
}
public Double getValorUnitario() {
	return ValorUnitario;
}
public void setValorUnitario(Double ValorUnitario) {
	this.ValorUnitario = ValorUnitario;
}

public Double getValorTotal() {
	Double ValorPrato = this.ValorUnitario * this.quantidade;
	return ValorPrato;
}
	
	public String getInfo() {
		String info = "Descrição: " + this.descricao;
		info += " - Quantidade: " + this.quantidade; 
		info += " - Valor Unitário: " + this.ValorUnitario;
		return info;
}


}

