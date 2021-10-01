package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import controle.ControleDados;



public class TelaUser implements ActionListener {
	private static JFrame telaUser = new JFrame();
	private static JLabel tituloMenuUser = new JLabel("Menu do usuario");
	private static JButton pesquisarButton = new JButton("Pesquisar Produto");
	private static JButton listaButton = new JButton("Lista de produtos");
	public static ControleDados dados;
	
	public void TelaUser1 (ControleDados d) {
		dados=d;
		Color minhaCor3 = new Color(192, 192, 192);
		telaUser.setLayout(null);
		
		tituloMenuUser.setBounds(100,0,380,50);
		tituloMenuUser.setFont(new Font("Arial",Font.BOLD,20));
		telaUser.add(tituloMenuUser);
		
		pesquisarButton.setBounds(110,70,150,40);
		telaUser.add(pesquisarButton);
		
		listaButton.setBounds(110,150,150,40);
		telaUser.add(listaButton);
		
		
		
		
		
		
		
		telaUser.getContentPane().setBackground(minhaCor3);
		telaUser.setSize(400,300);
		telaUser.setLocationRelativeTo(null);
		telaUser.setVisible(true);
		listaButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src==listaButton) {
			new TelaListaCompras().ListaProdutosCliente(dados);
		}
		
	}

}