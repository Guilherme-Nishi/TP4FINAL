package lojaRoupas;

public abstract  class Pessoa {

	protected String nome;
	protected String senha;
	protected Endere�o endereco ;
	
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome=nome;	
		
	}
	
	public String getSenha() {
		return senha;
		}
	public void setSenha(String senha) {
		this.senha=senha;	
			
		}
	
	public Endere�o getEndere�o() {
		return endereco;
		}
	public void setEndereco(Endere�o endereco) {
		this.endereco=endereco;	
			
		}
	
	
}