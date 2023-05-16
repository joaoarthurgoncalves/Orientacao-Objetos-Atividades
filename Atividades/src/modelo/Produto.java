package modelo;

public class Produto {

	private String descricao;
	private String unidadeMedida;
	private int quantidade;
	private float valorUnitario;
	
	//Métodos
	public float getValorTotal() {
			
		float ValorTotal = this.quantidade*this.valorUnitario;
		return ValorTotal;
	}
	
	//Gets e Sets
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public float getValorUnitario() {
		return valorUnitario;
	}
	public void setValorUnitario(float valorUnitario) {
		this.valorUnitario = valorUnitario;
	} 	
}
