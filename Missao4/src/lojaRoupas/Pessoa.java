package lojaRoupas;

public abstract  class Pessoa {

	protected String nome;
	protected String senha;
	protected Enderešo endereco ;
	
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
	
	public Enderešo getEnderešo() {
		return endereco;
		}
	public void setEndereco(Enderešo endereco) {
		this.endereco=endereco;	
			
		}
	
	
}