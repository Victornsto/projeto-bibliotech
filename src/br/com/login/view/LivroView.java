/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.login.view;

import br.com.livro.model.Livro;
import br.com.login.controller.LivroController;
import br.com.login.model.Usuario;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Dev74
 */
public class LivroView extends javax.swing.JFrame {
    
    public LivroView() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jTableLivros.getModel();
        jTableLivros.setRowSorter(new TableRowSorter(modelo));
        lerTable();
    }
    
    public void lerTable() {
        DefaultTableModel modelo = (DefaultTableModel) jTableLivros.getModel();
        modelo.setNumRows(0);
        LivroController livroCrl = new LivroController();
        try {
            for(Livro l : livroCrl.listarLivros()){
                modelo.addRow(new Object [] {
                    l.getLivroId(),
                    l.getNome_livro(),
                    l.getNome_autor(),
                    l.getData_cad(),
                    l.getNome_user(),
                    l.getUseId()
                    
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(LivroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Usuario usuario = new Usuario();
    

    /*public JLabel getjLabelUserId() {
        return jLabelUserId;
    }

    public void setjLabelUserId(JLabel jLabelUserId) {
        this.jLabelUserId = jLabelUserId;
    }*/
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLivros = new javax.swing.JTable();
        jButtonCadastrar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldAutor = new javax.swing.JTextField();
        jLabelNomeUser = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelUserId = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1200, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableLivros.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableLivros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Titulo", "Autor", "Data do Cadastro", "Usuario", "ID usuario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableLivros.setColumnSelectionAllowed(true);
        jTableLivros.setPreferredSize(new java.awt.Dimension(1200, 600));
        jTableLivros.setRequestFocusEnabled(false);
        jTableLivros.getTableHeader().setReorderingAllowed(false);
        jTableLivros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableLivrosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableLivros);
        jTableLivros.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTableLivros.getColumnModel().getColumnCount() > 0) {
            jTableLivros.getColumnModel().getColumn(0).setResizable(false);
            jTableLivros.getColumnModel().getColumn(1).setResizable(false);
            jTableLivros.getColumnModel().getColumn(2).setResizable(false);
            jTableLivros.getColumnModel().getColumn(3).setResizable(false);
            jTableLivros.getColumnModel().getColumn(4).setResizable(false);
            jTableLivros.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, 620, 390));

        jButtonCadastrar.setContentAreaFilled(false);
        jButtonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 100, 50));

        jButtonExcluir.setContentAreaFilled(false);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 460, 80, 50));

        jButtonEditar.setContentAreaFilled(false);
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 100, 50));

        jTextFieldNome.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 250, 30));

        jTextFieldAutor.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldAutor, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 250, 30));

        jLabelNomeUser.setFont(new java.awt.Font("Open Sans", 2, 25)); // NOI18N
        jLabelNomeUser.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jLabelNomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 180, 40));

        jLabel6.setFont(new java.awt.Font("Open Sans Light", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Autor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, 70, 80));

        jLabel5.setFont(new java.awt.Font("Open Sans Light", 1, 25)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Título");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, 70, 80));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/LivrosView.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, -1, -1));
        getContentPane().add(jLabelUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 20, 40, 20));

        jButton1.setText("Listar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LivroController livroCrl = new LivroController();
        Livro livro = new Livro();
        DefaultTableModel modelo = (DefaultTableModel) jTableLivros.getModel();
        modelo.setNumRows(0);
        try {
            for(Livro l : livroCrl.listarLivros()){
                modelo.addRow(new Object [] {
                    l.getLivroId(),
                    l.getNome_livro(),
                    l.getNome_autor(),
                    l.getData_cad(),
                    l.getNome_user(),
                    l.getUseId()
                    
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(LivroView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarActionPerformed
        LivroController livroCrl = new LivroController();
        Livro livro = new Livro();
        String nome = jTextFieldNome.getText();
        String autor = jTextFieldAutor.getText();
        if ("".equals(nome)) {
            JOptionPane.showMessageDialog(null, "Titulo vazio! Preencha todos os campos!");
        } else{
            if ("".equals(autor)){
                JOptionPane.showMessageDialog(null, "Autor vazio! Preencha todos os campos!");
            } else{
               
            try {
                livro.setNome_livro(nome);
                livro.setNome_autor(autor);
                livro.setUseId(jLabelUserId.getText());
                System.out.println(livro.getNome_livro()+" / "+livro.getNome_autor()+" / "+livro.getUseId());
                livroCrl.cadastarLivros(livro.getNome_livro(), livro.getNome_autor(), livro.getUseId() );
                jTextFieldNome.setText("");
                jTextFieldAutor.setText("");
                this.lerTable();
            } catch (SQLException ex) {
            Logger.getLogger(LivroView.class.getName()).log(Level.SEVERE, null, ex);
            } 
          }
                
            
        }
            
        
    }//GEN-LAST:event_jButtonCadastrarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        LivroController livroCrl = new LivroController();
        Livro livro = new Livro();
        int pos = jTableLivros.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jTableLivros.getModel();
        
        String codUser = (String) jLabelUserId.getText();
        String userCad = (String) modelo.getValueAt(pos, 5);
        System.out.println("Código do usuário = "+codUser+" / "+"codigo do usuarioCad = "+userCad);
        if (!"1".equals(codUser) && !codUser.equals(userCad)) {
            JOptionPane.showMessageDialog(null, "Não autorizado!");
        } else {
            String nome = jTextFieldNome.getText();
            String autor = jTextFieldAutor.getText();
            String livroId = (String) modelo.getValueAt(pos, 0);
            System.out.println(nome+" / "+autor+" / "+livroId);
            livro.setNome_livro(nome);
            livro.setNome_autor(autor);
            livro.setLivroId(livroId);
            System.out.println(livro.getNome_livro()+" / "+livro.getNome_autor()+" / "+livro.getUseId());
            try {
                livroCrl.editarLivros(livro );
            } catch (SQLException ex) {
                Logger.getLogger(LivroView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextFieldNome.setText("");
            jTextFieldAutor.setText("");
            this.lerTable();
            
        
        //Livro livroAtualizar = pos.get
        }   
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTableLivrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableLivrosMouseClicked
        int pos = jTableLivros.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jTableLivros.getModel();
        jTextFieldNome.setText((String) modelo.getValueAt(pos, 1));
        jTextFieldAutor.setText((String) modelo.getValueAt(pos, 2));
    }//GEN-LAST:event_jTableLivrosMouseClicked

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        LivroController livroCrl = new LivroController();
        Livro livro = new Livro();
        int pos = jTableLivros.getSelectedRow();
        DefaultTableModel modelo = (DefaultTableModel) jTableLivros.getModel();
        
        String codUser = (String) jLabelUserId.getText();
        String userCad = (String) modelo.getValueAt(pos, 5);
        System.out.println("Código do usuário = "+codUser+" / "+"codigo do usuarioCad = "+userCad);
        if (!"1".equals(codUser) && !codUser.equals(userCad)) {
            JOptionPane.showMessageDialog(null, "Não autorizado!");
        } else {
            String nome = jTextFieldNome.getText();
            String autor = jTextFieldAutor.getText();
            String livroId = (String) modelo.getValueAt(pos, 0);
            System.out.println(nome+" / "+autor+" / "+livroId);
            livro.setNome_livro(nome);
            livro.setNome_autor(autor);
            livro.setLivroId(livroId);
            System.out.println(livro.getNome_livro()+" / "+livro.getNome_autor()+" / "+livro.getUseId());
            try {
                livroCrl.excluirLivro(livro.getLivroId());
            } catch (SQLException ex) {
                Logger.getLogger(LivroView.class.getName()).log(Level.SEVERE, null, ex);
            }
            jTextFieldNome.setText("");
            jTextFieldAutor.setText("");
            this.lerTable();
            
        }  
    }//GEN-LAST:event_jButtonExcluirActionPerformed
    

    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String args[]) throws SQLException {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivroView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivroView().setVisible(true);
            }
        });
    }
public void exportarUser(Usuario user) {
        jLabelUserId.setText(String.valueOf(user.getUserId()));
        jLabelNomeUser.setText(user.getNome());
        System.out.println("Usuario "+user.getNome()+" com Id: "+user.getUserId());
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonCadastrar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelNomeUser;
    private javax.swing.JLabel jLabelUserId;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableLivros;
    private javax.swing.JTextField jTextFieldAutor;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
