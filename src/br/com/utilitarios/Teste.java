/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.utilitarios;

import java.awt.Cursor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/**
 * 
 * @author wev
 */
public class Teste extends JFrame{
	
	public Teste() throws InterruptedException{
		JProgressBar progresso = new JProgressBar();
		setSize(300, 200);
		add(progresso);
		setLocationRelativeTo(null);
		setCursor(new Cursor(Cursor.WAIT_CURSOR));
		setVisible(true);
		progresso.setToolTipText("Aguarde...");
		for (int i = 0; i < 100; i++) {
			if (i == 30)
				progresso.setToolTipText("Executando 30%...");
			if (i == 70)
				progresso.setToolTipText("Executando 70%...");
			progresso.setValue(i);
			Thread.sleep(150);
			
		}
		setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
		JOptionPane.showMessageDialog(this, "Carregamento Concluido");
		setVisible(false);
	}
	public static void main(String[] args) throws InterruptedException {
		new Teste();
	}
}
