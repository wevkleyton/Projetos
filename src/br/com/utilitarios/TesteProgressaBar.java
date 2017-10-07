package br.com.utilitarios;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class TesteProgressaBar extends JFrame{
	JProgressBar progressBar = new JProgressBar();
	
	private JProgressBar getProgressBar(int tamanho) {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setBounds(new Rectangle(18, 459, 419, 25));
			progressBar.setStringPainted(true);
			progressBar.setMinimum(0);
			progressBar.setMaximum((int)tamanho);
		}
		return progressBar;
	}
	
	
	public static void main(String[] args) {
		TesteProgressaBar teste = new TesteProgressaBar();
		teste.getProgressBar(100);
		
		
	}
}
