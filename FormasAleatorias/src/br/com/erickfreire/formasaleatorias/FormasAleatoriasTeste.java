package br.com.erickfreire.formasaleatorias;

import javax.swing.JFrame;

public class FormasAleatoriasTeste extends JFrame{
	public static void main(String[] args) {
		FormasAleatorias painel = new FormasAleatorias();
		
		JFrame aplicacao = new JFrame();
		
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		aplicacao.add(painel);
		aplicacao.setSize(250,200);
		aplicacao.setVisible(true);
	}

}
