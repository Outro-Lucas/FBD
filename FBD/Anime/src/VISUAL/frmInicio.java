package VISUAL;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmInicio extends javax.swing.JFrame {

    public frmInicio() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Cx1 = new javax.swing.JCheckBox();
        Cx2 = new javax.swing.JCheckBox();
        Btt_entrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tela Inicial");
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Liberation Mono", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tipo de conta:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(280, 120, 220, 28);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/IMAGEM/1_TelaInicial.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 130, 340, 290);

        Cx1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cx1.setForeground(new java.awt.Color(255, 255, 255));
        Cx1.setText("Usuário");
        Cx1.setContentAreaFilled(false);
        Cx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cx1ActionPerformed(evt);
            }
        });
        getContentPane().add(Cx1);
        Cx1.setBounds(330, 200, 130, 40);

        Cx2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Cx2.setForeground(new java.awt.Color(255, 255, 255));
        Cx2.setText("Admin");
        Cx2.setContentAreaFilled(false);
        Cx2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cx2ActionPerformed(evt);
            }
        });
        getContentPane().add(Cx2);
        Cx2.setBounds(330, 160, 100, 40);

        Btt_entrar.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        Btt_entrar.setText("Entrar");
        Btt_entrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        Btt_entrar.setBorderPainted(false);
        Btt_entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btt_entrarActionPerformed(evt);
            }
        });
        getContentPane().add(Btt_entrar);
        Btt_entrar.setBounds(330, 260, 109, 49);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/paste.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 110, 240, 210);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/IMAGEM/test1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btt_entrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btt_entrarActionPerformed
        if(Cx1.isSelected()){
            frmUsuario frm = null;
            try {
                frm = new frmUsuario();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            frm.setVisible(true);
            dispose();
        }
        else if(Cx2.isSelected()){
            frmAdmin frm = null;
            try {
                frm = new frmAdmin();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(frmInicio.class.getName()).log(Level.SEVERE, null, ex);
            }
            frm.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Escolha uma opção!");
        }
    }//GEN-LAST:event_Btt_entrarActionPerformed

    private void Cx2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cx2ActionPerformed
        // TODO add your handling code here:
        Cx1.setSelected(false);
    }//GEN-LAST:event_Cx2ActionPerformed

    private void Cx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cx1ActionPerformed
        // TODO add your handling code here:
        Cx2.setSelected(false);
    }//GEN-LAST:event_Cx1ActionPerformed

    
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btt_entrar;
    private javax.swing.JCheckBox Cx1;
    private javax.swing.JCheckBox Cx2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
