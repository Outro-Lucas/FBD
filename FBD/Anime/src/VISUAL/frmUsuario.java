package VISUAL;

import DAL.ConectaBd;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class frmUsuario extends javax.swing.JFrame {
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;
    
    
    public frmUsuario() throws ClassNotFoundException {
        initComponents();     
        setLocationRelativeTo(null);
        con = ConectaBd.conectabd();
    }
    public void Logar(){
	String sql = "Select * from usuario where nome = ?";

	try
	{
            pst = con.prepareStatement(sql);            
            pst.setString(1, Nick.getText());

		rs = pst.executeQuery();

		if(rs.next()){
                    	//JOptionPane.showMessageDialog(null, "YES");
			frmPriUsu frm = new frmPriUsu();
                        frm.setVisible(true);
                        dispose();
		}else{
			JOptionPane.showMessageDialog(null, "Usuário Inexistente!");
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

        Txt = new javax.swing.JLabel();
        Nick = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Login Usuario");
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        Txt.setBackground(new java.awt.Color(255, 255, 255));
        Txt.setFont(new java.awt.Font("Courier 10 Pitch", 1, 24)); // NOI18N
        Txt.setForeground(new java.awt.Color(255, 255, 255));
        Txt.setText("Insira seu nick:");
        getContentPane().add(Txt);
        Txt.setBounds(40, 150, 250, 29);

        Nick.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        getContentPane().add(Nick);
        Nick.setBounds(270, 150, 204, 30);

        Enter.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Enter.setText("Entrar");
        Enter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });
        getContentPane().add(Enter);
        Enter.setBounds(190, 190, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/paste.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 150, 240, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/tela_3.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        // TODO add your handling code here:
        Logar();
    }//GEN-LAST:event_EnterActionPerformed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmUsuario().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Enter;
    private javax.swing.JTextField Nick;
    private javax.swing.JLabel Txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
