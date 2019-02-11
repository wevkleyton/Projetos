/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gui;

import java.io.IOException;

import com.jcraft.jsch.JSchException;

import br.com.utilitarios.Conecta;

/**
 *
 * @author wev
 */
@SuppressWarnings("serial")
public class FDeployRelease extends javax.swing.JDialog {
	
	private String loja;

    public String getLoja() {
		return loja;
	}

	public void setLoja(String loja) {
		this.loja = loja;
	}

	/**
     * Creates new form FDeployRelease
     */
    public FDeployRelease(java.awt.Frame parent, boolean modal) {
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

        jPanel1 = new javax.swing.JPanel();
        jToggleButtonExecDeploy = new javax.swing.JToggleButton();
        jToggleButtonExecRelease = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jToggleButtonExecDeploy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/deploy.png"))); // NOI18N
        jToggleButtonExecDeploy.setMnemonic('D');
        jToggleButtonExecDeploy.setText("Exec. Deploy");
        jToggleButtonExecDeploy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButtonExecDeployActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jToggleButtonExecDeploy, gridBagConstraints);

        jToggleButtonExecRelease.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/resources/release.png"))); // NOI18N
        jToggleButtonExecRelease.setMnemonic('R');
        jToggleButtonExecRelease.setText("Exec. Release");
        jToggleButtonExecRelease.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jToggleButtonExecReleaseActionPerformed(evt);
				} catch (JSchException | IOException | InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        jPanel1.add(jToggleButtonExecRelease, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButtonExecDeployActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButtonExecDeployActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButtonExecDeployActionPerformed

    @SuppressWarnings("static-access")
	private void jToggleButtonExecReleaseActionPerformed(java.awt.event.ActionEvent evt) throws JSchException, IOException, InterruptedException {//GEN-FIRST:event_jToggleButtonExecReleaseActionPerformed
        // TODO add your handling code here:
    	String comando  = "/u1/jap/deploy_4.4/get_release.sh";
    	Conecta conecta = new Conecta();
    	conecta.Conecta("sco" + getLoja().toLowerCase(), comando);
    	System.out.println(comando );
    	
    }//GEN-LAST:event_jToggleButtonExecReleaseActionPerformed

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
            java.util.logging.Logger.getLogger(FDeployRelease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FDeployRelease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FDeployRelease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FDeployRelease.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FDeployRelease dialog = new FDeployRelease(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JToggleButton jToggleButtonExecDeploy;
    private javax.swing.JToggleButton jToggleButtonExecRelease;
    // End of variables declaration//GEN-END:variables
}
