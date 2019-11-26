package VISUAL;
import DAL.ConectaBd;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class frmGenero extends javax.swing.JFrame {

    Connection conecta;
    PreparedStatement pst;
    ResultSet rs;
    
    public frmGenero() throws ClassNotFoundException {
        initComponents();
        conecta = ConectaBd.conectabd();
        listarAnimes();
    }
    public void listarAnimes(){
	String sql = frmAnimeGen.sql;
	try
	{
		pst = conecta.prepareStatement(sql);
		rs = pst.executeQuery();
		Tabela.setModel(DbUtils.resultSetToTableModel(rs));
		
	}
	catch(SQLException error)
	{
		JOptionPane.showMessageDialog (null, error);
	}
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 90, 500, 90);

        Back.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Back.setText("Voltar a Tela Inicial");
        Back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        getContentPane().add(Back);
        Back.setBounds(160, 280, 180, 30);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Anime Recomendado:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 60, 310, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/paste.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 60, 300, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VISUAL/IMAGEM/tela_6.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 553, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        // TODO add your handling code here:
        frmPriUsu form = new frmPriUsu();
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_BackActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new frmGenero().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(frmGenero.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Back;
    private javax.swing.JTable Tabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
