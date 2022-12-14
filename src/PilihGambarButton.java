
import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        glassfishButton = new javax.swing.JButton();
        javaeeButton = new javax.swing.JButton();
        postgresqlButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        glassfishLabel = new javax.swing.JLabel();
        javaeeLabel = new javax.swing.JLabel();
        postgresqlLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        buttonPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        buttonPanel.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 20, 20));

        glassfishButton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        glassfishButton.setText("Glassfish");
        glassfishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                glassfishButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(glassfishButton);

        javaeeButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        javaeeButton.setText("JavaEE");
        javaeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                javaeeButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(javaeeButton);

        postgresqlButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        postgresqlButton.setText("PostgreSQL");
        postgresqlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                postgresqlButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(postgresqlButton);

        exitButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(exitButton);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Muhammad Jarkasi 17630252"));
        imagePanel.setLayout(new java.awt.CardLayout());

        glassfishLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/glassfishpic.jpg"))); // NOI18N
        imagePanel.add(glassfishLabel, "0");

        javaeeLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaeepic.jpg"))); // NOI18N
        imagePanel.add(javaeeLabel, "1");

        postgresqlLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/postgresqlpic.jpg"))); // NOI18N
        imagePanel.add(postgresqlLabel, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void glassfishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_glassfishButtonActionPerformed
        CardLayout c1 = (CardLayout) (imagePanel.getLayout());
        c1.show(imagePanel,"0");
    }//GEN-LAST:event_glassfishButtonActionPerformed

    private void javaeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_javaeeButtonActionPerformed
        CardLayout c1 = (CardLayout) (imagePanel.getLayout());
        c1.show(imagePanel,"1");
    }//GEN-LAST:event_javaeeButtonActionPerformed

    private void postgresqlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_postgresqlButtonActionPerformed
        CardLayout c1 = (CardLayout) (imagePanel.getLayout());
        c1.show(imagePanel,"2");
    }//GEN-LAST:event_postgresqlButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PilihGambarButton fullFrame = new PilihGambarButton();
                
                GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
                device.setFullScreenWindow(fullFrame);
                
                fullFrame.setVisible(true);
            }
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton glassfishButton;
    private javax.swing.JLabel glassfishLabel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JButton javaeeButton;
    private javax.swing.JLabel javaeeLabel;
    private javax.swing.JButton postgresqlButton;
    private javax.swing.JLabel postgresqlLabel;
    // End of variables declaration//GEN-END:variables
}
