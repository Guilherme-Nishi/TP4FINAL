package controle;



import lojaRoupas.*;

public class ControleCliente {
	private Cliente[] p;
	private int qtdCliente;

	public ControleCliente(ControleDados d) {
		p = d.getCliente();
		qtdCliente = d.getqtdclient();
	}

	public String[] getNomeCliente() {
		String[] s = new String[qtdCliente];
		for(int i = 0; i < qtdCliente; i++) {
			s[i] = p[i].getNome();
		}

		return s;
	}
	public int getQtd() {
		return qtdCliente;
	}

	public void setQtd(int qtd) {
		this.qtdCliente = qtd;
	}

	public String getNome(int i) {		
		return p[i].getNome();
	}

	public String getSenha(int i) {
		String numSenha = String.valueOf(p[i].getSenha());
		return numSenha;
	}

	public String getEmail(int i) {
		
		return p[i].getEmail();
	}

	public Endereço getEndeco(int i) {
		return p[i].getEndereço();
	}

	public void setQtdCliente(int qtdCliente) {
		this.qtdCliente = qtdCliente;
	}
	
	
}