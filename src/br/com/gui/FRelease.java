/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gui;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import com.sun.glass.events.MouseEvent;

import br.com.bean.Release;
import br.com.bo.VerificaUltimaReleasesFiliais;
import br.com.constantes.TodasAsLojas;
import br.com.utilitarios.TesteComunicacao;
import net.sf.jasperreports.engine.JRException;

/**
 * @author wev
 */
public class FRelease extends javax.swing.JDialog {

    TodasAsLojas tlojas = new TodasAsLojas();
    ArrayList<String> lojas = tlojas.ListaLojas();
//	private String releaseBaixada;
//	private String releaseAplicada;
//	private String lojaRelease;
//	private List<String> listaRelease;

    Release release = new Release();
    DefaultTableModel val ;
//	

    /**
     * Creates new form FReleaseNew
     */
    public FRelease(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelPrincipal = new javax.swing.JPanel();
        jPanelLoja = new javax.swing.JPanel();
        jLabelLojas = new javax.swing.JLabel();
        jComboBoxListaLoja = new javax.swing.JComboBox();
        jScrollPaneRelease = new javax.swing.JScrollPane();
        jTableRelease = new javax.swing.JTable();
        jPanelButao = new javax.swing.JPanel();
        jToggleButtonrelease = new javax.swing.JToggleButton();
        jToggleButtonSair = new javax.swing.JToggleButton();
        jButtonImprimir = new javax.swing.JButton();
        jLabelMostraLoja = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createTitledBorder("Gera Release"));

        jPanelLoja.setLayout(new javax.swing.BoxLayout(jPanelLoja, javax.swing.BoxLayout.LINE_AXIS));

        jLabelLojas.setText("Lojas");
        jPanelLoja.add(jLabelLojas);

