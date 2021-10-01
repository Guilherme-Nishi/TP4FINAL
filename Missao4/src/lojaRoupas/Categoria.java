package lojaRoupas;

public class Categoria {
	private String tamanhoProduto;
	private String classifica�aoProdutoSexo;
	private String  classifica�aoProdutoEtaria;
	
	public Categoria (String t , String cla , String et) {
		tamanhoProduto=t;
		classifica�aoProdutoSexo=cla;
		classifica�aoProdutoEtaria=et;
	}
	
	public String toString() {
		return "\nO tamanho do produto : " + tamanhoProduto+" \nGenero : "+classifica�aoProdutoSexo+"  \nFaixa etaria : "+ classifica�aoProdutoEtaria;
	}
	
	public String getTamanhoProduto() {
		return tamanhoProduto;
	}
	
	public void setTamanhoProduto(String tamanhoProduto) {
		this.tamanhoProduto=tamanhoProduto;
	}
	
	public String getClassifica�aoProdutoSexo() {
		return classifica�aoProdutoSexo;
	}
	
	public void setClassifica�aoProdutoSexo(String classifica�aoProdutoSexo) {
		this.classifica�aoProdutoSexo=classifica�aoProdutoSexo;
	}
	
	public String getClassifica�aoProdutoEtaria() {
		return classifica�aoProdutoEtaria;
	}
	
	public void setClassifica�aoProdutoEtaria(String classifica�aoProdutoEtaria) {
		this.classifica�aoProdutoEtaria=classifica�aoProdutoEtaria;
	}
}