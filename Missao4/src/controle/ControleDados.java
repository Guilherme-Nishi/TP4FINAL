package controle;

import lojaRoupas.*;

public class ControleDados {
	private Dados d = new Dados();
	
	public ControleDados() {
		d.fillWithSomeData();
	}
	
	public Dados getDados() {
		return d;
	}
	public void setDados(Dados d) {
		this.d = d;
	}

	public Produto[] getProduto() {
		return this.d.getProduto();
	}
	
	public int getqtdProduto() {
		return this.d.getQtdproduto();
	}
	
	public int getqtdclient() {
		return this.d.getqtdclient();
	}
	
	public Cliente[] getCliente() {
		return this.d.getCliente();
	}
	 public Venda[] getVenda() {
			
			return this.d.getVenda();
		}
	   public int getqtdvenda() {
			return this.d.getQtdvend();
		}
	


	public boolean inserirEditarCliente(String[] dadosCliente) {
		int ut = 1;
		if(ut==0) {
			return false;
		} else {
				Cliente p = new Cliente(dadosCliente[1], dadosCliente[2], dadosCliente[3],
						new Endereço(dadosCliente[4], dadosCliente[5], Integer.parseInt(dadosCliente[6]), dadosCliente[7]),
						new Cartao(dadosCliente[8],Integer.parseInt(dadosCliente[9]),dadosCliente[10],dadosCliente[11]));
				d.inserirEditacliente(p, Integer.parseInt(dadosCliente[0]));
				return true;
		}
	}
	
	// a posicao 0 do vetor dadosProduto indica onde os dados devem ser inseridos
	public boolean inserirEditarProduto(String[] dadosProduto) {
		int tu = 1;
		if(tu==0) {
			return false;
		} else {
				Produto a = new Produto(dadosProduto[1], Double.parseDouble(dadosProduto[2]),Integer.parseInt(dadosProduto[3]), 
						dadosProduto[4], new Categoria(dadosProduto[5],dadosProduto[6],dadosProduto[7]),dadosProduto[8],dadosProduto[9],Integer.parseInt(dadosProduto[10]));
				d.inserirEditarProduto(a, Integer.parseInt(dadosProduto[0]));
				
				return true;
		}
	}
	
	public boolean removerP(int i) {
		int qtdven = d.getQtdvend();
		String produtoRemovido = d.getProduto()[i].getNomeproduto();
		String aux;
		for (int j = 0; j < qtdven; j++) { 
			aux = d.getVenda()[j].getProduto().getNomeproduto();
			if(produtoRemovido.compareTo(aux) == 0) 
				return false; //não é possível remover aluno pois ele está matriculado em um curso
		}
		
		if(i == (d.getqtdproduto() - 1)) { // O aluno a ser removido está no final do array
			d.setQqtdproduto(d.getQtdproduto() - 1);
			d.getProduto()[d.getQtdproduto()] = null;
			return true;
		} else { // o aluno a ser removido está no meio do array
			int cont = 0;
			while(d.getProduto()[cont].getNomeproduto().compareTo(produtoRemovido) != 0) {
				cont++;
			}
			//Rotina swap
			for(int j = cont; j < d.getqtdproduto() - 1; j++) {
				d.getProduto()[j] = null;
				d.getProduto()[j] = d.getProduto()[j+1];
			}
			d.getProduto()[d.getqtdproduto()] = null;
			d.setQqtdproduto(d.getqtdproduto() - 1);
			return true;
		}
	}
	
	public boolean inserirEditarVenda(String[] dadosVenda) {
		int tu = 1;
		if(tu==0) {
			return false;
		} else {
				Venda b = new Venda(dadosVenda[1], new Produto(dadosVenda[2], Double.parseDouble(dadosVenda[3]),Integer.parseInt(dadosVenda[4]), 
						dadosVenda[5], new Categoria(dadosVenda[6],dadosVenda[7],dadosVenda[8]),dadosVenda[9],dadosVenda[10],Integer.parseInt(dadosVenda[11])), new Cliente(dadosVenda[12], dadosVenda[13], dadosVenda[14],
								new Endereço(dadosVenda[15],dadosVenda[16], Integer.parseInt(dadosVenda[17]), dadosVenda[18]),
								new Cartao(dadosVenda[19],Integer.parseInt(dadosVenda[20]),dadosVenda[21],dadosVenda[22])));
						
				d.inserirEditarVenda(b, Integer.parseInt(dadosVenda[0]));
				return true;
		}
	}
	
}