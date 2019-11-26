package VISUAL;
import DAL.ConectaBd;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class frmCadUsuarios extends javax.swing.JInternalFrame {
    
    Connection conecta;
    PreparedStatement pst;
    ResultSet rs;
    
    
    public frmCadUsuarios() throws ClassNotFoundException {
        initComponents();
        conecta = ConectaBd.conectabd();
        listarUsuarios();
    }
    
    public void listarUsuarios(){
	String sql = "select * from usuario";
	try
	{
		pst = conecta.prepareStatement(sql);
		rs = pst.executeQuery();
		tblUsuarios.setModel(DbUtils.resultSetToTableModel(rs));
		
	}
	catch(SQLException error)
	{
		JOptionPane.showMessageDialog (null, error);
	}
}

   public void cadastrarUsuarios(){
        String sql;
        sql = "insert into usuario (nome) values (?)";
        try
	{
            pst = conecta.prepareStatement(sql);
            pst.setString(1, TxtNome.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
            listarUsuarios();
		//pst.executeQuery(sql);
	}
	catch(SQLException error)
	{
                        JOptionPane.showMessageDialog(null, error);
	}
    }
   
   public void mostrar(){
       int seleciona = tblUsuarios.getSelectedRow();
       TxtCodigo.setText(tblUsuarios.getModel().getValueAt(seleciona, 0).toString());
       TxtNome.setText(tblUsuarios.getModel().getValueAt(seleciona, 1).toString());
       
   }
   
   public void editar(){
       
       String sql = "Update usuario set nome = ? where idusuario = ?";
       try
       {
           pst = conecta.prepareStatement(sql);
           pst.setString(1, TxtNome.getText());
           pst.setInt(2, Integer.parseInt(TxtCodigo.getText()));
           pst.executeUpdate();
           JOptionPane.showMessageDialog(null, "Cadastro Atualizado com Sucesso!");
           listarUsuarios();
       }
       catch(SQLException error)
       {
            JOptionPane.showMessageDialog(null, error);
       }
   }
      public void remover(){
       String sql = "delete from usuario where idusuario=?";
       
       try
       {
           pst = conecta.prepareStatement(sql);
           pst.setInt(1, Integer.parseInt(TxtCodigo.getText())); 
           pst.execute();
           listarUsuarios();
           JOptionPane.showMessageDialog(null, "Removido com Sucesso!");
       }
       catch(SQLException error)
       {
           JOptionPane.showMessageDialog(null, error);
       }
       
   }
      
   public void limpar(){
       TxtCodigo.setText("");
       TxtNome.setText("");
   }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TxtNome = new javax.swing.JTextField();
        BtCadastro = new javax.swing.JButton();
        BtEditar = new javax.swing.JButton();
        BtRemove = new javax.swing.JButton();
        BtLimpa = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.white);
        setTitle("Cadastro Usuario");
        setEnabled(false);
        setMaximumSize(new java.awt.Dimension(640, 360));
        setMinimumSize(new java.awt.Dimension(640, 360));
        setName("Cadastrar Usuário"); // NOI18N
        setPreferredSize(new java.awt.Dimension(640, 360));

        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
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
        tblUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblUsuarios);

        jLabel1.setText("Código:");

        jLabel2.setText("Nome:");

        BtCadastro.setText("Cadastrar");
        BtCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtCadastroActionPerformed(evt);
            }
        });

        BtEditar.setText("Editar");
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });

        BtRemove.setText("Remover");
        BtRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtRemoveActionPerformed(evt);
            }
        });

        BtLimpa.setText("Limpar");
        BtLimpa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtLimpaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BtCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(BtEditar)
                .addGap(54, 54, 54)
                .addComponent(BtRemove)
                .addGap(54, 54, 54)
                .addComponent(BtLimpa))
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(178, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BtCadastro, BtEditar, BtLimpa, BtRemove});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(TxtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtCadastro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtLimpa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtCadastroActionPerformed
        // TODO add your handling code here:
      cadastrarUsuarios();
    }//GEN-LAST:event_BtCadastroActionPerformed

    private void tblUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblUsuariosMouseClicked
        // TODO add your handling code here:
        mostrar();
    }//GEN-LAST:event_tblUsuariosMouseClicked

    private void BtLimpaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtLimpaActionPerformed
        // TODO add your handling code here:
        limpar();
    }//GEN-LAST:event_BtLimpaActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        // TODO add your handling code here:
        editar();
    }//GEN-LAST:event_BtEditarActionPerformed

    private void BtRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtRemoveActionPerformed
        // TODO add your handling code here:
        remover();
    }//GEN-LAST:event_BtRemoveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtCadastro;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton BtLimpa;
    private javax.swing.JButton BtRemove;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables

}
