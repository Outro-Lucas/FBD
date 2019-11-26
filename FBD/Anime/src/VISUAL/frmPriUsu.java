package VISUAL;

import java.util.logging.Level;
import java.util.logging.Logger;

public class frmPriUsu extends javax.swing.JFrame {

    public frmPriUsu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Botao2 = new javax.swing.JButton();
        Botao1 = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jDesktopPane2 = new javax.swing.JDesktopPane();
        jDesktopPane3 = new javax.swing.JDesktopPane();
        jDesktopPane4 = new javax.swing.JDesktopPane();
        jDesktopPane5 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Recomende um anime");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        Botao2.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        Botao2.setText("Recomendação por Gênero");
        Botao2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Botao2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao2ActionPerformed(evt);
            }
        });
        getContentPane().add(Botao2);
        Botao2.setBounds(90, 210, 330, 50);

        Botao1.setFont(new java.awt.Font("Liberation Mono", 1, 18)); // NOI18N
        Botao1.setText("Recomendação Aleatória");
        Botao1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Botao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Botao1ActionPerformed(evt);
            }
        });
        getContentPane().add(Botao1);
        Botao1.setBounds(90, 90, 330, 50);
        getContentPane().add(jDesktopPane1);
        jDesktopPane1.setBounds(455, 126, 0, 0);
        getContentPane().add(jDesktopPane2);
        jDesktopPane2.setBounds(456, 126, 0, 0);
        getContentPane().add(jDesktopPane3);
        jDesktopPane3.setBounds(457, 126, 0, 0);
        getContentPane().add(jDesktopPane4);
        jDesktopPane4.setBounds(458, 126, 0, 0);
        getContentPane().add(jDesktopPane5);
        jDesktopPane5.setBounds(459, 126, 0, 0);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/IMAGEM/tela_2.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setPreferredSize(new java.awt.Dimension(500, 400));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 520, 400);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Opções");

        jMenuItem1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Botao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao1ActionPerformed
        // TODO add your handling code here:
        frmAnimeAle form = null;
        try {
            form = new frmAnimeAle();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmPriUsu.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void Botao2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Botao2ActionPerformed
        // TODO add your handling code here:
        frmAnimeGen form = new frmAnimeGen();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_Botao2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPriUsu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Botao1;
    private javax.swing.JButton Botao2;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JDesktopPane jDesktopPane2;
    private javax.swing.JDesktopPane jDesktopPane3;
    private javax.swing.JDesktopPane jDesktopPane4;
    private javax.swing.JDesktopPane jDesktopPane5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables
}
