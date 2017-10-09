package br.com.utilitarios;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class BarraProgresso extends JFrame {
	private JPanel contentPane;
	private JProgressBar progressBar;
	private JPanel panel;
	private Timer timer;
	private int porcentagem;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		BarraProgresso frame = new BarraProgresso();
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//			
//		});
		
		BarraProgresso barra = new BarraProgresso();
		barra.startBarraPrograsso("teste");
	}

	/**
	 * Create the frame.
	 */
	public void BarraProgressoLoja(String loja) {
		this.setVisible(true);
		setTitle("Verificando Loja!");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 80);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLocation(-5, -25);
		setContentPane(contentPane);
		contentPane.add(getProgressBar(), BorderLayout.NORTH);
		contentPane.add(getPanel(), BorderLayout.SOUTH);
		contentPane.add(setLabel(loja), JLabel.NORTH);
		
		
		timer = new Timer(30, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				porcentagem++;
				progressBar.setValue(porcentagem);
				if (porcentagem >= 100) {
					timer.stop();
					if (porcentagem == 100) {
						dispose();
					}
				}
			}
		});
		timer.start();
		contentPane.isDisplayable();
	}

	private JProgressBar getProgressBar() {
		if (progressBar == null) {
			progressBar = new JProgressBar();
			progressBar.setStringPainted(true);
		}
		return progressBar;
	}

	private JPanel getPanel() {
		if (panel == null) {
			panel = new JPanel();
			panel.setLocation(-5,  -25);
		}
		return panel;
	}
	
	private Component setLabel(String loja) {
		JLabel jLabel = new JLabel("Filial de : " + loja);
		return jLabel;
	}
	
	public void startBarraPrograsso(String loja) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarraProgresso barra = new BarraProgresso();
					barra.BarraProgressoLoja(loja);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}
	
}
