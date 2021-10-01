package View;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controle.ControleDados;

public class TelaProduto implements ActionListener {
	private static JFrame telaProduto = new JFrame();
	private static JLabel tituloProduto2;
	private static JLabel nomeP;
	private static JLabel precoP;
	private static JLabel corP;
	private static JLabel estoqueP;
	private static JLabel tamanhoP;
	private static JLabel catSexP;
	private static JLabel catProdEtaP;
	private static JLabel prodMarcaP;
	private static JLabel descricaoProdP;
	private static JButton comprar = new JButton("Comprar!");
	private static ControleDados dados;
	private int posicao;
	
	
	public void ComprarTela(ControleDados d , TelaListaCompras c,int pos) {
		dados=d;
		posicao=pos;
		
		
		telaProduto.setLayout(null);
		tituloProduto2 = new JLabel(dados.getProduto()[pos].getNomeproduto());
		tituloProduto2.setFont(new Font("Arial",Font.BOLD,20));
		tituloProduto2.setBounds(100,0,380,50);
		
		precoP = new JLabel("R$"+String.valueOf(dados.getProduto()[pos].getPreco()));
		precoP.setFont(new Font("Arial",Font.BOLD,40));
		precoP.setBounds(10,55,380,50);
		
		prodMarcaP = new JLabel("Marca: "+dados.getProduto()[pos].getMarca());
		prodMarcaP.setFont(new Font("Arial",Font.BOLD,20));
		prodMarcaP.setBounds(10,90,380,50);
		
		descricaoProdP = new JLabel(dados.getProduto()[pos].getDescricao());
		descricaoProdP.setFont(new Font("Arial",Font.BOLD,20));
		descricaoProdP.setBounds(10,110,200,50);
		
		tamanhoP = new JLabel("Tamanho: "+dados.getProduto()[pos].getCategoria().getTamanhoProduto());
		tamanhoP.setFont(new Font("Arial", Font.BOLD,20));
		tamanhoP.setBounds(10,145,200,50);
		
		catSexP = new JLabel("Sexo: "+dados.getProduto()[pos].getCategoria().getClassificaçaoProdutoSexo());
		catSexP.setFont(new Font("Arial", Font.BOLD,20));
		catSexP.setBounds(10,180,200,50);
		
		catProdEtaP = new JLabel("Idade: "+dados.getProduto()[pos].getCategoria().getClassificaçaoProdutoEtaria());
		catProdEtaP.setFont(new Font("Arial", Font.CENTER_BASELINE,20));
		catProdEtaP.setBounds(10,215,200,50);
		
		comprar.setBounds(170,250,100,30);
		
		
		telaProduto.add(comprar);
		telaProduto.add(catProdEtaP);
		telaProduto.add(catSexP);
		telaProduto.add(tamanhoP);
		telaProduto.add(descricaoProdP);
		telaProduto.add(prodMarcaP);
		telaProduto.add(tituloProduto2);
		telaProduto.add(precoP);
		
		telaProduto.setSize(300,330);
		telaProduto.setVisible(true);
		
	}


	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}