        for(int i =0; i < lojas.size(); i++){
            jComboBoxListaLoja.addItem(lojas.get(i));
        }
        jComboBoxListaLoja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jComboBoxListaLojaKeyPressed(evt);
            }
        });
        jPanelLoja.add(jComboBoxListaLoja);

        jTableRelease.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loja", "Baixada", "Apicada"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableRelease.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableReleaseMouseClicked(evt);
            }
        });
        jScrollPaneRelease.setViewportView(jTableRelease);

        jPanelButao.setLayout(new java.awt.GridBagLayout());

        jToggleButtonrelease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/verReleases.png"))); // NOI18N
        jToggleButtonrelease.setMnemonic('R');
        jToggleButtonrelease.setText("Release");
        jToggleButtonrelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jToggleButtonreleaseActionPerformed(evt);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelButao.add(jToggleButtonrelease, gridBagConstraints);

        jToggleButtonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/exit.png"))); // NOI18N
        jToggleButtonSair.setMnemonic('S');
        jToggleButtonSair.setText("Sair");
        jToggleButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonSairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelButao.add(jToggleButtonSair, gridBagConstraints);

        jButtonImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/impressora.png"))); // NOI18N
        jButtonImprimir.setMnemonic('I');
        jButtonImprimir.setText("Imprimir");
        jButtonImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButtonImprimirActionPerformed(evt);
				} catch (JRException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelButao.add(jButtonImprimir, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanelButao.add(jLabelMostraLoja, gridBagConstraints);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelLoja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPaneRelease)
            .addComponent(jPanelButao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jPanelLoja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneRelease, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelButao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonSairActionPerformed
        dispose();
    }//GEN-LAST:event_jToggleButtonSairActionPerformed

    @SuppressWarnings("static-access")
    private void jToggleButtonreleaseActionPerformed(java.awt.event.ActionEvent evt) throws InterruptedException {//GEN-FIRST:event_jToggleButtonreleaseActionPerformed

        String Todas = "TODAS";

        String lojaComParametros = null;
        VerificaUltimaReleasesFiliais verificaRelease = new VerificaUltimaReleasesFiliais();
        TesteComunicacao comunicacao = new TesteComunicacao();
        val =  (DefaultTableModel) jTableRelease.getModel();
        val.setNumRows(0);
        int qtdloja = 0;

        //TODO : Verifica a quantidade de lojas
        if (jComboBoxListaLoja.getSelectedItem().toString() == Todas) {
            for (int i = 0; i < lojas.size(); i++) {
                qtdloja = i++;
            }
        }
        ArrayList<String> lojas = new TodasAsLojas().ListaLojas();
        
            if (jComboBoxListaLoja.getSelectedItem().toString() == Todas) {
                for (int i = 0; i < lojas.size(); i++) {
                    String loja = lojas.get(i);
                    if (loja == "TODAS") {
                        continue;
                    } else {
                        if (loja.equals("AMT")) {
                            loja = "ALT";
                        } else if (loja.equals("SAA")) {
                            loja = "STA";
                        }
                            if (comunicacao.isOnLine(loja.toLowerCase()) == true) {
                                if (loja.equals("ALT")) {
                                    lojaComParametros = verificaRelease.verRelease(loja, qtdloja);
                                } else {
                                	jLabelMostraLoja.setText(loja);
                                	this.validate();
//                                	JOptionPane.showMessageDialog(null, loja);
//                                	JLojas jLojas = new JLojas(null, rootPaneCheckingEnabled);
//                                	jLojas.setLoja(loja);
//                                	jLojas.setVisible(true);
                                	
                                    lojaComParametros = verificaRelease.verRelease(lojas.get(i), qtdloja);
//                            		BarraProgresso barraProgresso = new BarraProgresso();
//                        			barraProgresso.startBarraPrograsso(loja);
                                    if (lojaComParametros != null) {
                                        String[] result = lojaComParametros.split(",");
                                        val.addRow(new String[]{result[0], result[1], result[2]});
                                        release.setLoja(result[0]);
                                        release.setReleaseBaixada(result[1]);
                                        release.setReleaseAplicada(result[2]);

                                    } else {
                                        val.addRow(new String[]{loja, "null", "null"});
                                        release.setLoja(loja);
                                        release.setReleaseBaixada("null");
                                        release.setReleaseAplicada("null");

                                    }
                                }
                            } else {
                                val.addRow(new String[]{loja, "OFF LINE", "OFF LINE"});
                                release.setLoja(loja);
                                release.setReleaseBaixada("OFF LINE");
                                release.setReleaseAplicada("OFF LINE");
                            }

                    }

                }
            } else {
                String loja = jComboBoxListaLoja.getSelectedItem().toString();
                qtdloja = 1;
                int column;

                if (loja.equals("AMT")) {
                    loja = "ALT";
                } else if (loja.equals("SAA")) {
                    loja = "STA";
                }
                if (comunicacao.isOnLine(loja) == true) {
                    lojaComParametros = verificaRelease.verRelease(loja, qtdloja);
                    if (lojaComParametros != null) {
                        String[] result = lojaComParametros.split(",");
                        val.addRow(new String[]{result[0], result[1], result[2]});
                        release.setLoja(result[0]);
                        release.setReleaseBaixada(result[1]);
                        release.setReleaseAplicada(result[2]);

                    } else {
                        val.addRow(new String[]{loja, "null", "null"});
                        release.setLoja(loja);
                        release.setReleaseBaixada("null");
                        release.setReleaseAplicada("null");

                    }
                } else {
                    val.addRow(new String[]{loja, "OFF LINE", "OFF LINE"});
                    release.setLoja(loja);
                    release.setReleaseBaixada("OFF LINE");
                    release.setReleaseAplicada("OFF LINE");
                }
            }
       
            String loja = null;
            if (jComboBoxListaLoja.getSelectedItem().toString() == "TODAS"){

                for (int i = 0; i < lojas.size(); i++){
                    loja = lojas.get(i);
                    System.out.println(loja);
                    if (loja != "TODAS"){
                        verificaRelease.executaReleaseList(loja);
                    }else{
                        continue;
                    }
                }
            }else{
                List<String> listaRetorno = verificaRelease.executaReleaseList("sco"+jComboBoxListaLoja.getSelectedItem().toString().toLowerCase());
                for (String lista : listaRetorno){
                    System.out.println(lista);
                }

            }
            jLabelMostraLoja.setText("");

    }//GEN-LAST:event_jToggleButtonreleaseActionPerformed

    private void jButtonImprimirActionPerformed(java.awt.event.ActionEvent evt) throws JRException {//GEN-FIRST:event_jButtonImprimirActionPerformed

    }//GEN-LAST:event_jButtonImprimirActionPerformed

    private void jComboBoxListaLojaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jComboBoxListaLojaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            jToggleButtonrelease.requestFocus();
        }
    }//GEN-LAST:event_jComboBoxListaLojaKeyPressed

    private void jTableReleaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableReleaseMouseClicked
        // TODO add your handling code here:
    	if (evt.getClickCount() == 2) {
    		FDeployRelease fDeployRelease = new FDeployRelease(null, rootPaneCheckingEnabled);
    		System.out.println(jTableRelease.getValueAt(jTableRelease.getSelectedRow(), 0));
    		fDeployRelease.setVisible(true);
    		
    	}


    }//GEN-LAST:event_jTableReleaseMouseClicked


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRelease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRelease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRelease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRelease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRelease dialog = new FRelease(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonImprimir;
    private javax.swing.JComboBox jComboBoxListaLoja;
    private javax.swing.JLabel jLabelLojas;
    private javax.swing.JLabel jLabelMostraLoja;
    private javax.swing.JPanel jPanelButao;
    private javax.swing.JPanel jPanelLoja;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JScrollPane jScrollPaneRelease;
    private javax.swing.JTable jTableRelease;
    private javax.swing.JToggleButton jToggleButtonSair;
    private javax.swing.JToggleButton jToggleButtonrelease;
    // End of variables declaration//GEN-END:variables


}
