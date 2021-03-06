/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gui;

import java.io.File;
import java.util.ArrayList;

import br.com.bo.VerificaUltimaReleasesFiliais;
import br.com.constantes.TodasAsLojas;

/**
 *
 * @author WevKleyton
 *
 */
public class FReleaseOLD extends javax.swing.JFrame {

	/**
	 * Creates new form FRelease
	 */
	public FReleaseOLD() {
		initComponents();
		setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanelRelease = new javax.swing.JPanel();
		jLabelLojas = new javax.swing.JLabel();
		jComboBoxLojas = new javax.swing.JComboBox();
		jButtonRelatorios = new javax.swing.JButton();
		jButtonSair = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanelRelease.setBorder(javax.swing.BorderFactory
				.createTitledBorder("Release"));

		jLabelLojas.setText("Lojas:");

		jComboBoxLojas.setModel(new javax.swing.DefaultComboBoxModel(
				new String[] { "TODAS", "IGM", "NRE", "SDN", "VMR", "JAC",
						"SLL", "ABA", "RED", "COA", "TCM", "TAL", "MJU", "STI",
						"BNV", "RBC", "BCN", "VDE", "BGC", "AMT", "SAT", "PAP",
						"PAG", "TUB", "MAR", "ARG", "GUR", "PTO", "CUP", "EDC",
						"PNA", "SFX", "VIR", "CDC", "ITU", "CAP", "TMC", "RMO",
						"CPO", "PAF", "ANN", "SDA", "RBV", "PAM", "WAD", "MIT",
						"BAO", "XIG", "XAB", "FOA", "TOC", "SAA" }));

		jButtonRelatorios.setIcon(new javax.swing.ImageIcon(getClass()
				.getResource("/br/com/resources/terminal_report_24x24.png"))); // NOI18N
		jButtonRelatorios.setMnemonic('g');
		jButtonRelatorios.setText("Gerar Relatorio");
		jButtonRelatorios
				.addActionListener(new java.awt.event.ActionListener() {
					public void actionPerformed(java.awt.event.ActionEvent evt) {
						jButtonRelatoriosActionPerformed(evt);
					}
				});

		jButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource(
				"/br/com/resources/icon_6692_24x24.png"))); // NOI18N
		jButtonSair.setMnemonic('s');
		jButtonSair.setText("Sair");
		jButtonSair.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonSairActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanelReleaseLayout = new javax.swing.GroupLayout(
				jPanelRelease);
		jPanelRelease.setLayout(jPanelReleaseLayout);
		jPanelReleaseLayout
				.setHorizontalGroup(jPanelReleaseLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelReleaseLayout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(jLabelLojas)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanelReleaseLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanelReleaseLayout
																		.createSequentialGroup()
																		.addGap(12,
																				12,
																				12)
																		.addComponent(
																				jButtonRelatorios)
																		.addGap(64,
																				64,
																				64)
																		.addComponent(
																				jButtonSair)
																		.addContainerGap(
																				64,
																				Short.MAX_VALUE))
														.addGroup(
																jPanelReleaseLayout
																		.createSequentialGroup()
																		.addComponent(
																				jComboBoxLojas,
																				0,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addContainerGap()))));
		jPanelReleaseLayout
				.setVerticalGroup(jPanelReleaseLayout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanelReleaseLayout
										.createSequentialGroup()
										.addGap(17, 17, 17)
										.addGroup(
												jPanelReleaseLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jLabelLojas)
														.addComponent(
																jComboBoxLojas,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanelReleaseLayout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jButtonRelatorios)
														.addComponent(
																jButtonSair))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanelRelease, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanelRelease, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSairActionPerformed
		this.setVisible(false);
	}// GEN-LAST:event_jButtonSairActionPerformed

	private void jButtonRelatoriosActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonRelatoriosActionPerformed
		//TODO Executa releases
		String Todas = "TODAS";
		VerificaUltimaReleasesFiliais verificaRelease = new VerificaUltimaReleasesFiliais();
		int qtdloja = 0;

		if (jComboBoxLojas.getSelectedItem().toString() == Todas) {
			TodasAsLojas tlojas = new TodasAsLojas();
			ArrayList<String> lojas = tlojas.ListaLojas();
			for (int i = 0; i < lojas.size(); i++) {
				qtdloja = i++;
			}
		}
		if (jComboBoxLojas.getSelectedItem().toString() == Todas) {
			TodasAsLojas tlojas = new TodasAsLojas();
			ArrayList<String> lojas = tlojas.ListaLojas();
			for (int i = 0; i < lojas.size(); i++) {
				verificaRelease.verRelease(lojas.get(i), qtdloja);
			}
		} else {
			String loja = jComboBoxLojas.getSelectedItem().toString();
			qtdloja = 1 ;
			verificaRelease.verRelease(loja, qtdloja);
		}

	}// GEN-LAST:event_jButtonRelatoriosActionPerformed

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed"
		// desc=" Look and feel setting code (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the
		 * default look and feel. For details see
		 * http://download.oracle.com/javase
		 * /tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
					.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(FReleaseOLD.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(FReleaseOLD.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(FReleaseOLD.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(FReleaseOLD.class.getName()).log(
					java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new FReleaseOLD().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonRelatorios;
	private javax.swing.JButton jButtonSair;
	private javax.swing.JComboBox jComboBoxLojas;
	private javax.swing.JLabel jLabelLojas;
	private javax.swing.JPanel jPanelRelease;
	// End of variables declaration//GEN-END:variables
}
