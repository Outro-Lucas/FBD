package VISUAL;

import java.util.logging.Level;
import java.util.logging.Logger;

public class frmPriAdm extends javax.swing.JFrame {

    
    public frmPriAdm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        Painel2 = new javax.swing.JLayeredPane();
        Tela1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuCadUsu = new javax.swing.JMenuItem();
        MenuCadAni = new javax.swing.JMenuItem();
        Out = new javax.swing.JMenu();
        Sair = new javax.swing.JMenuItem();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrador");
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setPreferredSize(new java.awt.Dimension(1280, 720));
        setResizable(false);
        getContentPane().setLayout(null);

        Painel2.setToolTipText("");
        Painel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Painel2.setMaximumSize(new java.awt.Dimension(640, 360));
        Painel2.setMinimumSize(new java.awt.Dimension(640, 360));
        Painel2.setName(""); // NOI18N

        javax.swing.GroupLayout Painel2Layout = new javax.swing.GroupLayout(Painel2);
        Painel2.setLayout(Painel2Layout);
        Painel2Layout.setHorizontalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );
        Painel2Layout.setVerticalGroup(
            Painel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        getContentPane().add(Painel2);
        Painel2.setBounds(640, 0, 640, 360);

        Tela1.setBackground(new java.awt.Color(238, 238, 238));
        Tela1.setForeground(new java.awt.Color(238, 238, 238));
        Tela1.setToolTipText("");
        Tela1.setAlignmentX(0.0F);
        Tela1.setAlignmentY(0.0F);
        Tela1.setDesktopManager(null);
        Tela1.setDragMode(javax.swing.JDesktopPane.OUTLINE_DRAG_MODE);
        Tela1.setFocusCycleRoot(false);
        Tela1.setMaximumSize(new java.awt.Dimension(640, 360));
        Tela1.setMinimumSize(new java.awt.Dimension(640, 360));
        Tela1.setName("FilhodaPuta"); // NOI18N
        Tela1.setOpaque(false);
        getContentPane().add(Tela1);
        Tela1.setBounds(0, 0, 640, 360);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/IMAGEM/tela_admin.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1333, 720);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Cadastrar / Remover");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MenuCadUsu.setText("Usuário");
        MenuCadUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadUsuActionPerformed(evt);
            }
        });
        jMenu1.add(MenuCadUsu);

        MenuCadAni.setText("Anime");
        MenuCadAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuCadAniActionPerformed(evt);
            }
        });
        jMenu1.add(MenuCadAni);

        jMenuBar1.add(jMenu1);

        Out.setForeground(new java.awt.Color(255, 255, 255));
        Out.setText("Opções");

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Out.add(Sair);

        jMenuBar1.add(Out);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed

        System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void MenuCadUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadUsuActionPerformed
        frmCadUsuarios form = null;
        try {
            form = new frmCadUsuarios();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmPriAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.setVisible(true);
        Tela1.add(form);

    }//GEN-LAST:event_MenuCadUsuActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void MenuCadAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuCadAniActionPerformed
        // TODO add your handling code here:
        frmCadAnime formu = null;
        try {
            formu = new frmCadAnime();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(frmPriAdm.class.getName()).log(Level.SEVERE, null, ex);
        }
        formu.setVisible(true);
        Painel2.add(formu);
    }//GEN-LAST:event_MenuCadAniActionPerformed

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
            java.util.logging.Logger.getLogger(frmPriAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPriAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPriAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPriAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmPriAdm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuCadAni;
    private javax.swing.JMenuItem MenuCadUsu;
    private javax.swing.JMenu Out;
    private javax.swing.JLayeredPane Painel2;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JDesktopPane Tela1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
