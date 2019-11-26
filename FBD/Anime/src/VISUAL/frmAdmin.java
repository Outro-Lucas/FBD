package VISUAL;

import DAL.ConectaBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmAdmin extends javax.swing.JFrame {
    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public frmAdmin() throws ClassNotFoundException {
        initComponents();
        setLocationRelativeTo(null);
        con = ConectaBd.conectabd();
    }

    public void Logar(){
	String sql = "Select * from administrador where codigo = ? and senha = ?";

	try
	{
            pst = con.prepareStatement(sql);            
            pst.setString(1, Nick.getText());
            pst.setString(2, Senha.getText());

		rs = pst.executeQuery();

		if(rs.next()){
                    
                    frmPriAdm frm = new frmPriAdm();
                    frm.setVisible(true);
                    dispose();
                    
		}else{
			JOptionPane.showMessageDialog(null, "Usuário uu Senha inválidos.");
		}
	}
	catch(SQLException error)
	{
                        JOptionPane.showMessageDialog(null, error);
	}
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Nick = new javax.swing.JTextField();
        Senha = new javax.swing.JPasswordField();
        Enter = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Admin");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        setSize(new java.awt.Dimension(500, 400));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Senha:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 180, 110, 40);

        Nick.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        getContentPane().add(Nick);
        Nick.setBounds(240, 140, 204, 40);

        Senha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Senha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SenhaActionPerformed(evt);
            }
        });
        getContentPane().add(Senha);
        Senha.setBounds(240, 180, 204, 40);

        Enter.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Enter.setText("Entrar");
        Enter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        getContentPane().add(Enter);
        Enter.setBounds(200, 220, 110, 50);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/paste.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(130, 180, 110, 40);

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Código:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(130, 140, 110, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/paste.png"))); // NOI18N
        jLabel6.setText("jLabel4");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 140, 110, 40);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/IMAGEM/tela_4.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        // TODO add your handling code here:
        Logar();
    }//GEN-LAST:event_EnterActionPerformed

    private void SenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SenhaActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmAdmin().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmAdmin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JTextField Nick;
    private javax.swing.JPasswordField Senha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
