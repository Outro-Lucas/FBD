package VISUAL;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmAnimeGen extends javax.swing.JFrame {
    static String sql;


    public frmAnimeGen() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Shounen = new javax.swing.JCheckBox();
        Drama = new javax.swing.JCheckBox();
        Romance = new javax.swing.JCheckBox();
        Ecchi = new javax.swing.JCheckBox();
        Acao = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Escolha de Genêro");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        Shounen.setForeground(new java.awt.Color(255, 255, 255));
        Shounen.setText("Shounen");
        Shounen.setContentAreaFilled(false);
        Shounen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShounenActionPerformed(evt);
            }
        });
        getContentPane().add(Shounen);
        Shounen.setBounds(19, 195, 86, 23);

        Drama.setForeground(new java.awt.Color(255, 255, 255));
        Drama.setText("Drama");
        Drama.setContentAreaFilled(false);
        Drama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DramaActionPerformed(evt);
            }
        });
        getContentPane().add(Drama);
        Drama.setBounds(19, 129, 70, 23);

        Romance.setForeground(new java.awt.Color(255, 255, 255));
        Romance.setText("Romance");
        Romance.setContentAreaFilled(false);
        Romance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RomanceActionPerformed(evt);
            }
        });
        getContentPane().add(Romance);
        Romance.setBounds(19, 227, 87, 23);

        Ecchi.setForeground(new java.awt.Color(255, 255, 255));
        Ecchi.setText("Ecchi");
        Ecchi.setContentAreaFilled(false);
        Ecchi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EcchiActionPerformed(evt);
            }
        });
        getContentPane().add(Ecchi);
        Ecchi.setBounds(19, 162, 60, 23);

        Acao.setForeground(new java.awt.Color(255, 255, 255));
        Acao.setText("Ação");
        Acao.setContentAreaFilled(false);
        Acao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcaoActionPerformed(evt);
            }
        });
        getContentPane().add(Acao);
        Acao.setBounds(19, 96, 57, 23);

        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(20, 290, 110, 40);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gêneros Cadastrados:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 30, 296, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/paste.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 30, 300, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/paste.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 90, 110, 170);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/IMAGEM/tela_8.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jLabel3.setMaximumSize(new java.awt.Dimension(500, 400));
        jLabel3.setMinimumSize(new java.awt.Dimension(500, 400));
        jLabel3.setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EcchiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EcchiActionPerformed
        // TODO add your handling code here:
        Drama.setSelected(false);
        Acao.setSelected(false);
        Romance.setSelected(false);
        Shounen.setSelected(false);
    }//GEN-LAST:event_EcchiActionPerformed

    private void AcaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcaoActionPerformed
        // TODO add your handling code here:
        Drama.setSelected(false);
        Ecchi.setSelected(false);
        Romance.setSelected(false);
        Shounen.setSelected(false);
    }//GEN-LAST:event_AcaoActionPerformed

    private void DramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DramaActionPerformed
        // TODO add your handling code here:
        Acao.setSelected(false);
        Ecchi.setSelected(false);
        Romance.setSelected(false);
        Shounen.setSelected(false);
    }//GEN-LAST:event_DramaActionPerformed

    private void ShounenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShounenActionPerformed
        Drama.setSelected(false);
        Ecchi.setSelected(false);
        Romance.setSelected(false);
        Acao.setSelected(false);
    }//GEN-LAST:event_ShounenActionPerformed

    private void RomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RomanceActionPerformed
        // TODO add your handling code here:
        Drama.setSelected(false);
        Ecchi.setSelected(false);
        Acao.setSelected(false);
        Shounen.setSelected(false);
    }//GEN-LAST:event_RomanceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       if(Acao.isSelected()){
           sql = "select * from anime where genero = 'Ação' order by random() Limit 1";
           frmGenero frm = null;
           try {
               frm = new frmGenero();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(frmAnimeGen.class.getName()).log(Level.SEVERE, null, ex);
           }
           frm.setVisible(true);
           dispose();
       }
       else if(Drama.isSelected()){
           sql = "select * from anime where genero = 'Drama' order by random() Limit 1";
           frmGenero frm=null;
           try {
               frm = new frmGenero();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(frmAnimeGen.class.getName()).log(Level.SEVERE, null, ex);
           }
           frm.setVisible(true);
           dispose();
       }
       else if(Ecchi.isSelected()){
           sql = "select * from anime where genero = 'Ecchi' order by random() Limit 1";
           frmGenero frm=null;
           try {
               frm = new frmGenero();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(frmAnimeGen.class.getName()).log(Level.SEVERE, null, ex);
           }
           frm.setVisible(true);
           dispose();
       }
       else if(Romance.isSelected()){
           sql = "select * from anime where genero = 'Romance' order by random() Limit 1";
           frmGenero frm=null;
           try {
               frm = new frmGenero();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(frmAnimeGen.class.getName()).log(Level.SEVERE, null, ex);
           }
           frm.setVisible(true);
           dispose();
       }
       else if(Shounen.isSelected()){
          sql = "select * from anime where genero = 'Shounen' order by random() Limit 1";
           frmGenero frm=null;
           try {
               frm = new frmGenero();
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(frmAnimeGen.class.getName()).log(Level.SEVERE, null, ex);
           }
           frm.setVisible(true);
           dispose();
       }else{
           JOptionPane.showMessageDialog(null, "Escolha uma opção!");
       }
       
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(frmAnimeGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAnimeGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAnimeGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAnimeGen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAnimeGen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Acao;
    private javax.swing.JCheckBox Drama;
    private javax.swing.JCheckBox Ecchi;
    private javax.swing.JCheckBox Romance;
    private javax.swing.JCheckBox Shounen;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
