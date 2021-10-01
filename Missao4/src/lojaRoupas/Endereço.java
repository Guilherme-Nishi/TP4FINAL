package lojaRoupas;

public class Endere�o {
	
	private String cep;
	private String rua;
	private int numero;
	private String complemento;
	
	public Endere�o (String cp , String r , int n , String c) {
		cep=cp;
		rua=r;
		numero=n;
		complemento=c;
	}
	
	public String toString() {
		return "\nCEP :" + cep + " \nRua:" + rua + "   \nN�mero da casa: "+ numero+ "  \n Complemento: "+ complemento;
	}
	
	public String getCep() {
		return cep;
	}
	
	public void setCep(String cep) {
		this.cep=cep;
	}
	
	public String getRua() {
		return rua;
	}
	
	public void setRua(String rua) {
		this.rua=rua;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
	public String setComplemento() {
		return complemento;
	}
	
	public void getComplemento(String complemento) {
		this.complemento=complemento;
	}
}