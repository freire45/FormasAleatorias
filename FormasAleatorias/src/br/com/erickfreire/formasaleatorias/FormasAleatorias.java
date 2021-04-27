package br.com.erickfreire.formasaleatorias;

/**
 * Programa em Java que desenha formas aleatórias com cores aleatórias
 * @author Erick Freire
 * @version 1 Criado em 27-04-2021 as 19:06
 */

import java.awt.Color;
import java.awt.Graphics;
import java.security.SecureRandom;

import javax.swing.JPanel;

public class FormasAleatorias extends JPanel {
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		int altura;
		int largura;
		int altura2;
		int largura2;
		int altura3;
		int largura3;
		
	    int r1;
	    int g1;
	    int b1;

	    int r2;
	    int g2;
	    int b2;
	    
	    SecureRandom numeroAleatorio = new SecureRandom();
		
		
		for ( int i = 1 ; i <= 10 ; i++)
		{	    
		    r1 = numeroAleatorio.nextInt(255);
		    g1 = numeroAleatorio.nextInt(255);
		    b1 = numeroAleatorio.nextInt(255);
		    r2 = numeroAleatorio.nextInt(255);
		    g2 = numeroAleatorio.nextInt(255);
		    b2 = numeroAleatorio.nextInt(255);
		    
		    altura = 1 + numeroAleatorio.nextInt(255);
		    largura = 1 + numeroAleatorio.nextInt(255);
		    altura2 = 1 + numeroAleatorio.nextInt(255);
		    largura2 = 1 + numeroAleatorio.nextInt(255);
		    altura3 = 1 + numeroAleatorio.nextInt(255);
		    largura3 = 1 + numeroAleatorio.nextInt(255);
		    
		    
			if ( i % 2 == 0 ) {
				g.setColor(Color.getHSBColor(r1, g1, b1));
			    g.fillOval(largura3, altura3, largura2, altura2);
			}
			else {
				g.setColor(Color.getHSBColor(r2, g2, b2));
				g.fillRect(largura3, altura3, largura2, altura2);
			}
			
			
		}
		
	}

}
